package test;





import java.util.ArrayList;
import java.util.List;

import dominio.AccountType;
import dominio.Bank;
import dominio.BankAccount;
import dominio.Customers;
import dominio.PersonType;


public class testCustomers {
    
    public static void main(String[] args) throws IllegalAccessException {
<<<<<<< HEAD
   
=======
      Bank bank = new Bank();
      List<Customers> customersList = new ArrayList<>();
      //create Bank Account
      BankAccount bankAccount1 = new BankAccount(AccountType.CURRENT_ACCOUNT, 0001l);
      //add Bank Account for client1
      customersList.add(new Customers("marinay", "4854848" , 19, "quadra5", 5, PersonType.LEGAL_PERSON,bankAccount1));
      //create Bank Account
      BankAccount bankAccount2 = new BankAccount(AccountType.SAVINGS_ACCOUNT, 0002l);
      //add Bank Account for client2
      customersList.add(new Customers("Diogo", "4854848" , 22, "quadra1", 5, PersonType.PHYSICAL_PERSON,bankAccount2));
      //create Bank Account
      BankAccount bankAccount3 = new BankAccount(AccountType.UNDEFINER, 0003l);
      //add Bank Account for client3
      customersList.add(new Customers("Camila", "4854848" , 30, "quadra9", 5, PersonType.UNDEFINER,bankAccount3));
      Customers pessoa1 = new Customers("diogo", "54848", 22, "quadra5", 548,PersonType.LEGAL_PERSON, bankAccount3);
      System.out.println("-------------------");
     System.out.println( bankAccount3.setBankNumber(25l));
     System.out.println("-------------------");


      bank.setCustomers(customersList);
      bank.ShowCustomers();
>>>>>>> 20c16b983f9251e37110ee624f0117662d4ab184
     
      
    
      //
      
      

     
        
      }


      

      

    }
  

      
    
