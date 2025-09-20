package com.universalpetcare.petcare_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String gender;

    @Column(name="mobile")
    private String phoneNumber;

//    @Column(unique = true, nullable = false)
    private String email;

    private String password;
    private String userType;   // e.g., "VETERINARIAN"
    private boolean isEnabled;
}
