package iftm.pback.jpa.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import iftm.pback.jpa.dto.ErroDTO;
import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class ExceptionHandlerController {
    
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErroDTO> tratarNaoEncontrado(EntityNotFoundException e) {
        ErroDTO erro = ErroDTO.builder()
                                .message(e.getMessage())
                                .date(LocalDateTime.now())
                                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }
}
