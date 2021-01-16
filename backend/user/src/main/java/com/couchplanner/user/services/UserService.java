package com.couchplanner.user.services;

import com.couchplanner.user.dtos.UserDetailsDto;
import com.couchplanner.user.entities.UserEntity;
import com.couchplanner.user.exceptions.UserAlreadyExistsException;
import com.couchplanner.user.exceptions.UserNotFoundException;
import com.couchplanner.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
public class UserService {

    // use the repository for database queries, you dont have to write them in the repository, they are created in the background just call the function
    @Autowired
    private UserRepository userRepository;


    public UserEntity loadUserEntityByUsername(String username) {
        Optional<UserEntity> user = userRepository.findByUsername(username);
        // example of an query thats not in the repository
        Optional<UserEntity> user2 = userRepository.findById(1);
        user.orElseThrow(UserNotFoundException::new);
        user2.orElseThrow(UserNotFoundException::new);
        return user.get();
    }


    /*
    Transactional makes a rollback if something goes wrong in the database
    */
    @Transactional
    public UserEntity createUser(UserEntity entity) {
        Optional<UserEntity> user = userRepository.findByUsername(entity.getUsername());
        user.ifPresent(e -> {
            throw new UserAlreadyExistsException();
        });

        return userRepository.save(entity);
    }

    public UserEntity convertUserDetailsDtoToUserEntity(UserDetailsDto dto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(dto.getUsername());
        userEntity.setFirstName(dto.getFirstName());
        userEntity.setLastName(dto.getLastName());
        userEntity.setPassword("test");

        return userEntity;
    }



}
