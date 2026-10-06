package uk.ac.westminster.products_api;

public class Costomer {
    private long id;
    private String name;
    private String email;
    private Address address;

    public Costomer(){}

    public Costomer(Long id, String name, String email, Address address){
        this.id=id;
        this.name=name;
        this.email=email;
        this.address=address;
    }

    public Long getId(){return id;}

    public String getName(){return name;}

    public String getEmail(){return email;}

    public Address getAddress(){return address;}


}
