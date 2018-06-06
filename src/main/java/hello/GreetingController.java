package hello;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class GreetingController
{
    private String template = "Hello, %s!";
    private final AtomicLong    counter;

    public GreetingController (GreetingConfigurationProperties configuration, MeterRegistry registry) {
        if (configuration != null) {
            template = configuration.getPrefix () + "%s" + configuration.getSuffix ();
        }
        this.counter = registry.gauge("greeting.count", new AtomicLong(0));
    }
    
    @RequestMapping("/greeting")
    public Greeting greeting (
            @RequestParam(value = "name", defaultValue = "World") String name)
    {
        return new Greeting (counter.incrementAndGet (),
                String.format (template, name));
    }
}
