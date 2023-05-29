package com.api.bechallenge.services;

import static org.mockito.Mockito.verify;
import com.api.bechallenge.repositories.IUserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class UserServiceTest {

    @Mock private IUserRepository userRepository;
    private UserService userService;

    @BeforeEach void setUp(){
        this.userService = new UserService(this.userRepository);
    }

    @Test void getById(){
        userService.getByEmail("carlos@gmail.com");
        verify(userRepository).findByEmail("carlos@gmail.com");
    }

}
