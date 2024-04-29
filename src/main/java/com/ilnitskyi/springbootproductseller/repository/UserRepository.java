package com.ilnitskyi.springbootproductseller.repository;

import com.ilnitskyi.springbootproductseller.model.Role;
import com.ilnitskyi.springbootproductseller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    @Modifying
    @Query("UPDATE User SET role =:role WHERE email = :email")
    void updateUserRole(@Param("email") String email, @Param("role") Role role);

}
