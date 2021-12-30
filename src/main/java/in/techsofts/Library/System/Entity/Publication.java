package in.techsofts.Library.System.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Publication extends Auditable{
    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    @NotNull(message = " name does not empty")
    private String name;
    private String address;
    private String URL;
    @Column(unique=true)
    private long phone;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "publication", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("publication")
    private List<Book> books=new ArrayList<>();

    public void addBook(Book book)
    {
        this.books.add(book);
    }
    public void removeBook(Book book)
    {
        this.books.remove(book);


    }
}
