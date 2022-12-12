package app.prog.controller.mapper;

import app.prog.controller.response.AuthorResponse;
import app.prog.controller.response.CreateAuthorResponse;
import app.prog.controller.response.UpdateAuthorResponse;
import app.prog.model.AuthorEntity;
import org.springframework.stereotype.Component;

@Component
public class AuthorRestMapper {
    public AuthorResponse toRest(AuthorEntity domain) {
        return AuthorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .particularity(domain.getParticularity())
                .hasParticularity(domain.hasParticularity())
                .build();
    }

    public AuthorEntity toDomain(CreateAuthorResponse rest) {
        return AuthorEntity.builder()
                .name(rest.getName())
                .particularity(rest.getParticularity())
                .build();
    }

    public AuthorEntity toDomain(UpdateAuthorResponse rest) {
        return AuthorEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .particularity(rest.getParticularity())
                .build();
    }
}
