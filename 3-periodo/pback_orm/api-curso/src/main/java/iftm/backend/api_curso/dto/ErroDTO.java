package iftm.backend.api_curso.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ErroDTO {
    private String mensagem;
    private LocalDateTime dataHora;
}