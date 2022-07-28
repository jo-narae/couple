package com.maker.couple.service;

import com.maker.couple.domain.Match;
import com.maker.couple.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

    public List<Match> findAll() {
        return matchRepository.findAll();
    }

    public Match findById(int id) {
        return matchRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Match save(Match match) {
        return matchRepository.save(match);
    }

    public void delete(int id) {
        matchRepository.deleteById(id);
    }
}
