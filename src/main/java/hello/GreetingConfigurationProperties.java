package hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("greeting")
public class GreetingConfigurationProperties
{
    /** The prefix for the greeting, defaults to "Hello, ". */
    private String prefix = "Hello, ";
    
    /** The suffix for the greeting, defaults to "!". */
    private String suffix = "!";

    public String getPrefix ()
    {
        return prefix;
    }

    public void setPrefix (String prefix)
    {
        this.prefix = prefix;
    }

    public String getSuffix ()
    {
        return suffix;
    }

    public void setSuffix (String suffix)
    {
        this.suffix = suffix;
    }
    
    
}
