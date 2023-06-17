package test;

import dominio.AccountType;
import dominio.BankAccount;

public class TestAll {
    public static void main(String[] args) {
      BankAccount conta = new BankAccount(AccountType.SAVINGS_ACCOUNT, null);
      System.out.println(conta);
    }


}