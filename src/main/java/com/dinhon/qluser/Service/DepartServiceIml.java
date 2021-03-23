package com.dinhon.qluser.Service;

import com.dinhon.qluser.Models.Depart;
import com.dinhon.qluser.Repository.DepartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartServiceIml implements DepartServices{
    @Autowired
    private DepartRepo departRepo ;

    @Override
    public Depart  save(Depart entity) {
        return departRepo.save(entity);
    }

    @Override
    public List<Depart> saveAll(List<Depart> entities) {
        return (List<Depart>) departRepo.saveAll(entities);
    }

    @Override
    public Optional<Depart> findById(Integer integer) {
        return departRepo.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return departRepo.existsById(integer);
    }

    @Override
    public List<Depart> findAll() {
        return (List<Depart>) departRepo.findAll();
    }

    @Override
    public List<Depart> findAllById(List<Integer> integers) {
        return (List<Depart>) departRepo.findAllById(integers);
    }

    @Override
    public long count() {
        return departRepo.count();
    }

    @Override
    public void deleteById(Integer integer) {
        departRepo.deleteById(integer);
    }

    @Override
    public void delete(Depart entity) {
        departRepo.delete(entity);
    }

    @Override
    public void deleteAll(List<Depart> entities) {
        departRepo.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        departRepo.deleteAll();
    }
}
