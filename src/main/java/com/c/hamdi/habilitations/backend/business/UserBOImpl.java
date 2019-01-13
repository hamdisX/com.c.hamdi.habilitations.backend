/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.business;

import com.c.hamdi.habilitations.backend.model.User;
import com.c.hamdi.habilitations.backend.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author miled
 */
@Service
public class UserBOImpl implements UserBO {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user) {
        getUserRepository().save(user);
    }

    @Override
    public void update(User user) {
        getUserRepository().save(user);
    }

    @Override
    public void delete(User user) {
        getUserRepository().delete(user);
    }

    @Override
    public void delete(int id) {
        if (getUserRepository().findById(id) != null ) getUserRepository().delete(getUserRepository().findById(id).get());
    }

    @Override
    public User read(int id) {
        return getUserRepository().findById(id) != null ? getUserRepository().findById(id).get() : null;
    }

    @Override
    public List<User> read() {
        return getUserRepository().findAll();
    }

    /**
     * @return the userRepository
     */
    public UserRepository getUserRepository() {
        return userRepository;
    }

    /**
     * @param userRepository the userRepository to set
     */
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
