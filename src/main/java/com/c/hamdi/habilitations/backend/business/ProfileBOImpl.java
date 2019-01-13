/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.business;

import com.c.hamdi.habilitations.backend.model.Profile;
import com.c.hamdi.habilitations.backend.repository.ProfileRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author miled
 */
@Service
public class ProfileBOImpl implements ProfileBO {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public void create(Profile profile) {
        getProfileRepository().save(profile);
    }

    @Override
    public void update(Profile profile) {
        getProfileRepository().save(profile);
    }

    @Override
    public void delete(Profile profile) {
        getProfileRepository().delete(profile);
    }

    @Override
    public void delete(int id) {
        if (getProfileRepository().findById(id) != null ) getProfileRepository().delete(getProfileRepository().findById(id).get());
    }

    @Override
    public Profile read(int id) {
      return getProfileRepository().findById(id) != null ? getProfileRepository().findById(id).get() : null;
    }

    @Override
    public List<Profile> read() {
        return getProfileRepository().findAll();
    }

    /**
     * @return the profileRepository
     */
    public ProfileRepository getProfileRepository() {
        return profileRepository;
    }

    /**
     * @param profileRepository the profileRepository to set
     */
    public void setProfileRepository(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

}
