package com.example.demo.ApplicationRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Application;


public interface ApplicationRepository extends CrudRepository<Application, Long>{

}