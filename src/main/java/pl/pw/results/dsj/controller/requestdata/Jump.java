package pl.pw.results.dsj.controller.requestdata;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Jump {

    private BigDecimal distance;
    private Boolean isFallen;
}
