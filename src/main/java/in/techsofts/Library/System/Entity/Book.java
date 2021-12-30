package in.techsofts.Library.System.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
@Id
    @GeneratedValue
    private long id;
    private String title;
    private String isbn;
    private Date publicationDate;
    private int pages;
    private double price;
    @ManyToOne
    @JoinColumn(name="publcation_id", referencedColumnName = "id")
    @JsonIgnoreProperties("books")
    private Publication publication;

}
