package com.universalpetcare.petcare_backend.request;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data  // Combines the features of several other Lombok annotations:
       // @Getter, @Setter, @ToString, @EqualsAndHashCode, and @RequiredArgsConstructor
public class RegistrationRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNumber;
    private String email;
    private String password;
    private String userType;
    private boolean isEnabled;

    private String specialization;
}
