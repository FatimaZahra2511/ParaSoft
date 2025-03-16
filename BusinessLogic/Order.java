package BusinessLogic;


public class Order {

    public int  OrderNumber;
    public String OrderDate;
    public String OrderDescription;
    public Status OrderStatus;
    public Double OrderTotal;
    public PayMethod PaymentMethod;
    
    
    public Order(int OrderNumber, String OrderDate, String OrderDescription, String OrderStatus, Double OrderTotal,String PaymentMethod) {
        this.OrderNumber = OrderNumber;
        this.OrderDate = OrderDate;
        this.OrderDescription = OrderDescription;
        setOrderStatus(OrderStatus);
        this.OrderTotal = OrderTotal;
        setPaymentMethod(PaymentMethod);
    }
      
    public int getNumber() {
        return OrderNumber;
    }

    public void setNumber(int OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public String getDate() {
        return OrderDate;
    }

    public void setDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public PayMethod getPaymentMethod() {
        return PaymentMethod;
    } 

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod= PayMethod.valueOf(PaymentMethod.toUpperCase());
    }
   

    public String getDescription() {
        return OrderDescription;
    }

    public void setDescription(String OrderDescription) {
        this.OrderDescription = OrderDescription;
    }

    public Status getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = Status.valueOf(OrderStatus.toUpperCase());
    }

    public Double getOrderTotal() {
        return OrderTotal;
    }

    public void setOrderTotal(Double OrderTotal) {
        this.OrderTotal = OrderTotal;
    }



    
    @Override
    public String toString() {
        return "Order{\n\tOrderNumber: " + OrderNumber + "\n\tOrderDate: " + OrderDate + "\n\tOrderDescription: " + OrderDescription + "\n\tStatus: " + OrderStatus +"\n\tOrderTotal: "+ OrderTotal +"\n\tPaymentMethod: "+ PaymentMethod + "\n}";
    }
}