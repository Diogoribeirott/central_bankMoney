package dominio;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.function.Predicate;


public class Bank  {


        private  String name = "Bank center";
        private String address= "Road : Diagon Alley" ;
        private PersonType personType;
        public  List<Customers> customers;
  


     public Bank(String address, PersonType personType, String name) {
        this.customers = new ArrayList<>();
        this.address = address;
        this.personType = personType;
        this.name = name;
    }
    public List<Customers> getCustomers() {
      return customers;
    }

    public String getAddress() {
      return address;
    }

     public PersonType getPersonType() {
      return personType;
    }

    public String getName() {
      return name;
    }
    
    public Customers findCustomerByCPF(String cpf){
      return findCustomres(c -> c.getCpf().equals(cpf));
    }
    public Customers  findCustomres(Predicate<Customers> predicate){
        Customers client = null;

        for (Customers customer : customers) {
          if(predicate.test(customer)){
            client =customer;
        }  
      }
      return client;
    }

    public void deleteCustomer(String cpf){
      Customers customersFound = findCustomerByCPF(cpf);

      customers.remove(customersFound);

    }

    public  void menu(){

      try (Scanner scan = new Scanner(System.in)) {

        int opcao;

        do{
            System.out.println("BANK: "+name+
            "\n--------------Menu-------------"+
            "\n1-Show Customers"+
            "\n2-Create Customer"+
            "\n3-Find Customer"+
            "\n4-Delete Customer"+
            "\n5-Exit");

            opcao=scan.nextInt();
        switch(opcao){

            case 1:
              customers.forEach(System.out::println);
              break;
            case 2:
               Customers customer=Customers.CreateCustomers(customers);
               customers.add(customer);
              break;
            case 3:
               System.out.println("Type CPF:");
               Customers customersByCPF = findCustomerByCPF(scan.next());

              if(customersByCPF==null){
                System.out.println("Customer Doesn't Exist");
              break;
              }

               System.out.println(customersByCPF);
              break;
            case 4:
            System.out.println("Type CPF:");
            deleteCustomer(scan.next());
              break;
            case 5:
            System.out.println("Closing Bank");
              break;

        }

        }while(opcao!=5);

      }catch (IllegalArgumentException e) {
        e.printStackTrace();
        System.out.println("Error, Invalid input type: " + e.getMessage());
        
      
      }
  
  }

    @Override
    public String toString() {
      return "Bank: "+ name + 
      "\n address:" + address + 
      "\n Type:" + personType;
    }

}
