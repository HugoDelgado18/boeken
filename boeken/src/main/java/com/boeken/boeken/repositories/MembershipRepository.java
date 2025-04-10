package com.boeken.boeken.repositories;

import com.boeken.boeken.models.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Long> {

}
