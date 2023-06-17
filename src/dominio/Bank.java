package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;


public class Bank  {
  
  private List<Customers> customers = new ArrayList<>();
  // -> deixei como private por não ser utilizada fora da classe.
  private static final String ADDRESS = "Road : Diagon Alley" ;
  private static final String NAME = "Bank center";
  // -> como essas variáveis não serão alteradas, pode-se utilizar o *static final* demonstrando ser constante e o static para não duplicar esses elementos quando instanciar um novo objeto.
  private PersonType personType = PersonType.LEGAL_PERSON;

  @Override
  public String toString() {
    
    return String.format("Bank: %s %nAddress: %s", NAME, ADDRESS);
            //"Bank :" +name+ "\n"+"Address: "+address;
  }

    public void setCustomers(List<Customers> customers) {
        this.customers=customers;
    } // -> como a lista é publica não precisa de um setter pra ela

    public String getAddress() {
      return ADDRESS;
    }

    public PersonType getPersonType() {
      return personType;
    }

    public String getName() {
      return NAME;
    }
    


  public void ShowCustomers(){
//        for (Customers client : this.customers) {
//            System.out.println(client);
//            System.out.println("-----------------------");
//        }
      customers.forEach(client -> System.out.println(client + "\n-----------------------"));
      // -> sugestão

  }
//  public Optional<Customers> findCustomerByCPF(String cpf){
//
//  return findCustomers(customer -> customer.getCpf().equals(cpf));
//  }

//  public Optional<Customers> findCustomers(Predicate<Customers> precidate){
//    Customers client = null;
//    for (Customers customer : customers) {
//      if(precidate.test(customer)){
//        client =customer;
//      }
//    }
//    return Optional.ofNullable(client);
//  }

    public List<Customers> findCustomerByCPF(String cpf){
        return customers.stream().filter(customer -> customer.getCpf().equals(cpf)).toList();
        // -> sugestão
    }

/**
 * 
 */
public  void menu(){

    try (Scanner scan = new Scanner(System.in)) {
      int opcao;

      do{
          System.out.println("BANK: "+ NAME +
          "\n--------------Menu-------------"+
          "\n1-Show Customers"+
          "\n2-Create Customer"+
          "\n3-Find Customer"+
          "\n4-Exit");
          opcao=scan.nextInt();
      switch(opcao){
          case 1 -> ShowCustomers();
          case 2 -> {
              Customers x = Customers.CreateCustomers();
              customers.add(x);
          }
          case 3 -> {
              System.out.println("Type CPF:");
              String cpf = scan.next();
              List<Customers> filteredCustomers = findCustomerByCPF(cpf);
              if (filteredCustomers.isEmpty()) throw new IllegalArgumentException("This customer is not registered in our database");
              else System.out.println(findCustomerByCPF(cpf));
          }
          case 4 -> System.out.println("Closing Bank");
          default -> System.out.println("Digite um valor válido");
      }

      }while(opcao!=4);

    }catch (IllegalArgumentException e) {
      e.printStackTrace();
      System.out.println("ERRO VALOR DE ENTRADA INVALIDA:" + e.getMessage());
    }
  
  }

}
