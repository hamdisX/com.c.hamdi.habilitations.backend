package com.c.hamdi.habilitations.backend.repository;

import com.c.hamdi.habilitations.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
