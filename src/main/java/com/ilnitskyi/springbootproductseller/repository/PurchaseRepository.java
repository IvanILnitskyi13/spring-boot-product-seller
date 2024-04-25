package com.ilnitskyi.springbootproductseller.repository;

import com.ilnitskyi.springbootproductseller.model.Purchase;
import com.ilnitskyi.springbootproductseller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    @Query("""
        SELECT
            prd.name AS name,
            pur.price AS price,
            pur.purchaseTime AS purchaseTime
        FROM Purchase pur
            LEFT JOIN Product prd on prd.id = pur.productId
        WHERE pur.userId = :userId
    """)
    List<PurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);
}
