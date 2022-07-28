package com.maker.couple.repository;

import com.maker.couple.domain.Idel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdelRepository extends JpaRepository<Idel, Integer> {
}
