package dominio;

import java.util.Scanner;

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
    
    public static PersonType CreatePersonType(){
        Scanner personScanner = new Scanner(System.in); 
        

        System.out.println("Are you an individual or legal entity? 1)LEGAL PERSON 2)PYSICAL PERSON");
        Integer inputValue =personScanner.nextInt();
        
        PersonType personTypeCustormes;
        if(inputValue==1){
            personTypeCustormes=PersonType.LEGAL_PERSON;

        }else if(inputValue==2){
            personTypeCustormes=PersonType.PHYSICAL_PERSON;
        }else{
            personTypeCustormes=PersonType.UNDEFINED;
        }
        
        return personTypeCustormes;
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