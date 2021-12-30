package in.techsofts.Library.System.Service;

import in.techsofts.Library.System.Entity.Publication;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PublicationService {
    public Publication savePublication(Publication publication);
    public Publication findById(Long id);

    public List<Publication> getAll();
}
