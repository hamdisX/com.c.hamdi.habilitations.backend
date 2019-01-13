/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.business;

import com.c.hamdi.habilitations.backend.model.Resource;
import java.util.List;

/**
 *
 * @author miled
 */
public interface ResourceBO {

    void create(Resource resource);

    void update(Resource resource);

    void delete(Resource resource);

    void delete(int id);

    Resource read(int id);

    List<Resource> read();
}
