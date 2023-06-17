package test;

import dominio.AccountType;
import dominio.BankAccount;

public class testAll {
    public static void main(String[] args) {
      System.out.println(new BankAccount(AccountType.SAVINGS_ACCOUNT, null));
    }

}