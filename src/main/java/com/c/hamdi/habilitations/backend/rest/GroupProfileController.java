/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.rest;

import com.c.hamdi.habilitations.backend.business.PrivilegeBO;
import com.c.hamdi.habilitations.backend.business.ProfileBO;
import com.c.hamdi.habilitations.backend.model.Profile;
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
public class GroupProfileController {
    
    
     @Autowired
    private ProfileBO profileService;
     
     
    @Autowired
    private PrivilegeBO privilegeService;
    

    @RequestMapping(path = "/profile/add", method = RequestMethod.POST)
    public void add(@RequestBody Profile profile) {
        profileService.create(profile);
    }

    @RequestMapping(path = "/profile/edit", method = RequestMethod.PUT)
    public void edit(@RequestBody Profile profile) {
        profileService.update(profile);
    }

    @RequestMapping(path = "/profile/remove", method = RequestMethod.DELETE)
    public void remove(@RequestBody Profile profile) {
        profileService.delete(profile);
    }
    
    @RequestMapping(path = "/profile/remove/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        profileService.delete(id);
    }

    @RequestMapping("/profile/one/{id}")
    public Profile one(@PathVariable("id") int id) {
        return profileService.read(id);
    }

    @RequestMapping("/profile/all")
    public List<Profile> all() {
        return profileService.read();
    }

    @RequestMapping("/profile/assignprivilege/{idprofile}/{idprivilege}")
    public void assignprivilege(@PathVariable("idprofile") int idprofile, @PathVariable("idprivilege") int idprivilege) {
        Profile p = profileService.read(idprofile);
        p.getPrivilegeCollection().add(privilegeService.read(idprivilege));
        profileService.update(p);
    }

       @RequestMapping("/profile/unassignprivilege/{idprofile}/{idprivilege}")
    public void unassignprivilege(@PathVariable("idprofile") int idprofile, @PathVariable("idprivilege") int idprivilege) {
        Profile p = profileService.read(idprofile);
        p.getPrivilegeCollection().add(privilegeService.read(idprivilege));
        profileService.update(p);
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
