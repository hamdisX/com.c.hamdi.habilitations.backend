/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.rest;

import com.c.hamdi.habilitations.backend.business.PrivilegeBO;
import com.c.hamdi.habilitations.backend.model.Privilege;
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
public class PrivilegeController {

    @Autowired
    private PrivilegeBO privilegeService;

    @RequestMapping(path = "/privilege/add", method = RequestMethod.POST)
    public void add(@RequestBody Privilege privilege) {
        privilegeService.create(privilege);
    }

    @RequestMapping(path = "/privilege/edit", method = RequestMethod.PUT)
    public void edit(@RequestBody Privilege privilege) {
        privilegeService.update(privilege);
    }

    @RequestMapping(path = "/privilege/remove", method = RequestMethod.DELETE)
    public void remove(@RequestBody Privilege privilege) {
        privilegeService.delete(privilege);
    }

    @RequestMapping(path = "/privilege/remove/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        privilegeService.delete(id);
    }

    @RequestMapping("/privilege/one/{id}")
    public Privilege one(@PathVariable("id") int id) {
        return privilegeService.read(id);
    }

    @RequestMapping("/privilege/all")
    public List<Privilege> all() {
        return privilegeService.read();
    }

    /**
     * @return the privilegeService
     */
    public PrivilegeBO getPrivilegeService() {
        return privilegeService;
    }

    /**
     * @param privilegeService the privilegeService to set
     */
    public void setPrivilegeService(PrivilegeBO privilegeService) {
        this.privilegeService = privilegeService;
    }

}
