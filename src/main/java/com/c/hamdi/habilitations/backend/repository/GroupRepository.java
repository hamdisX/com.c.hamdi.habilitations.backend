package com.c.hamdi.habilitations.backend.repository;

import com.c.hamdi.habilitations.backend.model.UsersGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<UsersGroup, Integer> {
}
