package fooddelivery;

import java.util.List;

public class Restaurant {

    private final String id;
    private final String name;
    private final String address;
    private final List<MenuItem> menu;

    public Restaurant(String id, String name, String address, List<MenuItem> menu) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.menu = menu;
    }
}
