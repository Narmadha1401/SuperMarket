package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Custmodel;
@Repository
public interface Custrepo extends JpaRepository<Custmodel, Integer>{

}
