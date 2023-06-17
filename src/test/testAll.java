package test;

import dominio.AccountType;
import dominio.BankAccount;

public class testAll {
    public static void main(String[] args) {
      BankAccount conta = new BankAccount(AccountType.SAVINGS_ACCOUNT, null);
      System.out.println(conta);
    }

  
}