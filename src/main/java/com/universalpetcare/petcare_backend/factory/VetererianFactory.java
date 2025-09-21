package com.universalpetcare.petcare_backend.factory;

import com.universalpetcare.petcare_backend.model.User;
import com.universalpetcare.petcare_backend.model.Vetererian;
import com.universalpetcare.petcare_backend.repository.UserRepository;
import com.universalpetcare.petcare_backend.repository.VetererianRepository;
import com.universalpetcare.petcare_backend.request.RegistrationRequest;
import com.universalpetcare.petcare_backend.service.user.UserAttributeMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
//@NoArgsConstructor
public class VetererianFactory {
    private final VetererianRepository vetererianRepository;
    private final UserAttributeMapper userAttributeMapper;


    public User createVetererian(RegistrationRequest registrationRequest) {
        Vetererian vetererian = new Vetererian();

        userAttributeMapper.setCommonAttributes(registrationRequest, vetererian);
        vetererian.setSpecialization(registrationRequest.getSpecialization());
        return vetererianRepository.save(vetererian);
    }
}
