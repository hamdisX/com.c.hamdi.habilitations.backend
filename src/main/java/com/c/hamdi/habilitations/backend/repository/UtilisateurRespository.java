/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.repository;

import com.c.hamdi.habilitations.backend.model.Utilisateur;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author miled
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface UtilisateurRespository extends PagingAndSortingRepository<Utilisateur, Integer> {

    List<Utilisateur> findByUsername(@Param("username") String username);

}
