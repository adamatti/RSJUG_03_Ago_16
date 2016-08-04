class Person {
    private Integer id
    private String name
    private Date createdAt
    private Address address

    public void setId(Integer id){
      this.id = id;
    }

    public Integer getId(){
      return id;
    }

    public void setName(String name){
      this.name = name;
    }

    public String getName(){
      return name;
    }

    public void setCreatedAt(Date createdAt){
      this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
      return this.createdAt
    }

    public void setAddress(Address address){
      this.address = address;
    }

    public Address getAddress(){
      return this.address;
    }

    //Constructor
    //toString
    //hash
}

class Address {
  private String city

  public void setCity(String city){
    this.city = city
  }

  public String getCity(){
    return city;
  }
}

Person adamatti = new Person();
adamatti.setId(1);
adamatti.setName("Marcelo Adamatti");
adamatti.setCreatedAt(new Date());


Address address = new Address();
address.setCity("Little Falls");
adamatti.setAddress(address);

System.out.println ("Hello " + adamatti.getName());
