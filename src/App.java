import java.util.ArrayList;
import java.util.List;

import dominio.Bank;
import dominio.Customers;
import dominio.PersonType;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Bank bank = new Bank();

        System.out.println(bank);
        List<Customers> allCustomers = new ArrayList<>();
        allCustomers.add(new Customers("Diogo", "215454",22 , "rua 5", 5, PersonType.LEGAL_PERSON));
        allCustomers.add(new Customers("Camila", "555555",20 , "rua 10", 20, PersonType.PHYSICAL_PERSON));
        allCustomers.add(new Customers("Mariany", "2222222",19 , "rua 15", 14, PersonType.UNDEFINER));


        bank.setCustomers(allCustomers);
        bank.menu();
        bank.ShowCustomers();
    }
}
//