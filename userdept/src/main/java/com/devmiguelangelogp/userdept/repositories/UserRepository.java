package com.devmiguelangelogp.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmiguelangelogp.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
