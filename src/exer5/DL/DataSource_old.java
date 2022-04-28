
package exer5.DL;


import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class DataSource_old {
    static final String cus_file = "\\customers.txt";
    static final String pro_file = "\\products.txt";
    static final String ord_file = "\\orders.txt";
    static final String prod_ord_file = "\\orderProduct.txt";

    static List<Customer> customers;
    static List<Product> products;
    static List<Order> orders;
    static List<OrderProduct> orderProducts;

    private void setOrders_init(String path) throws IOException {
        orders = Files.lines(Paths.get(path))
                .collect(new List<Order>, (line) -> new Order((String) line), (x)->orders.add((Order) x));
    }

    private void setCustomers(String path) throws IOException {
        customers = Files.lines(Paths.get(path))
                .collect(new List<Customer>, (line)->new Customer((String) line),(x) -> customers.add((Customer) x));
    }

    private void setProducts(String path) throws IOException {
        products = Files.lines(Paths.get(path))
                .collect(new List<Product>, (line)->new Product((String) line),(x) -> products.add((Product) x));
    }

    private void setOrderProducts(String path) throws IOException {
        orderProducts = Files.lines(Paths.get(path))
                .collect(new List<OrderProduct>, (line)->new OrderProduct((String) line),(x) -> orderProducts.add((OrderProduct) x));
    }

    public void add_customer(Customer cus){
        customers.add(cus);
    }
    public void add_product(Product pro){
        products.add(pro);
    }
    public void add_order(Order ord){
        orders.add(ord);
    }
    public void add_prod_ord(OrderProduct pord){
        orderProducts.add(pord);
    }

    public DataSource_old(String path) {
        try {
            setProducts(path + pro_file);
            setCustomers(path + cus_file);
            setOrders_init(path + ord_file);
            setOrderProducts(path + prod_ord_file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public  List<Customer> getCustomers() {
        return customers;
    }

    public  List<Product> getProducts() {
        return products;
    }

    public  List<Order> getOrders() {
        return orders;
    }

    public  List<OrderProduct> getOrderProducts() {
        return orderProducts;
    }


}
