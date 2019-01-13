/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.rest;

import com.c.hamdi.habilitations.backend.business.PrivilegeBO;
import com.c.hamdi.habilitations.backend.business.ResourceBO;
import com.c.hamdi.habilitations.backend.model.Privilege;
import com.c.hamdi.habilitations.backend.model.Resource;
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
public class ResourceController {

    @Autowired
    private ResourceBO resourceService;

    @RequestMapping(path = "/resource/add", method = RequestMethod.POST)
    public void add(@RequestBody Resource resource) {
        getResourceService().create(resource);
    }

    @RequestMapping(path = "/resource/edit", method = RequestMethod.PUT)
    public void edit(@RequestBody Resource resource) {
        getResourceService().update(resource);
    }

    @RequestMapping(path = "/resource/remove", method = RequestMethod.DELETE)
    public void remove(@RequestBody Resource resource) {
        getResourceService().delete(resource);
    }

    @RequestMapping(path = "/resource/remove/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        getResourceService().delete(id);
    }

    @RequestMapping("/resource/one/{id}")
    public Resource one(@PathVariable("id") int id) {
        return getResourceService().read(id);
    }

    @RequestMapping("/resource/all")
    public List<Resource> all() {
        return getResourceService().read();
    }

    /**
     * @return the resourceService
     */
    public ResourceBO getResourceService() {
        return resourceService;
    }

    /**
     * @param resourceService the resourceService to set
     */
    public void setResourceService(ResourceBO resourceService) {
        this.resourceService = resourceService;
    }

}
