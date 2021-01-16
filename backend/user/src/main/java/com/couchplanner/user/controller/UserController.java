package com.couchplanner.user.controller;

import com.couchplanner.user.dtos.UserDetailsDto;
import com.couchplanner.user.entities.UserEntity;
import com.couchplanner.user.messages.SuccessMessage;
import com.couchplanner.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user/control")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/")
    public ResponseEntity<?> createUser(@Valid @RequestBody UserDetailsDto dto) {
        UserEntity user = userService.createUser(userService.convertUserDetailsDtoToUserEntity(dto));

        return ResponseEntity.ok(SuccessMessage.USER_REGISTERED_SUCCESS.getMessage());
    }


}
