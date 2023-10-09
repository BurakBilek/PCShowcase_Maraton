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
@Table(name = "tbl_computer_spec")
public class ComputerSpec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = true)
    String cpu;

    @Column(nullable = true)
    String ram;

    @Column(nullable = true)
    String harddisk;
    @Column(nullable = true)
    Long photoid;
    @Embedded
    BaseEntity baseEntity;
}
