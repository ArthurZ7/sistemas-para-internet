package iftm.backend.api_curso.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    public String sigla;
    public String nome;
    public String descricao;
    public List<Aluno> alunos;
}
