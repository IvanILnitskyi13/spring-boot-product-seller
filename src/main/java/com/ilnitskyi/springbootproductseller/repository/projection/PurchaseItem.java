package com.ilnitskyi.springbootproductseller.repository.projection;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface PurchaseItem {
    String getName();
    BigDecimal getPrice();
    LocalDateTime getPurchaseTime();
}
