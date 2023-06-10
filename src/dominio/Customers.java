package dominio;



public class Customers  extends Person implements Comparable<Customers>{
  private BankAccount bankAccount;
  
  public Customers(String name, String cpf, int age, String road, int house, PersonType personType) {

    super(name, cpf, age, road, house, personType);
    
  }


  @Override
  public String toString() {
    
    return "Bank Account:" + "\n"+
    "Customers: "+name+"\n"+
    "Type Person: "+personType+ "\n"+
    "Age: "+age+ "\n"+
    "Address: "+"\n"+
    "Road: "+road+
    " Number: "+house+""
    ;
  }
    public BankAccount getBankAccount() {
        return bankAccount;
    }

   
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
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
    public int compareTo(Customers client) {
      return getName().compareTo(client.getName());
      
    }

    
}