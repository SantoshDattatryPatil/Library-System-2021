package in.techsofts.Library.System.ServiceImp;

import in.techsofts.Library.System.Entity.Book;
import in.techsofts.Library.System.Exception.ResourceNotFoundException;
import in.techsofts.Library.System.Repository.BookRepository;
import in.techsofts.Library.System.Repository.PublicationRepository;
import in.techsofts.Library.System.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableJpaAuditing
public class BookServiceImp implements BookService {
    @Autowired
    private PublicationRepository publicationRepository;
    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book saveBook(Long id, Book book) {
        Book book1=publicationRepository.findById(id).map(publication -> {
            book.setPublication(publication);
            return bookRepository.save(book);
        }).orElseThrow(() -> new ResourceNotFoundException("Publication" + id + " not found"));
return book;
    }

    @Override
    public Book findByBookId(long id) {
        return null;
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
