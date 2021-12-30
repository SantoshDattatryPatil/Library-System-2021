package in.techsofts.Library.System.Controller;

import in.techsofts.Library.System.Entity.AddResponse;
import in.techsofts.Library.System.Entity.Book;
import in.techsofts.Library.System.Entity.Publication;
import in.techsofts.Library.System.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private AddResponse addResponse;
@PostMapping("/save/{id}")
    public ResponseEntity saveRecord(@Validated @PathVariable Long id, @RequestBody Book book){

      Book booksave=bookService.saveBook(id,book);
        HttpHeaders headers = new HttpHeaders();

        addResponse.setMsg("Book saved successfully");
        addResponse.setId(booksave.getId());
        return new ResponseEntity<AddResponse>(addResponse, HttpStatus.CREATED);
    }

}
