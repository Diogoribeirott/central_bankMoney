import dominio.Bank;
import dominio.PersonType;

public class App {
        public static void main(String[] args) throws Exception {
          Bank bank = new Bank("Rua General Mourao", PersonType.LEGAL_PERSON, "Itaú");
          bank.menu();

        }
    }