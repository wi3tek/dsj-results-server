package pl.pw.results.dsj.controller.requestdata;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CompetitionRow {

    private Player player;
    private Jump firstJump;
    private Jump secondJump;
    private BigDecimal points;
}
