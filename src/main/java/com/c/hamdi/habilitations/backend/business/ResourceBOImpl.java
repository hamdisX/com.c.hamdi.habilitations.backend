/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.business;

import com.c.hamdi.habilitations.backend.model.Resource;
import com.c.hamdi.habilitations.backend.repository.ResourceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author miled
 */
@Service
public class ResourceBOImpl implements ResourceBO {

    @Autowired
    private ResourceRepository resourceRepository;

    @Override
    public void create(Resource resource) {
         getResourceRepository().save(resource);
    }

    @Override
    public void update(Resource resource) {
        getResourceRepository().save(resource);
    }

    @Override
    public void delete(Resource resource) {
        getResourceRepository().delete(resource);
    }

    @Override
    public void delete(int id) {
           if (getResourceRepository().findById(id) != null ) getResourceRepository().delete(getResourceRepository().findById(id).get());
    }

    @Override
    public Resource read(int id) {
        return getResourceRepository().findById(id) != null ? getResourceRepository().findById(id).get() : null;
    }

    @Override
    public List<Resource> read() {
        return getResourceRepository().findAll();
    }

    /**
     * @return the resourceRepository
     */
    public ResourceRepository getResourceRepository() {
        return resourceRepository;
    }

    /**
     * @param resourceRepository the resourceRepository to set
     */
    public void setResourceRepository(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

}
