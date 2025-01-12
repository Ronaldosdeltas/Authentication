package com.APItwo.Authentication.repository;

import com.APItwo.Authentication.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Integer> {

    public AppUser findByEmail(String email);
}
