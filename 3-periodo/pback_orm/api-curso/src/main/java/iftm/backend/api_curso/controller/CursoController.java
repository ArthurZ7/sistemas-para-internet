package iftm.backend.api_curso.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import iftm.backend.api_curso.domain.Curso;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/cursos")
public class CursoController {
    
    List<Curso> cursos = new ArrayList<>();

    @PostMapping
    public ResponseEntity<?> novo (@RequestBody Curso curso) {
        cursos.add(curso);
        return ResponseEntity.ok(curso);
    }

    @GetMapping
    public ResponseEntity<List<Curso>> listarCursos () {
        return ResponseEntity.ok(cursos);
    }
    
    @GetMapping("/{sigla}")
    public ResponseEntity<?> buscarCursoPorSigla(@PathVariable String sigla) {
        List<Curso> cursosFiltrados = new ArrayList<>();
        for (Curso curso : cursos) {
            if (curso.sigla.equalsIgnoreCase(sigla)) {
                cursosFiltrados.add(curso);
            }
        }
        return ResponseEntity.ok(cursosFiltrados);
    }

    @PutMapping("/{sigla}")
    public ResponseEntity<?> atualizarCurso(@PathVariable String sigla, @RequestBody Curso cursoAtualizado) {
        for (Curso curso : cursos) {
            if (curso.sigla.equalsIgnoreCase(sigla)) {
                curso.nome = cursoAtualizado.nome;
                curso.descricao = cursoAtualizado.descricao;
                return ResponseEntity.ok(curso);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{sigla}")
    public ResponseEntity<?> deletarCurso(@PathVariable String sigla) {
        for (Curso curso : cursos) {
            if (curso.sigla.equalsIgnoreCase(sigla)) {
                cursos.remove(curso);
                return ResponseEntity.ok().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{sigla}/alunos")
    public ResponseEntity<?> listarAlunosPorCurso(@PathVariable String sigla) {
        List<Curso> cursosFiltrados = new ArrayList<>();
        for (Curso curso : cursos) {
            if (curso.sigla.equalsIgnoreCase(sigla)) {
                cursosFiltrados.add(curso);
            }
        }
        return ResponseEntity.ok(cursosFiltrados);
    }


    

}
