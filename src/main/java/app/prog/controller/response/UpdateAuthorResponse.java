package app.prog.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@Builder
public class UpdateAuthorResponse {
    private int id;
    private String name;
    private LocalDate birthDate;
    private String particularity;
}
