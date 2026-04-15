package com.senai.backend2.artemis_two_school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend2.artemis_two_school.models.Aluno;

public class TurmaRepository {

  

@Repository

public interface AlunoRepository extends JpaRepository <Aluno, Integer> {

    
} 
    
}
