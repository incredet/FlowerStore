package com.example.demo.flower;


import org.springframework.data.jpa.repository.JpaRepository;
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
