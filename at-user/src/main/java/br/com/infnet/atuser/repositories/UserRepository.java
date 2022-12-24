package br.com.infnet.atuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infnet.atuser.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}