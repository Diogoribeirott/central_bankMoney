package dominio;

import java.util.List;
import java.util.Scanner;

public class Customer extends Person implements Comparable<Customer> {

    private BankAccount bankAccount;

    public Customer(String name, String cpf, Integer age, String road, Integer house, PersonType personType, BankAccount bankAccount) {
        super(name, cpf, age, road, house, personType);
        this.bankAccount = bankAccount;
    }

    public static Customer CreateCustomers(List<Customer> customers) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your name?");
        String nameCustomers = scan.nextLine();

        Boolean anyMatchResult = false;
        String cpfCustomers;
        do {
            System.out.println("Type your CPF");
            String inputCPF = scan.nextLine();

            anyMatchResult = customers.stream().anyMatch(c -> c.getCpf().equals(inputCPF));

            if (anyMatchResult) {
                System.out.println("CPF Already Saved");
            }

            cpfCustomers = inputCPF;

        } while (anyMatchResult);

        System.out.println("Type your Adrress:");
        String roadCustomers = scan.nextLine();

        System.out.println("Type number your House:");
        int houseCustomers = scan.nextInt();

        System.out.println("Type your Age:");
        int ageCustomers = scan.nextInt();

        PersonType personTypeCustomers = Customer.CreatePersonType();
        BankAccount bankAccount = BankAccount.createTypeBankAccount();

        return new Customer(nameCustomers, cpfCustomers, ageCustomers, roadCustomers, houseCustomers, personTypeCustomers, bankAccount);
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "\n\nBank Account:" +
                "\nCustomers: " + name +
                "\nType Person: " + personType +
                "\nAge: " + age +
                "\nAddress: " + road +
                "\nNumber: " + house +
                "\nAccount:" + bankAccount.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (getClass() != obj.getClass()) return false;
        Customer client = (Customer) obj;
        return getName() != null && getCpf() != null && getName().equals(client.name) && getCpf().equals(client.cpf);
    }

    @Override
    public int compareTo(Customer client) {
        return getName().compareTo(client.getName());
    }

}
