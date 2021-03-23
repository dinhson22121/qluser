package com.dinhon.qluser.Service;

import com.dinhon.qluser.Models.Depart;
import java.util.List;
import java.util.Optional;

public interface DepartServices {

    Depart save(Depart entity);

    List<Depart> saveAll(List<Depart> entities);

    Optional<Depart> findById(Integer id);

    boolean existsById(Integer id);

    List<Depart> findAll();

    List<Depart> findAllById(List<Integer> integers);

    long count();

    void deleteById(Integer id);

    void delete(Depart entity);

    void deleteAll(List<Depart> entities);

    void deleteAll();
}
