package com.gmail.vaadin2.view.myDocuments;

import com.gmail.vaadin2.view.MainScreen;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

public class MyDocumentsView {
    MainScreen mainScreen;
    public MyDocumentsView(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
    }

    public ComponentEventListener<ClickEvent<Button>> bing(){
        return (ComponentEventListener<ClickEvent<Button>>) event -> {
            mainScreen.getCenterLayout().removeAll();
            mainScreen.getCenterLayout().add(new Label("Ты в документах"));
        };
    }
}
