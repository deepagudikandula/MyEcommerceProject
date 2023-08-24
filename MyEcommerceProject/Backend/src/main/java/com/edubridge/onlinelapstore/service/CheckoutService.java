package com.edubridge.onlinelapstore.service;

import com.edubridge.onlinelapstore.dto.Purchase;
import com.edubridge.onlinelapstore.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}