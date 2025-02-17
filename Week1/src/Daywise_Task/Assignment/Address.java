package Assignment;

import java.util.Objects;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructor
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getters
    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZipCode() { return zipCode; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Address address = (Address) obj;
        return street.equals(address.street) && 
               city.equals(address.city) && 
               state.equals(address.state) && 
               zipCode.equals(address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state, zipCode);
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " - " + zipCode;
    }
}