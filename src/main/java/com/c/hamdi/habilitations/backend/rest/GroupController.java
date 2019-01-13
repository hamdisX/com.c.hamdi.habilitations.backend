/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.rest;

import com.c.hamdi.habilitations.backend.business.GroupBO;
import com.c.hamdi.habilitations.backend.business.ProfileBO;
import com.c.hamdi.habilitations.backend.model.Profile;
import com.c.hamdi.habilitations.backend.model.UsersGroup;
import com.sun.javafx.beans.IDProperty;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author miled
 */
//@RequestMapping("/")
@CrossOrigin(origins = "*")
@RestController
public class GroupController {

    @Autowired
    private GroupBO groupService;

    @Autowired
    private ProfileBO profileService;

    @RequestMapping(path = "/group/add", method = RequestMethod.POST)
    public void add(@RequestBody UsersGroup group) {
        groupService.create(group);
    }

    @RequestMapping(path = "/group/edit", method = RequestMethod.PUT)
    public void edit(@RequestBody UsersGroup group) {
        groupService.update(group);
    }

    @RequestMapping(path = "/group/remove", method = RequestMethod.DELETE)
    public void remove(@RequestBody UsersGroup group) {
        groupService.delete(group);
    }

    @RequestMapping(path = "/group/remove/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        groupService.delete(id);
    }

    @RequestMapping("/group/one/{id}")
    public UsersGroup one(@PathVariable("id") int id) {
        return groupService.read(id);
    }

    @RequestMapping("/group/all")
    public List<UsersGroup> all() {
        return groupService.read();
    }

    @RequestMapping("/group/assignprofil/{idgroup}/{idprofile}")
    public void assignprofile(@PathVariable("idgroup") int idgroup, @PathVariable("idprofile") int idprofile) {
        UsersGroup ug = groupService.read(idgroup);
        Profile p = profileService.read(idprofile);
        //
        ug.getProfileCollection().add(p);
        p.getUsersGroupCollection().add(ug);
        //
        groupService.update(ug);
        profileService.update(p);
    }

    @RequestMapping("/group/unassignprofil/{idgroup}/{idprofile}")
    public void unassignprofile(@PathVariable("idgroup") int idgroup, @PathVariable("idprofile") int idprofile) {
        UsersGroup ug = groupService.read(idgroup);
        Profile p = profileService.read(idprofile);
        //
        ug.getProfileCollection().remove(p);
        p.getUsersGroupCollection().remove(ug);
        //
        groupService.update(ug);
        profileService.update(p);
    }

    /**
     * @return the groupService
     */
    public GroupBO getGroupService() {
        return groupService;
    }

    /**
     * @param groupService the groupService to set
     */
    public void setGroupService(GroupBO groupService) {
        this.groupService = groupService;
    }

    /**
     * @return the profileService
     */
    public ProfileBO getProfileService() {
        return profileService;
    }

    /**
     * @param profileService the profileService to set
     */
    public void setProfileService(ProfileBO profileService) {
        this.profileService = profileService;
    }

}
