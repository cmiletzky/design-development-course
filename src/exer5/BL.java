package exer5;




import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BL implements IBL {





    @Override
    public Product getProductById(long productId) {
        return DataSource.allProducts.stream().filter((x)->x.getProductId()==productId).findFirst().orElse(null);
    }

    @Override
    public Order getOrderById(long orderId) {
        return DataSource.allOrders.stream().filter((x)->x.getOrderId()==orderId).findFirst().orElse(null);
    }

    @Override
    public Customer getCustomerById(long customerId) {
        return DataSource.allCustomers.stream().filter((x)->x.getId()==customerId).findFirst().orElse(null);
    }

    @Override
    public List<Product> getProducts(ProductCategory cat, double price) {
        return DataSource.allProducts.stream().filter((x)->(x.getPrice()<=price && x.getCategory()==cat))
                .collect(Collectors.toList());
    }

    @Override
    public List<Customer> popularCustomers() {
        return  DataSource.allCustomers.stream()
                .filter((x)->(x.getTier()==3 && (DataSource.allOrders.stream().filter((y)->y.getCustomrId()== x.getId()).count()>=10)))
                .sorted(Comparator.comparingLong(Customer::getId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Order> getCustomerOrders(long customerId) {
        return DataSource.allOrders.stream().filter((x)->x.getCustomrId()==customerId)
                .sorted(Comparator.comparingLong(Order::getOrderId))
                .collect(Collectors.toList());

    }

    @Override
    public long numberOfProductInOrder(long orderId) {
        return DataSource.allOrderProducts.stream().filter((x)->x.getOrderId()==orderId)
                .mapToLong(OrderProduct::getQuantity)
                .reduce(0, Long::sum);

    }

    @Override
    public List<Product> getPopularOrderedProduct(int orderedtimes) {
        return DataSource.allProducts.stream()
                .filter(
                        (x)->(DataSource.allOrderProducts.stream()
                                .filter((y)->y.getProductId()==x.getProductId())
                                .count()>=orderedtimes)
                )
                .sorted(Comparator.comparingLong(Product::getProductId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> getOrderProducts(long orderId) {
        return DataSource.allOrderProducts.stream().filter((x)->x.getOrderId()==orderId)
                .map((x)->getProductById(x.getProductId()))
                .collect(Collectors.toList());

    }

    @Override
    public Product getMaxOrderedProduct() {
        return DataSource.allProducts.stream()
                .max(
                        Comparator.comparing((x)->(DataSource.allOrderProducts.stream()
                                .filter((y)->(y.getProductId()==x.getProductId())).count()))
                )
                .orElse(null);
    }

    @Override
    public List<Customer> getCustomersWhoOrderedProduct(long productId) {
        return DataSource.allCustomers.stream().
                filter(
                        (x)->(DataSource.allOrderProducts.stream()
                                .filter((y)->(y.getProductId()==productId))
                                .count()>0)
                )
                .sorted(Comparator.comparingLong(Customer::getId))
                .collect(Collectors.toList());
    }

    @Override
    public double sumOfOrder(long orderID) {
        return DataSource.allOrderProducts.stream()
                .filter((x)->x.getOrderId()==orderID)
                .map((x)->(
                        (x.getQuantity())*(getProductById(x.getProductId()).getPrice()))
                )
                .reduce(0.0,Double::sum);
    }

    @Override
    public List<Order> getExpensiveOrders(double price) {
        return DataSource.allOrders.stream()
                .filter((x)->(sumOfOrder(x.getOrderId())>price))
                .sorted(Comparator.comparingLong(Order::getOrderId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Customer> ThreeTierCustomerWithMaxOrders() {
        long max = max_orders();
        return DataSource.allCustomers.stream()
                .filter(
                        (x)->((x.getTier() == 3) &&(get_customer_orders(x.getId()) ==max))
                )
                .collect(Collectors.toList());
    }

    private long max_orders(){
        return DataSource.allCustomers.stream()
                .mapToLong(
                        (x)->(get_customer_orders(x.getId()))
                )
                .max()
                .orElse(-1);
    }

    private long get_customer_orders(long id){
        return getCustomerOrders(id).size();
    }
}
