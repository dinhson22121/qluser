package com.dinhon.qluser.Repository;

import com.dinhon.qluser.Models.Depart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartRepo extends CrudRepository<Depart,Integer> {

}

