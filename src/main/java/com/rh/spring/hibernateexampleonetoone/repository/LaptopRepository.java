package com.rh.spring.hibernateexampleonetoone.repository;

import com.rh.spring.hibernateexampleonetoone.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}
