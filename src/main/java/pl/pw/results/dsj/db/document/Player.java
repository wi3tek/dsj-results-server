package pl.pw.results.dsj.db.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Document("Player")
public class Player extends BaseEntity {

    @Id
    private Integer id;
    private String name;
    private String nationality;
    private List<CompetitionRow> competitionRows;
}
