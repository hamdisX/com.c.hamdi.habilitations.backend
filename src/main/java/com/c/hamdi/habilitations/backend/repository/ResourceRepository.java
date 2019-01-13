package com.c.hamdi.habilitations.backend.repository;

import com.c.hamdi.habilitations.backend.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}
