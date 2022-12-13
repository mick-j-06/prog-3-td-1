package app.prog.controller.exeption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class Exception {
    private String message;
    private HttpStatus status;
    private Instant instant;
    private String stackTrace;
}
