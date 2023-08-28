package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity @Data
public class HashTag {
    @Id @GeneratedValue
    private Long id;

    private String tag;

    @ManyToMany(mappedBy = "tags")
    @ToString.Exclude
    private List<BoardData> boardData = new ArrayList<>();
}
