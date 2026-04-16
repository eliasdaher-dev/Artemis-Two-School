package com.senai.backend2.artemis_two_school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.senai.backend2.artemis_two_school.models.Turma;



@Repository
public interface TurmaRepository extends JpaRepository <Turma, Integer> {

    
} 
    

