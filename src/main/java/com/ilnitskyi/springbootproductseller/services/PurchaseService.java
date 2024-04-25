package com.ilnitskyi.springbootproductseller.services;

import com.ilnitskyi.springbootproductseller.model.Purchase;
import com.ilnitskyi.springbootproductseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);
    List<PurchaseItem> findPurchaseItemOfUser(Long userId);
}
