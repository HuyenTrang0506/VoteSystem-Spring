package com.example.votingsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "role")
    private String role;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
