package com.edubridge.onlinelapstore.dto;

import lombok.Data;

import java.util.Set;

import com.edubridge.onlinelapstore.entity.Address;
import com.edubridge.onlinelapstore.entity.Customer;
import com.edubridge.onlinelapstore.entity.Order;
import com.edubridge.onlinelapstore.entity.OrderItem;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}