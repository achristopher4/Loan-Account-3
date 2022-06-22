/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgrammingAssignment3;

/**
 *
 * @author alexchristopher
 */
public class Address {
    final private String street;
    final private String city;
    final private String state;
    final private String zipcode;
    
    public Address( String street, String city, String state, String zipcode ){
        this.city = city;
        this.street = street;
        this.state = state;
        this.zipcode = zipcode;
    }
    
    public String getStreet() {return street;}
    
    public String getCity() {return city;}
    
    public String getState() {return state;}
    
    public String getZipcode() {return zipcode;}
    
    @Override
    public String toString(){
        return String.format("Property Address:\n\t%s\n\t%s, %s %s", street, city, state, zipcode);
    }
}
