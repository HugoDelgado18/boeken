package com.boeken.boeken.models;

import com.boeken.boeken.enums.PrivacyType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "book_club")
@Data
public class BookClub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clubName;
    private String description;
    private String bookTitle;

    private PrivacyType privacy; // PUBLIC or PRIVATE
    private String clubCode;
    private String meetingFrequency;  // e.g. "weekly", "bi-weekly"

    // Organizer relationship
    @ManyToOne
    @JoinColumn(name = "organizer_id", nullable = false)
    private User organizer;

    // One-to-many relationships for Memberships, Meetings, ChatMessages
    @OneToMany(mappedBy = "bookClub", cascade = CascadeType.ALL)
    private List<Membership> memberships;

    @OneToMany(mappedBy = "bookClub", cascade = CascadeType.ALL)
    private List<Meeting> meetings;

    @OneToMany(mappedBy = "bookClub", cascade = CascadeType.ALL)
    private List<ChatMessage> chatMessages;

}
