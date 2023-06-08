package dominio;

public class BankAccount {
  private AccountType accountType;
  private Long BankBalance;
  private Long BankNumber;
  
  @Override
  public String toString() {
    
    return "Bank Number: "+BankNumber +" \n"+
    "balance: "+BankBalance;
  }

  public BankAccount(AccountType accountType, Long BankNumber){
    this.accountType = accountType;
    if(accountType == AccountType.SAVINGS_ACCOUNT){
      this.BankBalance =  50L; 
      System.out.println("Your bank account has been successfully create!");
      System.out.println("Balance: "+BankBalance);
    }else{
      this.BankBalance =  0l;
      System.out.println("Your bank account has been successfully create and you ");
      System.out.println("Balance: "+BankBalance); 
    }
    this.BankNumber = BankNumber;
  }
   
    
   
    

   
    
  

   
   


  
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

   
    public Long getBankBalance() {
        return BankBalance;
    }

  
    public void setBankBalance(Long BankBalance) {
        this.BankBalance = BankBalance;
    }

    
    public void getBankNumber() {
       
    }

  
    public Long setBankNumber(Long BankNumber) {
       return this.BankNumber += BankNumber;
    }

}