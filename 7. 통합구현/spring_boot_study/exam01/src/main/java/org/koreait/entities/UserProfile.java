package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @Data
public class UserProfile {
    @Id @GeneratedValue
    private Long id;
    private String profileImage;

    @OneToOne(mappedBy = "profile")
    private Users user;
}
