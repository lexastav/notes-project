package ru.lexastav.model;

import jakarta.persistence.*;
import lombok.*;



import java.util.Date;

@Data
//@Builder
@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue
    private Long id;
    protected Date dateAdd;
    @Column(unique = true)
    private String title;
    @Column(columnDefinition="TEXT")
    private String text;
    @Transient
    private int timeOfLife;

}