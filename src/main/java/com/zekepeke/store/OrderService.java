package com.zekepeke.store;

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
