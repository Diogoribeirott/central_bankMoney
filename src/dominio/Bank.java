package dominio;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
=======
import java.util.List;
>>>>>>> 20c16b983f9251e37110ee624f0117662d4ab184



public class Bank {
<<<<<<< HEAD
  public static List<Customers> customers = new ArrayList<>(); ;
  private String address= "Road : Diagon Alley" ;
  private PersonType personType = PersonType.LEGAL_PERSON;
  private String name = "Bank center";

  @Override
  public String toString() {
    
    return "Bank :" +name+ "\n"+
    "Address: "+address ;
  }

  public static Customers CreateCustomers(){
    

   Scanner teclado = new Scanner(System.in);
    System.out.println("NAME");
    String nameCustomers =teclado.nextLine();
    System.out.println("cpf");
    String cpfCustomers =teclado.nextLine();
    System.out.println("road");
    String roadCustomers =teclado.nextLine();
    System.out.println("house");
    int houseCustomers =teclado.nextInt();
    System.out.println("age");
    int ageCustomers =teclado.nextInt();
    System.out.println("person type: 1)Legal person 2)PHYSICAL_PERSON");
    String x =teclado.nextLine();
    PersonType personTypeCustormes;
    if(x=="1"){
        personTypeCustormes=PersonType.LEGAL_PERSON;

    }else if(x=="2"){
        personTypeCustormes=PersonType.PHYSICAL_PERSON;
    }else{
        personTypeCustormes=PersonType.UNDEFINER;
    }
    






    
    return new Customers(nameCustomers, cpfCustomers, ageCustomers, roadCustomers, houseCustomers, personTypeCustormes);
  }

    
  
    public static void ShowCustomers(){
=======
  public List<Customers> customers ;
  private String address= "Road : Diagon Alley" ;
  private PersonType personType = PersonType.LEGAL_PERSON;
  private String name = "Bank center";
    
  
    public void ShowCustomers(){
>>>>>>> 20c16b983f9251e37110ee624f0117662d4ab184
        
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

<<<<<<< HEAD
  public static  void menu(){

    Scanner scan = new Scanner(System.in);
    int opcao;
    do{
        System.out.println("Digite 1 2 ou 3 para sair");
        opcao=scan.nextInt();
    switch(opcao){
        case 1:
        Bank.ShowCustomers();
        break;
        case 2:
        
       Customers x=Bank.CreateCustomers();
       customers.add(x);
        break;
        case 3:
        System.out.println("fechando programa");
        break;

    }

    }while(opcao!=3);








    

  }

=======
>>>>>>> 20c16b983f9251e37110ee624f0117662d4ab184
}