package hello;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity // This tells Hibernate to make a table out of this class
public class Address
{
    @Id
    private Integer id;
    private String  street;
    private String  city;
    private String state;
    private String zip;
    public Integer getId ()
    {
        return id;
    }
    public void setId (Integer id)
    {
        this.id = id;
    }
    public String getStreet ()
    {
        return street;
    }
    public void setStreet (String street)
    {
        this.street = street;
    }
    public String getCity ()
    {
        return city;
    }
    public void setCity (String city)
    {
        this.city = city;
    }
    public String getState ()
    {
        return state;
    }
    public void setState (String state)
    {
        this.state = state;
    }
    public String getZip ()
    {
        return zip;
    }
    public void setZip (String zip)
    {
        this.zip = zip;
    }
}