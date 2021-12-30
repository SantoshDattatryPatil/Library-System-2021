package in.techsofts.Library.System.Service;

import in.techsofts.Library.System.Entity.Book;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface BookService {
    public Book saveBook(Long id, Book book);
    public Book findByBookId(long id);

    List<Book> findAllBooks();
}
