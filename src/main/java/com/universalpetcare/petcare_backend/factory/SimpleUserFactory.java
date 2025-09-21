package com.universalpetcare.petcare_backend.factory;

import com.universalpetcare.petcare_backend.exception.UserAllreadyExistsException;
import com.universalpetcare.petcare_backend.model.User;
import com.universalpetcare.petcare_backend.repository.UserRepository;
import com.universalpetcare.petcare_backend.request.RegistrationRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SimpleUserFactory implements UserFactory {

    UserRepository userRepository;
    @Override
    public User createUser(RegistrationRequest registrationRequest) throws UserAllreadyExistsException {
        if(userRepository.existsByEmail(registrationRequest.getEmail())){
            throw new UserAllreadyExistsException("Oops! " + registrationRequest.getEmail() + " already exists.");
        }
        return null;
    }
}
