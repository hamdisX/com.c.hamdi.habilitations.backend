package com.c.hamdi.habilitations.backend.repository;

import com.c.hamdi.habilitations.backend.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {
}
