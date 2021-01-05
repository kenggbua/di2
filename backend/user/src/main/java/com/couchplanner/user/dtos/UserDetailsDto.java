package com.couchplanner.user.dtos;

import com.couchplanner.user.entities.UserEntity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserDetailsDto{

    @Email()
    @NotBlank()
    private String username;

    @NotBlank()
    private String password;

    @NotBlank()
    private String firstName;

    @NotBlank()
    private String lastName;

    private Boolean enabled;


    public UserDetailsDto() {
    }

    public UserDetailsDto(UserEntity user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.enabled = user.isEnabled();

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
