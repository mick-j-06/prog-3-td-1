package app.prog.service;

import app.prog.model.Author;
import app.prog.repository.AuthorRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorService {
    private AuthorRepository authorRepository;

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Transactional
    public List<Author> createAuthor(List<Author> authorList) {
        return authorRepository.saveAll(authorList);
    }

    @Transactional
    public List<Author> updateAuthor(List<Author> authorList) {
        return authorRepository.saveAll(authorList);
    }

    public Author deleteById(int authorId) {
        Optional<Author> author = authorRepository.findById(authorId);
        if(author.isPresent()) {
            authorRepository.deleteById(authorId);
            return author.get();
        }
        else {
            throw new RuntimeException("BookEntity." + authorId + " not found");
        }
    }
}
