package app.prog.controller;

import app.prog.controller.mapper.AuthorRestMapper;
import app.prog.controller.response.AuthorResponse;
import app.prog.controller.response.CreateAuthorResponse;
import app.prog.controller.response.UpdateAuthorResponse;
import app.prog.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorController {
    private AuthorService authorService;
    private AuthorRestMapper authorRestMapper;

    @GetMapping(value = "/authors")
    public List<AuthorResponse> getAll() {
        return authorService.findAll()
                .stream().map(authorRestMapper::toRest)
                .toList();
    }

    @PostMapping(value = "/authors")
    public List<AuthorResponse> postAuthors(@RequestBody List<CreateAuthorResponse> createAuthorResponseList) {
        return authorService.createAuthor(createAuthorResponseList.stream().map(authorRestMapper::toDomain).toList())
                .stream().map(authorRestMapper::toRest)
                .toList();
    }

    @PutMapping(value = "/authors")
    public List<AuthorResponse> putAuthors(@RequestBody List<UpdateAuthorResponse> updateAuthorResponseList) {
        return authorService.updateAuthor(updateAuthorResponseList.stream().map(authorRestMapper::toDomain).toList())
                .stream().map(authorRestMapper::toRest)
                .toList();
    }

    @DeleteMapping(value = "/authors/{authorId}")
    public AuthorResponse deleteAuthor(@PathVariable(name = "authorId") Integer authorId) {
        return authorRestMapper
                .toRest(authorService.deleteById(authorId));
    }
}
