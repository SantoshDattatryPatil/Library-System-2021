package in.techsofts.Library.System.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable {
//    @CreatedBy
//    protected String createdBy;
//   @LastModifiedBy
//    protected String lastModifiedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
protected Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    protected Date lastMdifiedDate;
}
