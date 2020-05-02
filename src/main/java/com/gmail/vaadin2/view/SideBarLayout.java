package com.gmail.vaadin2.view;

import com.gmail.vaadin2.view.myDocuments.MyDocumentsView;
import com.gmail.vaadin2.view.myProfile.MyProfileView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;

public class SideBarLayout extends VerticalLayout{
    private MainScreen mainScreen;

    public SideBarLayout(MainScreen mainScreen){
        this.mainScreen = mainScreen;
        Style style = getStyle();
        style.set("background","lightgray");
        setWidth("20em");

        Button myProfileButton = new Button("Профиль",new MyProfileView(mainScreen).bing());
        Button myDocumentsButton = new Button("Мои документы",new MyDocumentsView(mainScreen).bing());
        myDocumentsButton.setWidthFull();
        myProfileButton.setWidthFull();

        add(myProfileButton,myDocumentsButton);
    }
}
