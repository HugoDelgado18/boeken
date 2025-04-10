package com.boeken.boeken.repositories;

import com.boeken.boeken.models.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findByBookClubId(Long clubId);
}
