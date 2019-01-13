/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.business;

import com.c.hamdi.habilitations.backend.model.Privilege;
import com.c.hamdi.habilitations.backend.repository.PrivilegeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author miled
 */
@Service
public class PrivilegeBOImpl implements PrivilegeBO {

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @Override
    public void create(Privilege privilege) {
        getPrivilegeRepository().save(privilege);
    }

    @Override
    public void update(Privilege privilege) {
        getPrivilegeRepository().save(privilege);
    }

    @Override
    public void delete(Privilege privilege) {
        getPrivilegeRepository().delete(privilege);
    }

    @Override
    public void delete(int id) {
        if (getPrivilegeRepository().findById(id) != null ) getPrivilegeRepository().delete(getPrivilegeRepository().findById(id).get());
    }

    @Override
    public Privilege read(int id) {
        return getPrivilegeRepository().findById(id) != null ? getPrivilegeRepository().findById(id).get() : null;
    }

    @Override
    public List<Privilege> read() {
        return getPrivilegeRepository().findAll();
    }

    /**
     * @return the privilegeRepository
     */
    public PrivilegeRepository getPrivilegeRepository() {
        return privilegeRepository;
    }

    /**
     * @param privilegeRepository the privilegeRepository to set
     */
    public void setPrivilegeRepository(PrivilegeRepository privilegeRepository) {
        this.privilegeRepository = privilegeRepository;
    }

}
