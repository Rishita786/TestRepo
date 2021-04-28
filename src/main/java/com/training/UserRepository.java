package com.training;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.User;
//import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<User, Long> {
		User findByUsername(String username);
}
