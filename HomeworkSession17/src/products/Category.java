package products;

public enum Category {

    SPORTS_EQUIPMENT("Sports Equipment category"),
    CLOTHES("Clothes category"),
    SOFTWARE("Software category");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
