package iftm.backend.api_curso.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iftm.backend.api_curso.domain.Aluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    List<Aluno> alunos = new ArrayList<>();

    @PostMapping
    public ResponseEntity<?> novo(@RequestBody Aluno aluno) {
        alunos.add(aluno);
        return ResponseEntity.ok(aluno);
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listarAlunos() {
        return ResponseEntity.ok(alunos);
    }

    @GetMapping("/alunos/{ra}")
    public ResponseEntity<?> buscarAlunoPorRa(@PathVariable String ra) {
        List<Aluno> alunosFiltrados = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.ra.equalsIgnoreCase(ra)) {
                alunosFiltrados.add(aluno);
            }
        }
        return ResponseEntity.ok(alunosFiltrados);
    }

    @PutMapping("/alunos/{ra}")
    public ResponseEntity<?> atualizarAluno(@PathVariable String ra, @RequestBody Aluno alunoAtualizado) {
        for (Aluno aluno : alunos) {
            if (aluno.ra.equalsIgnoreCase(ra)) {
                aluno.nome = alunoAtualizado.nome;
                aluno.email = alunoAtualizado.email;
                aluno.cursoSigla = alunoAtualizado.cursoSigla;
                return ResponseEntity.ok(aluno);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/alunos/{ra}")
    public ResponseEntity<?> deletarAluno(@PathVariable String ra) {
        for (Aluno aluno : alunos) {
            if (aluno.ra.equalsIgnoreCase(ra)) {
                alunos.remove(aluno);
                return ResponseEntity.ok(aluno);
            }
        }
        return ResponseEntity.notFound().build();
    }

}
