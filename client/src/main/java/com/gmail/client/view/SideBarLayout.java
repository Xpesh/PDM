package com.gmail.client.view;

import com.gmail.client.view.myDocuments.MyDocumentsView;
import com.gmail.client.view.myProfile.MyProfileView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("singleton")
public class SideBarLayout extends VerticalLayout{

    @Autowired
    private MyDocumentsView myDocumentsView;
    @Autowired
    private MyProfileView myProfileView;

    public SideBarLayout(){
        setMargin(false);
        setPadding(false);
        Style style = getStyle();
        style.set("background","lightgray");
        setWidth("20em");
    }

    @PostConstruct
    private void postConstruct(){
        Button myProfileButton = new Button("Профиль",myProfileView.bing());
        Button myDocumentsButton = new Button("Мои документы",myDocumentsView.bing());
        myDocumentsButton.setWidthFull();
        myProfileButton.setWidthFull();

        add(myProfileButton,myDocumentsButton);
    }

}
