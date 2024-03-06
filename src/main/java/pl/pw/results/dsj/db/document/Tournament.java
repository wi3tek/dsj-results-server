package pl.pw.results.dsj.db.document;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Document("Tournament")
public class Tournament extends BaseEntity {

    @Id
    private String id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isOpen;
    private List<Competition> competitions;

}
