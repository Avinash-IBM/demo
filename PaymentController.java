package com.example.payment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @PostMapping
    public String pay(@RequestParam String customer,
                      @RequestParam double amount) {

        return "Payment successful for "
                + customer
                + " Amount = "
                + amount;
    }
}
