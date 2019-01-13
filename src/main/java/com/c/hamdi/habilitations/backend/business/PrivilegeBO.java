/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.business;

import com.c.hamdi.habilitations.backend.model.Privilege;
import java.util.List;

/**
 *
 * @author miled
 */
public interface PrivilegeBO {

    void create(Privilege privilege);

    void update(Privilege privilege);

    void delete(Privilege privilege);

    void delete(int id);

    Privilege read(int id);

    List<Privilege> read();
}
