package org.choongang.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class BoardData extends Base {
    @Id
    @GeneratedValue
    private Long seq;

    @Column(length=100, nullable = false)
    public String subject;

    @Lob
    @Column(nullable = false)
    public String content;

    @ManyToOne
    @JoinColumn(name="userNo")
    private Member member;

    @ManyToMany
    private List<HashTag> tags = new ArrayList<>();
}
