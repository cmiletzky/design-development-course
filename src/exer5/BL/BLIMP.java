package exer5.BL;

import exer5.DL.Customer;
import exer5.DL.Order;
import exer5.DL.Product;
import exer5.DL.ProductCategory;

import java.util.List;
import java.util.stream.Collectors;

import exer5.DL.*;

public class BLIMP implements IBL {
   private static DataSource ds=null;
   private static final String path="..\\data\\";
   private BLIMP(String path){
       if(ds==null)
           ds=new DataSource(path);
   }




    @Override
    public Product getProductById(long productId) {
        return ds.getProducts().stream().filter((x)->x.getProductId()==productId).findFirst().orElse(null);
    }

    @Override
    public Order getOrderById(long orderId) {
        return ds.getOrders().stream().filter((x)->x.getOrderId()==orderId).findFirst().orElse(null);
    }

    @Override
    public Customer getCustomerById(long customerId) {
        return ds.getCustomers().stream().filter((x)->x.getId()==customerId).findFirst().orElse(null);
    }

    @Override
    public List<Product> getProducts(ProductCategory cat, double price) {
        return ds.getProducts().stream().filter((x)->(x.getPrice()<=price && x.getCategory()==cat))
                .collect(Collectors.toList());
    }

    @Override
    public List<Customer> popularCustomers() {
        return  ds.getCustomers().stream().filter((x)->(x.getTier()==3 && (ds.getOrders().stream().filter((y)->y.getCustomrId()== x.getId()).count()>=10)))
                .toList();
    }

    @Override
    public List<Order> getCustomerOrders(long customerId) {
       return ds.getOrders()

    }

    @Override
    public long numberOfProductInOrder(long orderId) {
        return 0;
    }

    @Override
    public List<Product> getPopularOrderedProduct(int orderedtimes) {
        return null;
    }

    @Override
    public List<Product> getOrderProducts(long orderId) {
        return null;
    }

    @Override
    public Product getMaxOrderedProduct() {
        return null;
    }

    @Override
    public List<Customer> getCustomersWhoOrderedProduct(long productId) {
        return null;
    }

    @Override
    public List<Order> getExpensiveOrders(double price) {
        return null;
    }

    @Override
    public List<Customer> ThreeTierCustomerWithMaxOrders() {
        return null;
    }
}
