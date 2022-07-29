package io.motork;

import java.math.BigDecimal;

public class PaymentService {

    public void process(PaymentData paymentData) {
        if ("CREDIT_CARD".equals(paymentData.getPaymentType()) || "DEBIT_CARD".equals(paymentData.getPaymentType())) {
            executeCardPayment(paymentData.getAmount());
        } else if ("ELECTRONIC_BANK_TRANSFER".equals(paymentData.getPaymentType())) {
            executeEletronicBankPayment(paymentData.getAmount());
        } else if ("MOBILE".equals(paymentData.getPaymentType())) {
            executeMobilePayment(paymentData.getAmount());
        } else {
            System.out.println("Payment " + paymentData.getPaymentType() + " is not supported.");
        }
        //TODO Broker class must be used here to publish the #PaymentData
    }

    private boolean executeCardPayment(BigDecimal amount) {
        return true;
    }

    private boolean executeEletronicBankPayment(BigDecimal amount) {
        return true;
    }

    private boolean executeMobilePayment(BigDecimal amount) {
        return true;
    }
}
