public class Customer {

    private final String customerId;

    private final String name;

    private final int age;

    private final String address;

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Customer(String customerId, String name, int age, String address) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
