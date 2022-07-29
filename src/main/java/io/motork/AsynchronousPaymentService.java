package io.motork;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AsynchronousPaymentService {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void start(Broker broker) {
        final Runnable reader = () ->
                System.out.println(broker.read() == null ?
                        "No message was found." :
                        "Payment processed."
                );

        scheduler.scheduleAtFixedRate(reader, 0, 5, TimeUnit.SECONDS);
    }
}
