package io.github.Erissonteixeira.api_harrypotter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Wizard {
    private Long id;
    private String name;
    private String home;
}
