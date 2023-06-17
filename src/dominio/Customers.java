package dominio;

import java.util.Scanner;

public class Customers  extends Person implements Comparable<Customers>{
  private BankAccount bankAccount;
  //////////////////
  public Customers(String name, String cpf, int age, String road, int house, PersonType personType,BankAccount bankAccount) {

    super(name, cpf, age, road, house, personType);
    this.bankAccount=bankAccount;
    
  }
   //////////////////
    public BankAccount getBankAccount() {
        return bankAccount;
    }

  ////////////////// 
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
  ////////////////////////////////

  ///////////////////////////////
  @Override
  public String toString() {
    
    return "Bank Account:" + "\n"+
    "Customers: "+name+"\n"+
    "Type Person: "+personType+ "\n"+
    "Age: "+age+ "\n"+
    "Address: "+road+
    "\nNumber: "+house+""+
    "\nAccount:"+
    bankAccount.toString()+""
    ;
  }
 
    @Override
    public boolean equals(Object obj) {
      if(obj== null) return false;
      if(obj == this) return true;
      if(getClass() !=obj.getClass()) return false;
      Customers client = (Customers) obj;
      return getName() != null && getCpf() != null &&  getName().equals(client.name) && getCpf().equals(client.cpf);
    }

    ///////////////////////
    @Override
    public int compareTo(Customers client) {
      return getName().compareTo(client.getName());
      
    }
public static  Customers CreateCustomers(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Type your name?");
    String nameCustomers =teclado.nextLine();
    System.out.println("Type your CPF");
    String cpfCustomers =teclado.nextLine();
    System.out.println("Type your Adrress:" );
    String roadCustomers =teclado.nextLine();
    System.out.println("Type number your House:");
    int houseCustomers =teclado.nextInt();
    System.out.println("Type your Age:");
    int ageCustomers =teclado.nextInt();
    PersonType personTypeCustormes= Customers.CreatePersonType();
    BankAccount bankAccount=BankAccount.createTypeBankAccount();
    return new Customers(nameCustomers, cpfCustomers, ageCustomers, roadCustomers, houseCustomers, personTypeCustormes,bankAccount);
  }
    
}