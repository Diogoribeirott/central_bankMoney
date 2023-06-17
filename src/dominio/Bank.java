package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class Bank {

    private final String name;
    private final String address;
    private final PersonType personType;
    public List<Customer> customers;

    public Bank(String address, PersonType personType, String name) {
        this.customers = new ArrayList<>();
        this.address = address;
        this.personType = personType;
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
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

    public Customer findCustomerByCPF(String cpf) {
        return findCustomers(c -> c.getCpf().equals(cpf));
    }

    private Customer findCustomers(Predicate<Customer> predicate) {
        Customer client = null;

        for (Customer customer : customers) {
            if (predicate.test(customer)) {
                client = customer;
            }
        }

        return client;
    }

    public void deleteCustomer(String cpf) {
        Customer customerFound = findCustomerByCPF(cpf);

        customers.remove(customerFound);
    }

    public void menu() {

        try (Scanner scan = new Scanner(System.in)) {

            int opcao;

            do {
                System.out.println("BANK: " + name +
                        "\n--------------Menu-------------" +
                        "\n1-Show Customers" +
                        "\n2-Create Customer" +
                        "\n3-Find Customer" +
                        "\n4-Exit");
                opcao = scan.nextInt();
                switch (opcao) {
                    case 1:
                        customers.forEach(System.out::println);
                        break;
                    case 2:
                        Customer createdCustomer = Customer.CreateCustomers(customers);
                        customers.add(createdCustomer);
                        break;
                    case 3:
                        System.out.println("Type CPF:");
                        Customer customerByCPF = findCustomerByCPF(scan.next());

                        if (customerByCPF == null){
                            System.out.println("Customer Doesn't Exist");
                            break;
                        }

                        System.out.println(customerByCPF);

                        break;
                    case 4:
                        System.out.println("Closing Bank");
                        break;
                }

            } while (opcao != 4);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Error, Invalid input type: " + e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Bank :" + name + "\n" +
                "Address: " + address +
                "Type: " + address;
    }

}
