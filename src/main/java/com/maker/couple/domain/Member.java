package com.maker.couple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(length = 3)
    private int age;

    @Column(length = 3)
    private int tall;

    @Column
    private String img;

    @Column
    private String description;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Idel> idels;

    public enum Gender {
        Man,
        Woman
    }
}
