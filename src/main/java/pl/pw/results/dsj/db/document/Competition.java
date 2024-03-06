package pl.pw.results.dsj.db.document;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class Competition extends BaseEntity {

    private Integer id;
    private LocalDateTime competitionDate;
    private String location;
    private List<CompetitionRow> competitionRows;
    private Tournament tournament;

}
