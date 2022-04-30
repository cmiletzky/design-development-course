package exer5;


import java.util.List;

public interface IBL {
    Product getProductById(long productId);
    Order getOrderById(long orderId);
    Customer getCustomerById(long customerId);
    List<Product> getProducts(ProductCategory cat, double price);
    List<Customer> popularCustomers();
    List<Order>  getCustomerOrders(long customerId);
    long numberOfProductInOrder(long orderId);
    List<Product> getPopularOrderedProduct(int orderedtimes);
    List<Product> getOrderProducts(long orderId);
    Product getMaxOrderedProduct();
    List<Customer> getCustomersWhoOrderedProduct (long productId);
    double sumOfOrder(long orderID);
    List<Order> getExpensiveOrders(double price);
    List<Customer> ThreeTierCustomerWithMaxOrders();

}
