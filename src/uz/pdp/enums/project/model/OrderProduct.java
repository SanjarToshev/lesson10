package uz.pdp.enums.project.model;

import java.math.BigDecimal;

public class OrderProduct {

    private Order order;
    private Product product;
    private double quantity;
    private BigDecimal sum;


    public OrderProduct(Order order, Product product, double quantity, BigDecimal sum) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.sum = sum;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
}
