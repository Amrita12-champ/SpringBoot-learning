package com.amrita.fieldinjection;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public String makePayment() {
        return "Payment Successful using Razorpay";
    }
}


