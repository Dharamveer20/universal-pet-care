package com.universalpetcare.petcare_backend.factory;

import com.universalpetcare.petcare_backend.exception.UserAllreadyExistsException;
import com.universalpetcare.petcare_backend.model.User;
import com.universalpetcare.petcare_backend.request.RegistrationRequest;

public interface UserFactory {
    public User createUser(RegistrationRequest registrationRequest) throws UserAllreadyExistsException;
}
