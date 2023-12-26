package org.choongang.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.choongang.commons.MemberType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name="USERS",
        indexes = @Index(name="idx_member_createdAt", columnList = "createdAt DESC"))
public class Member {
    @Id @GeneratedValue
    private Long seq;
    private String email;
    private String name;
    private String password; // varchar2
    //@Lob
    @Transient
    private String introduction; // CLOB

    @Enumerated(EnumType.STRING)
    private MemberType type;

    @CreationTimestamp // INSERT SQL 실행시
    private LocalDateTime createdAt;

    @UpdateTimestamp // UPDATE SQL 실행시
    private LocalDateTime modifiedAt;

    @Temporal(TemporalType.DATE)
    public Date dt;
}
