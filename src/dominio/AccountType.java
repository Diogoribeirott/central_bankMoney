package dominio;

import java.util.EnumSet;

public enum AccountType {

    CURRENT_ACCOUNT(1, "Current Account"),
    SAVINGS_ACCOUNT(2, "Savings Account"),
    UNDEFINED(3, "Undefined");

    private final int cod;
    private final String description;

    AccountType(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public static AccountType toEnum(Integer cod) {
        return EnumSet.allOf(AccountType.class).stream()
                .filter(e -> e.getCod() == (cod))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Invalid id: " + cod));
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

}
