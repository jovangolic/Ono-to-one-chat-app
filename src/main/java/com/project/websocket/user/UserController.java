package com.project.websocket.user;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;
	
	private final SimpMessagingTemplate messagingTemplate;
	
	@MessageMapping("/user.addUser")
	@SendTo("/user/public")
	public User addUser(@Payload User user) {
		System.out.println("User added: " + user);
		userService.saveUser(user);
		/*messagingTemplate.convertAndSend("/topic/users", user);
		messagingTemplate.convertAndSendToUser(
	            user.getId().toString(),
	            "/queue/messages",
	            new User("Welcome, " + user.getNickName() + "!")
	        );*/
		return user;
	}
	
	@MessageMapping("/user.disconnectUser")
	@SendTo("/user/public")
	public User disconnectUser(@Payload User user) {
		userService.disconnect(user);
		//messagingTemplate.convertAndSend("/topic/users", user);
		return user;
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> findConnectedUsers(){
		return ResponseEntity.ok(userService.findConnectedUsers());
	}
}
