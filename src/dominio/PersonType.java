package dominio;

import java.util.EnumSet;

public enum PersonType {
    LEGAL_PERSON(1, "Legal Person"),
    PHYSICAL_PERSON(2, "Physical Person"),
    UNDEFINED(3, "Undefined");

    private final int cod;
    private final String description;

    PersonType(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public static PersonType toEnum(Integer cod) {
        return EnumSet.allOf(PersonType.class).stream()
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
