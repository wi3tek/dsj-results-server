package pl.pw.results.dsj.controller.requestdata;

import lombok.*;
import pl.pw.results.dsj.controller.requestdata.enums.CompetitionType;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Competition {

    private LocalDateTime competitionDate;
    private String location;
    private List<CompetitionRow> competitionRows;
    private CompetitionType competitionType;
}
