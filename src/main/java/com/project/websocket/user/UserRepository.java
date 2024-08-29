package com.project.websocket.user;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findAllByStatus(Status status);

	Optional<User> findByNickName(String nickName);
}
