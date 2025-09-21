package com.universalpetcare.petcare_backend.service.user;

import com.universalpetcare.petcare_backend.exception.UserAllreadyExistsException;
import com.universalpetcare.petcare_backend.factory.SimpleUserFactory;
import com.universalpetcare.petcare_backend.model.User;
import com.universalpetcare.petcare_backend.request.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    SimpleUserFactory simpleUserFactory;
    public User addUser(RegistrationRequest registrationRequest) throws UserAllreadyExistsException {
        return simpleUserFactory.createUser(registrationRequest);
    }
}
