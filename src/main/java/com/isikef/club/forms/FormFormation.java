package com.isikef.club.forms;

import com.isikef.club.entities.ThemeFormation;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.core.annotations.ParameterObject;

@ParameterObject
@Getter
@Setter
public class FormFormation {

    @NotNull(message = "Le club est obligatoire")
    private Long clubId;

    @NotNull(message = "Le thème de la formation est obligatoire")
    private ThemeFormation theme;

}