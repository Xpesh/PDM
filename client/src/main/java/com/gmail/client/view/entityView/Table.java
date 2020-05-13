package com.gmail.client.view.entityView;

import com.vaadin.flow.component.grid.Grid;

import java.util.List;

public class Table {
    private static final String FIRST_COLUMN_NAME="Поле";
    private static final String SECOND_COLUMN_NAME="Значение";

    private List<TableEntity> tableEntityList;

    public Table(List<TableEntity> tableEntityList) {
        this.tableEntityList = tableEntityList;
    }

    public Grid getGrid(){
        Grid<TableEntity> grid = new Grid<>(TableEntity.class);
        grid.setItems(tableEntityList);
        grid.getColumns().get(0).setHeader(FIRST_COLUMN_NAME);
        grid.getColumns().get(1).setHeader(SECOND_COLUMN_NAME);
        return grid;
    }

}