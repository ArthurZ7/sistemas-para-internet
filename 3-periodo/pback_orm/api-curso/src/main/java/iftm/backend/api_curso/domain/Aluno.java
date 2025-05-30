package iftm.backend.api_curso.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Aluno {
    public String ra;
    public String nome;
    public String email;
    public String cursoSigla;
    public Curso curso;
}
