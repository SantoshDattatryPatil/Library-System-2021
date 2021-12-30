package in.techsofts.Library.System.ServiceImp;

import in.techsofts.Library.System.Entity.Publication;
import in.techsofts.Library.System.Repository.PublicationRepository;
import in.techsofts.Library.System.Service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PublicationServiceImp  implements PublicationService {
@Autowired
    private PublicationRepository publicationRepository;
    @Override
    public Publication savePublication(Publication publication) {
        return publicationRepository.save(publication) ;
    }

    @Override
    public Publication findById(Long id) {
        return null;
    }

    @Override
    public List<Publication> getAll() {
        return publicationRepository.findAll();
    }
}
