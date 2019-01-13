/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.business;

import com.c.hamdi.habilitations.backend.model.User;
import java.util.List;

/**
 *
 * @author miled
 */
public interface UserBO {

    void create(User user);

    void update(User user);

    void delete(User user);

    void delete(int id);

    User read(int id);

    List<User> read();
}
