package com.github.puce77.democracyparticipationplatform.view;

import com.github.puce77.democracyparticipationplatform.model.IdeaEntity;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class IdeasOverviewKanbanBoard extends HorizontalLayout {
    private IdeaListBox newIdeasListBox = new IdeaListBox();
    private IdeaListBox initialyAssessedIdeasListBox = new IdeaListBox();
    private  IdeaListBox pursuedIdeasListBox = new IdeaListBox();
    private   IdeaListBox closedIdeasListBox = new IdeaListBox();

    public IdeasOverviewKanbanBoard() {
        add(newIdeasListBox, initialyAssessedIdeasListBox, pursuedIdeasListBox, closedIdeasListBox);
        newIdeasListBox.setItems(createIdeaEntity("My great idea #1"));
    }

    private IdeaEntity createIdeaEntity(String title){
        IdeaEntity idea = new IdeaEntity();
        idea.setTitle(title);
        return idea;
    }
}
