package com.boeken.boeken.models;

import com.boeken.boeken.enums.MembershipStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "membership")
@Data
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false)
    private BookClub bookClub;

    private MembershipStatus membershipStatus;

    private LocalDate dateJoined;


}
