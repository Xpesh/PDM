package com.gmail.client.view.entityView;

import com.gmail.shared.entity.Passport;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public final class PassportView {
    public static final String FIRST_NAME = "Имя";
    public static final String FAMILY_NAME = "Фамилия";
    public static final String PATRONYMIC="Отчество";
    public static final String SERIES = "Серия";
    public static final String NUMBER = "Номер";
    public static final String DEPARTMENT_CODE = "Код подразделения";
    public static final String DATE_ISSUE = "Дата выдачи";
    public static final String PLACE_ISSUE = "Место выдачи";
    public static final String PERSONAL_CODE = "Персональный код";
    public static final String SEX = "Пол";
    public static final String PLACE_BIRTH = "Место рождения";
    public static final String DATE_BIRTH = "Дата рождения";

    //todo hack
    Passport passportTest = new Passport("Василий","Собаев", "Иванович",
            4567, 123456, 636789,new Date(2013,10,30),
            "г.Воронеж", 1488228,Passport.Sex.Man, "г.Саранск",
            new Date(1999,10,30));

    private Passport passport;
    private VerticalLayout layout;


    public PassportView(Passport passport, VerticalLayout layout) {
        this.passport = passportTest;// todo hack
        this.layout = layout;
    }

    public Button getPassportButton(){
        Button button  = new Button("Паспорт");
        button.setWidthFull();

        Table table  = new Table(getTableEntityList(passport));
        button.addClickListener(e->{
            layout.removeAll();
            layout.add(table.getGrid());
        });
        return button;
    }

    private List<TableEntity> getTableEntityList(Passport passport){
        List<TableEntity> tableEntityList = new LinkedList<>();
        tableEntityList.add(new TableEntity(FIRST_NAME, passport.getFirstName()));
        tableEntityList.add(new TableEntity(FAMILY_NAME, passport.getFamilyName()));
        tableEntityList.add(new TableEntity(PATRONYMIC, passport.getPatronymic()));
        tableEntityList.add(new TableEntity(SERIES, passport.getSeries()+""));
        tableEntityList.add(new TableEntity(NUMBER, passport.getNumber()+""));
        tableEntityList.add(new TableEntity(DEPARTMENT_CODE, passport.getDepartmentCode()+""));
        tableEntityList.add(new TableEntity(DATE_ISSUE, passport.getDateIssue()+""));
        tableEntityList.add(new TableEntity(PLACE_ISSUE, passport.getPlaceIssue()));
        tableEntityList.add(new TableEntity(PERSONAL_CODE, passport.getPersonalCode()+""));
        tableEntityList.add(new TableEntity(SEX, passport.getSex()+""));
        tableEntityList.add(new TableEntity(PLACE_BIRTH, passport.getPlaceBirth()));
        tableEntityList.add(new TableEntity(PLACE_ISSUE, passport.getPlaceIssue()));
        return tableEntityList;
    }
}


