package io.motork;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Broker {

    private Deque<PaymentData> queue = new ConcurrentLinkedDeque<>();

    public void send(PaymentData paymentData) {
        queue.add(paymentData);
    }

    public PaymentData read() {
        return queue.poll();
    }
}
