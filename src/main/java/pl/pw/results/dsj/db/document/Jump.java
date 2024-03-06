package pl.pw.results.dsj.db.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
public class Jump {

    private BigDecimal distance;
    private Boolean isFallen;

}
