package com.universalpetcare.petcare_backend.service.user;

import com.universalpetcare.petcare_backend.model.User;
import com.universalpetcare.petcare_backend.request.RegistrationRequest;

public class UserAttributeMapper {
    public void setCommonAttributes(RegistrationRequest source, User target){
        target.setEmail(source.getEmail());
        target.setFirstName(source.getFirstName());
        target.setGender(source.getGender());
        target.setEnabled(source.isEnabled());
        target.setLastName(source.getLastName());
        target.setPassword(source.getPassword());
        target.setPhoneNumber(source.getPhoneNumber());
        target.setUserType(source.getUserType());
    }
}
