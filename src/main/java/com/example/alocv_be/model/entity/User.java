package com.example.alocv_be.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne
    private Account account;
    private String phoneNumber;
    @OneToMany
    private List<CV> cvList;
    @OneToMany
    private List<Notification> notificationList;

    private boolean status;
}
