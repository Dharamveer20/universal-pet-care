package com.universalpetcare.petcare_backend.controller;

import com.universalpetcare.petcare_backend.exception.UserAllreadyExistsException;
import com.universalpetcare.petcare_backend.model.User;
import com.universalpetcare.petcare_backend.request.RegistrationRequest;
import com.universalpetcare.petcare_backend.service.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    UserService userService;
    @PostMapping
    public User addUser(@RequestBody RegistrationRequest registrationRequest) throws UserAllreadyExistsException {
        return userService.addUser(registrationRequest);

    }
}
