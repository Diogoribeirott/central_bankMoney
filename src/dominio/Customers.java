package dominio;

import java.util.List;
import java.util.Scanner;


public class Customers  extends Person { 

    private BankAccount bankAccount;
 
    public Customers(String name, String cpf, int age, String road, int house, PersonType personType,BankAccount bankAccount) {
      super(name, cpf, age, road, house, personType);
      this.bankAccount=bankAccount;
    }


    public static  Customers CreateCustomers(List<Customers> customers){
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your name?");
        String nameCustomers =scan.nextLine();
        
        boolean anyMatchResult = false;
        String cpfCustomers;
        do{
          System.out.println("Type your CPF");
          String inputCpf =scan.nextLine();
            
          anyMatchResult = customers.stream().anyMatch(c -> c.cpf.equals(inputCpf));

          if(anyMatchResult){
            System.out.println("CPF Already Saved");
          }
            
          cpfCustomers=inputCpf;

        }while(anyMatchResult);
        

        System.out.println("Type your Adrress:" );
        String roadCustomers =scan.nextLine();

        System.out.println("Type number your House:");
        int houseCustomers =scan.nextInt();

        System.out.println("Type your Age:");
        int ageCustomers =scan.nextInt();

        PersonType personTypeCustormes= Customers.CreatePersonType();
        BankAccount bankAccount=BankAccount.createTypeBankAccount();

        return new Customers(nameCustomers, cpfCustomers, ageCustomers, roadCustomers, houseCustomers, personTypeCustormes,bankAccount);
      }
    
      @Override
      public boolean equals(Object obj) {
        if(obj== null) return false;
        if(obj == this) return true;
        if(getClass() !=obj.getClass()) return false;
        Customers client = (Customers) obj;
        return getName() != null && getCpf() != null &&  getName().equals(client.name) && getCpf().equals(client.cpf);
      }
      
       @Override
    public String toString() {
        return "\n\nBank Account:" +
                "\nCustomers: " + name +
                "\nType Person: " + personType +
                "\nAge: " + age +
                "\nAddress: " + road +
                "\nNumber: " + house +
                "\nAccount:" + bankAccount.toString();
    }

 
}