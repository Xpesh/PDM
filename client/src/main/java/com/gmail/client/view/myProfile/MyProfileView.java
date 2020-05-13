package com.gmail.client.view.myProfile;

import com.gmail.client.view.CenterLayout;
import com.gmail.client.view.RightLayout;
import com.gmail.client.view.SideBarLayout;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MyProfileView {

    @Autowired
    SideBarLayout sideBarLayout;
    @Autowired
    CenterLayout centerLayout;
    @Autowired
    RightLayout rightLayout;

    public ComponentEventListener<ClickEvent<Button>> bing(){
        return (ComponentEventListener<ClickEvent<Button>>) event -> {
            centerLayout.removeAll();
            centerLayout.add(new Label("Ты в профиле"));
            rightLayout.removeAll();
        };
    }
}
