package iftm.pback.jpa.controller;

import java.util.List;
import java.util.Locale.Category;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iftm.pback.jpa.domain.Categoria;
import iftm.pback.jpa.repository.CategoriaRepository;
import jakarta.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaRepository repository;

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }

    // @GetMapping
    // public ResponseEntity<List<Categoria>> listar() {
    //     return ResponseEntity.ok(repository.findAll());
    // }

    @GetMapping("{id}")
    public ResponseEntity<Categoria> buscarPorId (@PathVariable Integer id) {
        Categoria categoria = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(
                                "Categoria com id " + id + " não encontrado"));
    
        return ResponseEntity.ok(categoria);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listarTodos(
                                            @RequestParam(required = false) String nome) {
        List<Categoria> categorias;
        if (nome == null) {
            categorias = repository.findAll();
        } else {
            categorias = repository.findByNomeContainingIgnoreCase(nome);
        }
        return ResponseEntity.ok(categorias);
    }
    
}
