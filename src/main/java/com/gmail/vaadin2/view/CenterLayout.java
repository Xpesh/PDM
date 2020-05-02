package com.gmail.vaadin2.view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;

public class CenterLayout extends VerticalLayout {

    private MainScreen mainScreen;

    public CenterLayout(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
        Style style = getStyle();
        style.set("background","aliceblue");
        setWidth("100em");
    }
}
