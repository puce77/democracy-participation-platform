package com.github.puce77.democracyparticipationplatform.view.renderer;

import com.github.puce77.democracyparticipationplatform.model.IdeaEntity;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.data.renderer.ComponentRenderer;

public class IdeaComponentRenderer extends ComponentRenderer<Label, IdeaEntity> {
    public IdeaComponentRenderer() {
        super(ideaEntity -> {
            Label label = new Label(ideaEntity.getTitle());
            return label;
        });
    }
}
