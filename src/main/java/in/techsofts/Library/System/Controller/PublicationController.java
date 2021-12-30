package in.techsofts.Library.System.Controller;

import in.techsofts.Library.System.Entity.AddResponse;
import in.techsofts.Library.System.Entity.Publication;
import in.techsofts.Library.System.Service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publication")
public class PublicationController {
    @Autowired
    private PublicationService publicationService;

    @Autowired
    private AddResponse addResponse;
    @PostMapping("/save")
    public ResponseEntity saveRecord(@Validated @RequestBody Publication publication){

        Publication pub=publicationService.savePublication(publication);
        HttpHeaders headers = new HttpHeaders();

        addResponse.setMsg("Publication center created successfully");
        addResponse.setId(pub.getId());
        return new ResponseEntity<AddResponse>(addResponse, HttpStatus.CREATED);
    }
    @GetMapping("/")
    public List<Publication> getAll() {

        List<Publication> publications=publicationService.getAll();
        return publications;
    }


}
