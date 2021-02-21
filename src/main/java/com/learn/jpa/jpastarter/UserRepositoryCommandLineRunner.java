package com.learn.jpa.jpastarter;

import java.util.List;
import java.util.Optional;

import com.learn.jpa.jpastarter.entity.User;
import com.learn.jpa.jpastarter.service.UserRepository;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {


    private static final Logger log = org.slf4j.LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);


    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill","User");
        
        userRepository.save(user);
        log.info("new user created by user repostitory:" + user);


        Optional<User> userById = userRepository.findById(1L);
        log.info("The user with id 1 is:"+userById);

        List<User> allUsers = userRepository.findAll();
        log.info("All users:" + allUsers);
        




    }
    
}
