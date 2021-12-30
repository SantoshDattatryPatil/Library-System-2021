package in.techsofts.Library.System.Repository;

import in.techsofts.Library.System.Entity.Book;
import in.techsofts.Library.System.Entity.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
}
