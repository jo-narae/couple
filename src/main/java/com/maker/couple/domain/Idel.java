package com.maker.couple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Idel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "range_start")
    private int rangeStart;

    @Column(name = "range_end")
    private int rangeEnd;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    public enum Type {
        Age,
        Tall
    }
}
