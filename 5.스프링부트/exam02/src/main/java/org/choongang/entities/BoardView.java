package org.choongang.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class BoardView {
    @Id
    private Long seq;

    @Id
    private int uid;
}
