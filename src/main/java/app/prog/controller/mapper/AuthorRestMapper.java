package app.prog.controller.mapper;

import app.prog.controller.response.AuthorResponse;
import app.prog.controller.response.CreateAuthorResponse;
import app.prog.controller.response.UpdateAuthorResponse;
import app.prog.model.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorRestMapper {
    public AuthorResponse toRest(Author author) {
        return AuthorResponse.builder()
                .id(author.getId())
                .name(author.getName())
                .particularity(author.getParticularity())
                .hasParticularity(author.hasParticularity())
                .build();
    }

    public Author toDomain(CreateAuthorResponse createAuthorResponse) {
        return Author.builder()
                .name(createAuthorResponse.getName())
                .birthDate(createAuthorResponse.getBirthDate())
                .particularity(createAuthorResponse.getParticularity())
                .build();
    }

    public Author toDomain(UpdateAuthorResponse updateAuthorResponse) {
        return Author.builder()
                .id(updateAuthorResponse.getId())
                .name(updateAuthorResponse.getName())
                .birthDate(updateAuthorResponse.getBirthDate())
                .particularity(updateAuthorResponse.getParticularity())
                .build();
    }
}
