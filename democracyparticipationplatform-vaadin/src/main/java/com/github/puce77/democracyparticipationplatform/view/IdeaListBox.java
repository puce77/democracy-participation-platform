package com.github.puce77.democracyparticipationplatform.view;

import com.github.puce77.democracyparticipationplatform.model.IdeaEntity;
import com.github.puce77.democracyparticipationplatform.view.renderer.IdeaComponentRenderer;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.data.renderer.ComponentRenderer;

import java.awt.*;

public class IdeaListBox extends ListBox<IdeaEntity> {
    public IdeaListBox(){
        setRenderer(new IdeaComponentRenderer());
        setHeightFull(); // TODO: required?
    }
}
