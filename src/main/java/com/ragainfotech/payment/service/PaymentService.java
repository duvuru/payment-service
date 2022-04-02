package com.ragainfotech.payment.service;

import com.ragainfotech.payment.model.Payment;
import com.ragainfotech.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository repository;

    public Payment savePayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
       return repository.save(payment);
    }

    public String paymentProcessing(){
        return new Random().nextBoolean()? "Success":"failed";
    }
}
