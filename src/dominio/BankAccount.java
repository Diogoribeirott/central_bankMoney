package dominio;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {

    private Long bankBalance;
    private Long accountNumber;
    private Integer bankNumber;
    private AccountType accountType;

    public BankAccount(AccountType accountType, Long accountNumber) {

        this.accountType = accountType;

        if (accountType == AccountType.SAVINGS_ACCOUNT) {
            this.bankBalance = 50L;
            System.out.println("Your bank account has been successfully create!");
            System.out.println("Balance: " + bankBalance);
        } else {
            this.bankBalance = 0L;
            System.out.println("Your bank account has been successfully create and you ");
            System.out.println("Balance: " + bankBalance);
        }

        this.accountNumber = accountNumber;
        this.bankNumber = new Random().nextInt(9000) + 1000;
    }

    public static BankAccount createTypeBankAccount() {
        Scanner scan = new Scanner(System.in);
        BankAccount bankAccount;

        System.out.println("ACCOUNT: ENTER '1' FOR CURRENT OR '2' FOR SAVINGS");
        Integer inputValue = scan.nextInt();

        if (inputValue == 1) {
            bankAccount = new BankAccount(AccountType.SAVINGS_ACCOUNT, null);
        } else {
            bankAccount = new BankAccount(AccountType.CURRENT_ACCOUNT, null);
        }

        bankAccount.accountNumber = 280L;
        return bankAccount;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(Integer bankNumber) {
        this.bankNumber = bankNumber;
    }

    public Long getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(Long bankBalance) {
        this.bankBalance = bankBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Bank Number: " + accountNumber + " \n" +
                "type:" + accountType +
                "\nbalance: " + bankBalance +
                "\nAgency: " + bankNumber;
    }

}