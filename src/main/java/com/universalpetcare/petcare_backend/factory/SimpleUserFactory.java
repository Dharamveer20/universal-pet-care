package com.universalpetcare.petcare_backend.factory;

import com.universalpetcare.petcare_backend.exception.UserAllreadyExistsException;
import com.universalpetcare.petcare_backend.model.User;
import com.universalpetcare.petcare_backend.repository.UserRepository;
import com.universalpetcare.petcare_backend.request.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SimpleUserFactory implements UserFactory {

    VetererianFactory vetererianFactory;
    PatientFactory patientFactory;
    AdminFactory adminFactory;

    UserRepository userRepository;
    @Override
    public User createUser(RegistrationRequest registrationRequest) throws UserAllreadyExistsException {
        if(userRepository.existsByEmail(registrationRequest.getEmail())){
            throw new UserAllreadyExistsException("Oops! " + registrationRequest.getEmail() + " already exists.");
        }

        return switch (registrationRequest.getUserType()) {
            case "VET" -> vetererianFactory.createVetererian(registrationRequest);
            case "PATIENT" -> patientFactory.createPatient(registrationRequest);
            case "ADMIN" -> adminFactory.createAdmin(registrationRequest);
            default -> null;
        };

    }
}
