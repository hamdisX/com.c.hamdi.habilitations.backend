/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.business;

import com.c.hamdi.habilitations.backend.model.Profile;
import java.util.List;

/**
 *
 * @author miled
 */
public interface ProfileBO {

    void create(Profile profile);

    void update(Profile profile);

    void delete(Profile profile);

    void delete(int id);

    Profile read(int id);

    List<Profile> read();
}
