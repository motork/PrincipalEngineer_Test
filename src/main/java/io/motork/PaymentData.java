package io.motork;

import java.math.BigDecimal;

public class PaymentData {

    private BigDecimal amount;
    private User user;

    private String paymentType;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType() {
        this.paymentType = paymentType;
    }
}
