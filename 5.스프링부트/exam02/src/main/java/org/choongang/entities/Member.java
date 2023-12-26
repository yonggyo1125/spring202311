package org.choongang.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="USERS",
        indexes = @Index(name="idx_member_createdAt", columnList = "createdAt DESC"))
public class Member {
    @Id @GeneratedValue
    private Long seq;
    private String email;
    private String name;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
