package com.github.puce77.democracyparticipationplatform.view;

import com.github.puce77.democracyparticipationplatform.model.AdministrativeLevelEntity;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.List;
import java.util.Locale;
import java.util.Set;

@Route
public class MainView extends VerticalLayout {

    public static final String CANTON = "canton";
    public static final String COMMUNITY = "community";

    public MainView() {
//        layout.setComponentAlignment(myComponent, Alignment.MIDDLE_CENTER);
        ComboBox<AdministrativeLevelEntity> countryConfigComboBox = createCountryConfigComboBox();
        add(countryConfigComboBox);
        add(new IdeasOverviewKanbanBoard());
        add(new Button("Click me", e -> Notification.show("Hello, Spring+Vaadin user!")));
    }

    private ComboBox<AdministrativeLevelEntity> createCountryConfigComboBox() {
        ComboBox<AdministrativeLevelEntity> countryConfigComboBox = new ComboBox<>();
        countryConfigComboBox.setItemLabelGenerator(administrativeLevelEntity -> new Locale("", administrativeLevelEntity.getLevelId()).getDisplayCountry());
        countryConfigComboBox.setItems(createCountryConfigs());
        return countryConfigComboBox;
    }

    // TODO [fb, 6.2.2021]: load from db
    private List<AdministrativeLevelEntity> createCountryConfigs() {
        return List.of(createSwitzerlandAdminLevel());
    }

    private AdministrativeLevelEntity createSwitzerlandAdminLevel() {
        AdministrativeLevelEntity administrativeLevelEntity = new AdministrativeLevelEntity();
        administrativeLevelEntity.setTypeId("country");
        administrativeLevelEntity.setLevelId("CH");
        administrativeLevelEntity.setSubLevels(List.of(createSwissCantonBernAdminLevel(),
                createSwissCantonBaselStadtAdminLevel()));
        return administrativeLevelEntity;
    }

    private AdministrativeLevelEntity createSwissCantonBernAdminLevel() {
        AdministrativeLevelEntity administrativeLevelEntity = new AdministrativeLevelEntity();
        administrativeLevelEntity.setTypeId(CANTON);
        administrativeLevelEntity.setLevelId("BE");
        administrativeLevelEntity.setSubLevels(List.of(createSwissCityBernAdminLevel()));
        return administrativeLevelEntity;
    }

    private AdministrativeLevelEntity createSwissCantonBaselStadtAdminLevel() {
        AdministrativeLevelEntity administrativeLevelEntity = new AdministrativeLevelEntity();
        administrativeLevelEntity.setTypeId(CANTON);
        administrativeLevelEntity.setLevelId("BS");
        administrativeLevelEntity.setSubLevels(List.of(createSwissCityBernAdminLevel()));
        return administrativeLevelEntity;
    }

    private AdministrativeLevelEntity createSwissCityBernAdminLevel() {
        AdministrativeLevelEntity administrativeLevelEntity = new AdministrativeLevelEntity();
        administrativeLevelEntity.setTypeId(COMMUNITY);
        administrativeLevelEntity.setLevelId("Bern");
    return administrativeLevelEntity;
    }


}