package uz.pdp.enums.project.model;

import java.math.BigDecimal;

public class Order {

    private User user;
    private BigDecimal totalSum;
    private Shop shop;

    public Order(User user, BigDecimal totalSum, Shop shop) {
        this.user = user;
        this.totalSum = totalSum;
        this.shop = shop;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(BigDecimal totalSum) {
        this.totalSum = totalSum;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
