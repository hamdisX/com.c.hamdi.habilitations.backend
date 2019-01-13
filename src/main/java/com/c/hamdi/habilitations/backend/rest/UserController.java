/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.rest;

import com.c.hamdi.habilitations.backend.business.GroupBO;
import com.c.hamdi.habilitations.backend.business.UserBO;
import com.c.hamdi.habilitations.backend.model.User;
import com.c.hamdi.habilitations.backend.model.UsersGroup;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author miled
 */
//@RequestMapping("/")
@CrossOrigin(origins = "*")
@RestController
public class UserController {

    @Autowired
    private UserBO userService;

    @Autowired
    private GroupBO groupService;

    @RequestMapping(path = "/user/add", method = RequestMethod.POST)
    public void add(@RequestBody User user) {
        userService.create(user);
    }

    @RequestMapping(path = "/user/edit", method = RequestMethod.PUT)
    public void edit(@RequestBody User user) {
        userService.update(user);
    }

    @RequestMapping(path = "/user/remove", method = RequestMethod.DELETE)
    public void remove(@RequestBody User user) {
        userService.delete(user);
    }

    @RequestMapping(path = "/user/remove/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        userService.delete(id);
    }

    @RequestMapping("/user/one/{id}")
    public User one(@PathVariable("id") int id) {
        return userService.read(id);
    }

    @RequestMapping("/user/all")
    public List<User> all() {
        return userService.read();
    }

    @RequestMapping("/user/assigngroup/{iduser}/{idgroup}")
    public void assigngroup(@PathVariable("iduser") int iduser, @PathVariable("idgroup") int idgroup) {
        User u = userService.read(iduser);
        UsersGroup ug = groupService.read(idgroup);
        //
        u.getUsersGroupCollection().add(ug);
        ug.getUserCollection().add(u);
        //
        userService.update(u);
        groupService.update(ug);
    }

    @RequestMapping("/user/unassigngroup/{iduser}/{idgroup}")
    public void unassigngroup(@PathVariable("iduser") int iduser, @PathVariable("idgroup") int idgroup) {
        User u = userService.read(iduser);
        UsersGroup ug = groupService.read(idgroup);
        //
        u.getUsersGroupCollection().remove(ug);
        ug.getUserCollection().remove(u);
        //
        userService.update(u);
        groupService.update(ug);
    }

    /**
     * @return the userService
     */
    public UserBO getUserService() {
        return userService;
    }

    /**
     * @param userService the userService to set
     */
    public void setUserService(UserBO userService) {
        this.userService = userService;
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

}
