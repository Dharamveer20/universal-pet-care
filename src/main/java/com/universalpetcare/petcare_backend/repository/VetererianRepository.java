package com.universalpetcare.petcare_backend.repository;

import com.universalpetcare.petcare_backend.model.Vetererian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetererianRepository extends JpaRepository<Vetererian, Long> {
}
