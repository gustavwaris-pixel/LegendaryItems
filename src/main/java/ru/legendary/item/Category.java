package ru.legendary.item;

public enum Category {
    LEG("leg"),
    MINILEG("minileg"),
    LEGR("legr");

    private final String prefix;

    Category(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
