package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;


public class Bank  {
  
  public  List<Customers> customers = new ArrayList<>();
  private String address= "Road : Diagon Alley" ;
  private PersonType personType = PersonType.LEGAL_PERSON;
  private  String name = "Bank center";
  
  @Override
  public String toString() {
    
    return "Bank :" +name+ "\n"+
    "Address: "+address ;
  }

    public void setCustomers(List<Customers> customers) {
        this.customers=customers;
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
    


  public  void ShowCustomers(){
        
        for (Customers client : this.customers) {
            System.out.println(client);
            System.out.println("-----------------------");
        }
  }
  public Optional<Customers> findCustomerByCPF(String cpf){
  return findCustomres(customer -> customer.getCpf().equals(cpf));
  }
  public Optional<Customers>  findCustomres(Predicate<Customers> precidate){
    Customers client = null;
    for (Customers customer : customers) {
      if(precidate.test(customer)){
        client =customer;
      }  
    }
    return Optional.ofNullable(client);
  }

/**
 * 
 */
public  void menu(){

    try (Scanner scan = new Scanner(System.in)) {
      int opcao;
      do{
          System.out.println("BANK: "+name+
          "\n--------------Menu-------------"+
          "\n1-Show Customers"+
          "\n2-Create Customer"+
          "\n3-Find Customer"+
          "\n4-Exit");
          opcao=scan.nextInt();
      switch(opcao){
          case 1:
          ShowCustomers();
          break;
          case 2:
         Customers x=Customers.CreateCustomers();
         customers.add(x);
          break;
          case 3:
          System.out.println("Type CPF:");
         String cpf = scan.next();
         System.out.println(findCustomerByCPF(cpf).orElseThrow(() ->new IllegalArgumentException("This customer is not registered in our database")));
          break;
          case 4:
          System.out.println("Closing Bank");
          break;

      }

      }while(opcao!=4);

    }catch (IllegalArgumentException e) {
      e.printStackTrace();
      System.out.println("ERRO VALOR DE ENTRADA INVALIDA:" + e.getMessage());
      
     
    }
  
  }

}
