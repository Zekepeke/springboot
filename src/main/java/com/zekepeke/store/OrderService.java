package com.zekepeke.store;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Service (Component) is a general purpose annotation
@Service
public class OrderService {

    private PaymentService paymentService;

    public OrderService() {

    }
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        if (paymentService != null) {
            paymentService.processPayment(10);
        }
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
