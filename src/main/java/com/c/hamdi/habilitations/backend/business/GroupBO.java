/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.business;

import com.c.hamdi.habilitations.backend.model.UsersGroup;
import java.util.List;

/**
 *
 * @author miled
 */
public interface GroupBO {

    void create(UsersGroup group);

    void update(UsersGroup group);

    void delete(UsersGroup group);

    void delete(int id);

    UsersGroup read(int id);

    List<UsersGroup> read();
}
