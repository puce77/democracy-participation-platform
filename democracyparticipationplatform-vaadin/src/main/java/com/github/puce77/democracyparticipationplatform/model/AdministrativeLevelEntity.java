package com.github.puce77.democracyparticipationplatform.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AdministrativeLevelEntity {
    private String typeId;
    private String levelId;
    private List<AdministrativeLevelEntity> subLevels;
}
