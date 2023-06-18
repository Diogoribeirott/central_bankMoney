package dominio;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {

    private Long bankBalance;
    private Integer bankNumber;
    private Long accountNumber;
    private AccountType accountType;
    
    

 


    public BankAccount(AccountType accountType, Long accountNumber){

      this.accountType = accountType;
      
      if(accountType == AccountType.SAVINGS_ACCOUNT){
        this.bankBalance =  50L; 
        System.out.println("Your bank account has been successfully create!");
        System.out.println("Balance: "+bankBalance);
      }else{
        this.bankBalance =  0l;
        System.out.println("Your bank account has been successfully create and you ");
        System.out.println("Balance: "+bankBalance); 
      }
      this.accountNumber= accountNumber;
      this.bankNumber = new Random().nextInt(9000) + 1000;
    }
    
  



  public static BankAccount  createTypeBankAccount(){

    Scanner bankScanner = new Scanner(System.in);
    BankAccount bankAccount;
   
    System.out.println("ACCOUNT: "+"\n 1 -CURRENT"+"\n 2- SAVINGS");
    Integer inputValue = bankScanner.nextInt();

    if(inputValue ==1){
     bankAccount = new BankAccount(AccountType.SAVINGS_ACCOUNT, 280L);
     
    }else{
      bankAccount = new BankAccount(AccountType.CURRENT_ACCOUNT, 280L);
    }

    return bankAccount;
  }

  @Override
    public String toString() {
        return "Bank Number: " + accountNumber + " \n" +
                "type:" + accountType +
                "\nbalance: " + bankBalance +
                "\nAgency: " + bankNumber;
    }
   
  
}