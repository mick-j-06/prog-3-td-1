package app.prog.controller.mapper;

import app.prog.controller.response.BookResponse;
import app.prog.controller.response.CreateBookResponse;
import app.prog.controller.response.UpdateBookResponse;
import app.prog.model.Author;
import app.prog.model.BookEntity;
import app.prog.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BookRestMapper {
    private AuthorService authorService;
    public BookResponse toRest(BookEntity domain) {
        return BookResponse.builder()
                .id(domain.getId())
                .title(domain.getTitle())
                .author(domain.getAuthor() != null ? domain.getAuthor().getName() : null)
                .hasAuthor(domain.hasAuthor())
                .build();
    }

    public BookEntity toDomain(CreateBookResponse rest) {
        Author author = authorService.getByName(rest.getAuthor());
        return BookEntity.builder()
                .author(author)
                .title(rest.getTitle())
                .pageNumber(0) //Constraint not null in database, default value is 0
                .build();
    }

    public BookEntity toDomain(UpdateBookResponse rest) {
        Author author = authorService.getByName(rest.getAuthor());
        return BookEntity.builder()
                .id(rest.getId())
                .author(author)
                .title(rest.getTitle())
                .pageNumber(0) //Constraint not null in database, default value is 0
                .build();
    }
}
