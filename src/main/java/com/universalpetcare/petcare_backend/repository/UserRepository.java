package com.universalpetcare.petcare_backend.repository;

import com.universalpetcare.petcare_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
