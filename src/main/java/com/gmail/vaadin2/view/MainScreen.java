package com.gmail.vaadin2.view;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class MainScreen {
    private VerticalLayout sideBarLayout;
    private VerticalLayout centerLayout;
    private VerticalLayout rightLayout;

    public MainScreen(HorizontalLayout mainLayout){
        sideBarLayout = new SideBarLayout(this);
        centerLayout = new CenterLayout(this);
        rightLayout = new RightLayout(this);
        mainLayout.add(sideBarLayout,centerLayout,rightLayout);
        mainLayout.setHeightFull();
    }


    public VerticalLayout getSideBarLayout() {
        return sideBarLayout;
    }

    public VerticalLayout getCenterLayout() {
        return centerLayout;
    }

    public VerticalLayout getRightLayout() {
        return rightLayout;
    }
}
