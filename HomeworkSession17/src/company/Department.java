package company;

public enum Department {

    ACCOUNTING("Accounting department"),
    IT("IT department"),
    CUSTOMER_SERVICE("Customer Service department"),
    LOGISTICS("Logistics department");

    private final String name;

    Department(String name) {
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
