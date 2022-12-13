package app.prog.controller.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ExeptionHandler {
    @ExceptionHandler(NotFoundExeption.class)
    public ResponseEntity<Object> handleNotFoundException(NotFoundExeption notFoundExeption) {
        Exception exeption = new Exception(
                notFoundExeption.getMessage(),
                HttpStatus.NOT_FOUND,
                Instant.now(),
                notFoundExeption
        );
        return ResponseEntity
                .status(404)
                .body(exeption);
    }
}
