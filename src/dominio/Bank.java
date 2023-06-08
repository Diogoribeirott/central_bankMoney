package dominio;
import java.util.List;



public class Bank {
  public List<Customers> customers ;
  private String address= "Road : Diagon Alley" ;
  private PersonType personType = PersonType.LEGAL_PERSON;
  private String name = "Bank center";
    
  
    public void ShowCustomers(){
        
        for (Customers client : customers) {
            System.out.println(client);
            System.out.println("-----------------------");

            
        }

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

}