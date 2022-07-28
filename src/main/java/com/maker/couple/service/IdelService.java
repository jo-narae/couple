package com.maker.couple.service;

import com.maker.couple.domain.Idel;
import com.maker.couple.repository.IdelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class IdelService {

    @Autowired
    IdelRepository idelRepository;

    public List<Idel> findAll() {
        return idelRepository.findAll();
    }

    public Idel findById(int id) {
        return idelRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Idel save(Idel idel) {
        return idelRepository.save(idel);
    }

    public void delete(int id) {
        idelRepository.deleteById(id);
    }
}
