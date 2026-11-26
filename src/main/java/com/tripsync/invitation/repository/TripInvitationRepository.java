package com.tripsync.invitation.repository;

import com.tripsync.invitation.entity.InvitationStatus;
import com.tripsync.invitation.entity.TripInvitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TripInvitationRepository extends JpaRepository<TripInvitation, Long> {

    List<TripInvitation> findByInviteeEmailIgnoreCase(String inviteeEmail);
    List<TripInvitation> findByTripId(Long tripId);
    Optional<TripInvitation> findByIdAndInviteeEmailIgnoreCase(Long id,String inviteeEmail);
    boolean existsByTripIdAndInviteeEmailIgnoreCaseAndStatus(Long tripId, String inviteeEmail, InvitationStatus status);
}
