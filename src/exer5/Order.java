package exer5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Long.parseLong;
import static java.lang.Long.valueOf;

public class Order {

    private long orderId;
    private Date orderDate;
    private Date deliveryDate;
    private OrderStatus status;
    private long customrId;

    public Order(String orderInfo)  {
       var linedata = orderInfo.split(" ");
       orderId = Long.parseLong(linedata[1]);
       var datedata = linedata[4].split("/");
       orderDate = new Date(Integer.parseInt(datedata[2]),Integer.parseInt(datedata[1]),Integer.parseInt(datedata[0]));
       datedata = linedata[7].split("/");
       deliveryDate = new Date(Integer.parseInt(datedata[2]),Integer.parseInt(datedata[1]),Integer.parseInt(datedata[0]));
       status = OrderStatus.valueOf(linedata[9]);
       customrId = Long.parseLong(linedata[12]);
    }

    public Order(long Oid, Date OorderDate, Date OdeliveryDate, OrderStatus Ostatus, long OcustomrId)
    {
        setOrderId(Oid);
        setOrderDate(OorderDate);
        setDeliveryDate(OdeliveryDate);
        setStatus(Ostatus);
        setCustomrId(OcustomrId);
    }



    public String toString()
    {
        SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");
        return "order: "+ getOrderId() + " order date: "+ ft.format(getOrderDate()) +" delivery date: "+ ft.format(getDeliveryDate()) + " status: "+ getStatus() + " customr id: "+ getCustomrId()+"\n";
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public long getCustomrId() {
        return customrId;
    }

    public void setCustomrId(long customrId) {
        this.customrId = customrId;
    }
}