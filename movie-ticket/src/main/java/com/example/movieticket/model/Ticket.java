package com.example.movieticket.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "imdbId")
    private String imdbId;

    @Column(name = "numOfSeat")
    private Integer numOfSeat;
}
