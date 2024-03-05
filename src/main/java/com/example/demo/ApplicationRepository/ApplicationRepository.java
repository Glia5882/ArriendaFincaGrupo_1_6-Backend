package com.example.demo.ApplicationRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Arrendador;


public interface ApplicationRepository extends CrudRepository<Arrendador, Long>{

}
