package com.lambda.orders.controllers;

import com.lambda.orders.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
    @Autowired
    CustomerServices customerService;

    @GetMapping(value="/orders", produces = {"application/json"})
    public ResponseEntity<?> findAllCustomerOrders()
    {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
