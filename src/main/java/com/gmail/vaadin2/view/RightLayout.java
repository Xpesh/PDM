package com.gmail.vaadin2.view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class RightLayout extends VerticalLayout {

    private MainScreen mainScreen;

    public RightLayout(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
        setWidthFull();
    }
}
