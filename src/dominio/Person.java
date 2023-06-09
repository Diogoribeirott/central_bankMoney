package dominio;



abstract class Person extends Address {
  protected String name;
  protected String cpf;
  protected int age;
  protected Address address;
  protected PersonType personType;
   

    
  public Person(String name, String cpf, int age, String road, int house,PersonType personType) {
    super(road, house);
    this.name = name;
    this.cpf = cpf;
    this.age = age;
    this.personType= personType;
   
  }
    
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }


   
    public Address getAddress() {
        return address;
    }

   
    public void setAddress(Address address) {
        this.address = address;
    }


   
    public PersonType getPersonType() {
        return personType;
    }

    
    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

}