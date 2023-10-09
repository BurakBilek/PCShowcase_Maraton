package com.burak.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false,unique = true)
    String username;

    @Column(nullable = false)
    String ad;

    @Column(nullable = false)
    String soyad;

    @Column(nullable = false,unique = true)
    String email;

    @Column(nullable = false)
    String password;
    @Embedded
    BaseEntity baseEntity;

}
