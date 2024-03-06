package pl.pw.results.dsj.controller.requestdata;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Player {

    private String name;
    private String nationality;
}
