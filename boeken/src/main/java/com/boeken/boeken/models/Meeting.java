package com.boeken.boeken.models;

import com.boeken.boeken.enums.MeetingMode;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "meeting")
@Data
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false)
    private BookClub bookClub;

    private LocalDateTime meetingTime;
    private MeetingMode meetingMode;
    private String location;
    private String meetingLink;
}
