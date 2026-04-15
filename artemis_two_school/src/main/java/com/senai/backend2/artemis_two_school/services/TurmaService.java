package com.senai.backend2.artemis_two_school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend2.artemis_two_school.repositories.AlunoRepository;
import com.senai.backend2.artemis_two_school.repositories.TurmaRepository;
import com.senai.backend2.artemis_two_school.repositories.AlunoRepository;
import com.senai.backend2.artemis_two_school.models.Aluno;
import com.senai.backend2.artemis_two_school.models.Turma;
import com.senai.backend2.artemis_two_school.models.Aluno;
import com.senai.backend2.artemis_two_school.repositories.AlunoRepository;

@Service
public class TurmaService {
    @Autowired
    private TurmaRepository turmaRepository;

    public Long contarTurma() {
        return turmaRepository.count();
    }

    public Turma buscarTurma(Integer id) {
        return TurmaRepository.findById(id).get();
    }

    public List<Turma> listarTurma() {
        return TurmaRepository.findAll();
    }

    public Boolean deletarTurma(Integer id) {
        if (turmaRepository.existsById(id)) {
            turmaRepository.deleteById (id); 
            return true;
        }
        return false;
    }

    public Turma cadastrarTurma(Turma turma) {
        return TurmaRepository.save(turma);
    }

    public Turma atualizarTurma(Integer id, Turma turma) {
        Turma turmaRecuperada = buscarTurma(id);
        if (turmaRecuperada != null) {
            turmaRecuperada.setId(id);
            if (turma.getTurma() != null) {
                turmaRecuperada.setTurma(turma.getTurma());
            }
            if (turma.getTurma() != null) {
                turmaRecuperada.setTurma(turma.getTurma());
            }
            return turmaRepository.save(turmaRecuperada);
        }
        return null;
    }
}
