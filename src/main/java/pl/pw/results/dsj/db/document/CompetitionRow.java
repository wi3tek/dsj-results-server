package pl.pw.results.dsj.db.document;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class CompetitionRow extends BaseEntity {

    private Integer id;
    private Jump firstJump;
    private Jump secondJump;
    private BigDecimal points;
    private Competition competition;
    private Player player;


}
