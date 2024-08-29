package com.project.websocket.chatroom;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {

	Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}
