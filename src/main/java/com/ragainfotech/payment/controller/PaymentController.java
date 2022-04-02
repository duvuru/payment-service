package com.ragainfotech.payment.controller;

import com.ragainfotech.payment.model.Payment;
import com.ragainfotech.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/submitPayment")
    public Payment submitPayment(@RequestBody Payment payment){
       return paymentService.savePayment(payment);
    }


}
