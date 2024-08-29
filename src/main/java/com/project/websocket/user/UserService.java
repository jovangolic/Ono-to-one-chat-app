package com.project.websocket.user;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	
	public void saveUser(User user) {
		user.setStatus(Status.ONLINE);
		userRepository.save(user);
	}
	
	public void disconnect(User user) {
		var storedUser = userRepository.findByNickName(user.getNickName()).orElse(null);
		if(storedUser != null) {
			storedUser.setStatus(Status.OFFLINE);
			userRepository.save(storedUser);
		}
	}
	
	public List<User> findConnectedUsers(){
		return userRepository.findAllByStatus(Status.ONLINE);
	}
}
