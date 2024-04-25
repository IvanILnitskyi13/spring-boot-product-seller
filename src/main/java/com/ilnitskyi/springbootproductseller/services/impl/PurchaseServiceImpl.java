package com.ilnitskyi.springbootproductseller.services.impl;

import com.ilnitskyi.springbootproductseller.model.Purchase;
import com.ilnitskyi.springbootproductseller.repository.PurchaseRepository;
import com.ilnitskyi.springbootproductseller.repository.projection.PurchaseItem;
import com.ilnitskyi.springbootproductseller.services.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {
    public final PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemOfUser(Long userId) {
        return purchaseRepository.findAllPurchaseOfUser(userId);
    }
}
