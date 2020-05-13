package com.gmail.client.view.myDocuments;

import com.gmail.client.view.CenterLayout;
import com.gmail.client.view.RightLayout;
import com.gmail.client.view.SideBarLayout;
import com.gmail.client.view.entityView.PassportView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MyDocumentsView {

    @Autowired
    SideBarLayout sideBarLayout;
    @Autowired
    CenterLayout centerLayout;
    @Autowired
    RightLayout rightLayout;


    public ComponentEventListener<ClickEvent<Button>> bing(){
        return (ComponentEventListener<ClickEvent<Button>>) event -> {
            centerLayout.removeAll();
            rightLayout.removeAll();
            PassportView passportView = new PassportView(null, rightLayout);
            centerLayout.add(passportView.getPassportButton());
        };
    }


}
