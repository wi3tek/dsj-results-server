package pl.pw.results.dsj.db.document;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BaseEntity {

    private LocalDateTime creationDate;
    private LocalDateTime lastModificationDate;
    private String createdBy;
    private Boolean isDeleted;
}
