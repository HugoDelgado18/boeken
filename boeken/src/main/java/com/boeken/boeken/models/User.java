package com.boeken.boeken.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "profile_picture", nullable = false)
    private String profilePicture;
    @Column(name = "created_timestamp", updatable = false)
    private OffsetDateTime  createdTimestamp;
    @Column(name = "modified_timestamp")
    private OffsetDateTime  modifiedTimestamp;
    @Column(name = "deleted_timestamp")
    private OffsetDateTime deletedTimestamp;

    @OneToMany(mappedBy = "organizer")
    private List<BookClub> organizedClubs;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Membership> memberships;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ChatMessage> chatMessages;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String phoneNumber, String email, String profilePicture, OffsetDateTime createdTimestamp, OffsetDateTime modifiedTimestamp, OffsetDateTime deletedTimestamp, List<BookClub> organizedClubs, List<Membership> memberships, List<ChatMessage> chatMessages) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.profilePicture = profilePicture;
        this.createdTimestamp = createdTimestamp;
        this.modifiedTimestamp = modifiedTimestamp;
        this.deletedTimestamp = deletedTimestamp;
        this.organizedClubs = organizedClubs;
        this.memberships = memberships;
        this.chatMessages = chatMessages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public OffsetDateTime getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(OffsetDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public OffsetDateTime getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    public void setModifiedTimestamp(OffsetDateTime modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    public OffsetDateTime getDeletedTimestamp() {
        return deletedTimestamp;
    }

    public void setDeletedTimestamp(OffsetDateTime deletedTimestamp) {
        this.deletedTimestamp = deletedTimestamp;
    }

    public List<BookClub> getOrganizedClubs() {
        return organizedClubs;
    }

    public void setOrganizedClubs(List<BookClub> organizedClubs) {
        this.organizedClubs = organizedClubs;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }

    public List<ChatMessage> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<ChatMessage> chatMessages) {
        this.chatMessages = chatMessages;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(email, user.email) && Objects.equals(profilePicture, user.profilePicture) && Objects.equals(createdTimestamp, user.createdTimestamp) && Objects.equals(modifiedTimestamp, user.modifiedTimestamp) && Objects.equals(deletedTimestamp, user.deletedTimestamp) && Objects.equals(organizedClubs, user.organizedClubs) && Objects.equals(memberships, user.memberships) && Objects.equals(chatMessages, user.chatMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phoneNumber, email, profilePicture, createdTimestamp, modifiedTimestamp, deletedTimestamp, organizedClubs, memberships, chatMessages);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", createdTimestamp=" + createdTimestamp +
                ", modifiedTimestamp=" + modifiedTimestamp +
                ", deletedTimestamp=" + deletedTimestamp +
                ", organizedClubs=" + organizedClubs +
                ", memberships=" + memberships +
                ", chatMessages=" + chatMessages +
                '}';
    }
}
