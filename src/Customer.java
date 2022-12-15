

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private List<Order> orderList = new ArrayList<Order>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

}
