package in.techsofts.Library.System.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class AddResponse {

    private String msg;
    private long id;
}
