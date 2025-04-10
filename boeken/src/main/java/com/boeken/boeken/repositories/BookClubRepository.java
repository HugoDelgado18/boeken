package com.boeken.boeken.repositories;

import com.boeken.boeken.models.BookClub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookClubRepository extends JpaRepository<BookClub, Long> {
    // Define custom queries if needed (e.g., find by clubCode)
    BookClub findByClubCode(String clubCode);
}
