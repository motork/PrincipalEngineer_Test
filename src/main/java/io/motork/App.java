package io.motork;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Address address = new Address();
        address.setStreet("my street");
        address.setCity("my city");

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(new Random().nextInt(0, Integer.MAX_VALUE));
        bankAccount.setBankName("World Bank");
        bankAccount.setAmount(new BigDecimal(new Random().nextFloat(0.0f, Float.MAX_VALUE)));
        bankAccount.setCreatedAt(new Date());

        User user = new User();
        user.setId(UUID.randomUUID());
        user.setAddress(address);
        user.setBankAccount(bankAccount);
        user.setBirthDate(new Date());
        user.setFirstName("Firstname");
        user.setLastname("Lastname");

        PaymentData paymentData = new PaymentData();
        paymentData.setAmount(new BigDecimal(new Random().nextFloat(0.0f, Float.MAX_VALUE)));
        paymentData.setUser(user);

        Broker broker = new Broker();
        new AsynchronousPaymentService().start(broker);

        PaymentService paymentService = new PaymentService();
        paymentService.process(paymentData);
    }
}