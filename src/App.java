
    import java.util.ArrayList;
    import java.util.List;

    import dominio.Bank;
    import dominio.Customers;

    public class App {
        public static void main(String[] args) throws Exception {
            Bank bank = new Bank();
            System.out.println(bank);
            List<Customers> allCustomers = new ArrayList<>();
        
            bank.setCustomers(allCustomers);
            bank.menu();

        }
    }