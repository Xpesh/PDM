package com.gmail.client.view.entityView;

public class TableEntity {
    private String valueFirstColumn;
    private String valueSecondColumn;

    public TableEntity(String valueFirstColumn, String valueSecondColumn) {
        this.valueFirstColumn = valueFirstColumn;
        this.valueSecondColumn = valueSecondColumn;
    }

    public String getValueFirstColumn() {
        return valueFirstColumn;
    }

    public String getValueSecondColumn() {
        return valueSecondColumn;
    }

    public void setValueFirstColumn(String valueFirstColumn) {
        this.valueFirstColumn = valueFirstColumn;
    }

    public void setValueSecondColumn(String valueSecondColumn) {
        this.valueSecondColumn = valueSecondColumn;
    }
}
