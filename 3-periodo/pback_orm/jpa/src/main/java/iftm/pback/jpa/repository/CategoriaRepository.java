package iftm.pback.jpa.repository;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iftm.pback.jpa.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    public List<Categoria> findByNomeContainingIgnoreCase(String nome);
}
