package org.etiya.services.dtos.requests.author;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddAuthorRequest {
    private String name;
    private String surname;
    private int age;
    private String nationalityId;
}
