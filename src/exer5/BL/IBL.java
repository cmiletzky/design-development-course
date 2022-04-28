package exer5.BL;

import exer5.DL.*;

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
    List<Order> getExpensiveOrders(double price);
    List<Customer> ThreeTierCustomerWithMaxOrders();

}
