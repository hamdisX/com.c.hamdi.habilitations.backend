/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.business;

import com.c.hamdi.habilitations.backend.model.UsersGroup;
import com.c.hamdi.habilitations.backend.repository.GroupRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author miled
 */
@Service
public class GroupBOImpl implements GroupBO {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public void create(UsersGroup group) {
        getGroupRepository().save(group);
    }

    @Override
    public void update(UsersGroup group) {
        getGroupRepository().save(group);
    }

    @Override
    public void delete(UsersGroup group) {
        getGroupRepository().delete(group);
    }

    @Override
    public void delete(int id) {
         if (getGroupRepository().findById(id) != null ) getGroupRepository().delete(getGroupRepository().findById(id).get());
    }

    @Override
    public UsersGroup read(int id) {
        return  getGroupRepository().findById(id) != null ? getGroupRepository().findById(id).get() : null;
    }

    @Override
    public List<UsersGroup> read() {
        return  getGroupRepository().findAll();
    }

    /**
     * @return the groupRepository
     */
    public GroupRepository getGroupRepository() {
        return groupRepository;
    }

    /**
     * @param groupRepository the groupRepository to set
     */
    public void setGroupRepository(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

}