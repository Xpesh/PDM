package com.gmail.client.view;

import com.gmail.client.MainLayout;
import com.gmail.client.controller.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ViewImpl implements View {
    private Controller controller;
    @Autowired
    SideBarLayout sideBarLayout;
    @Autowired
    CenterLayout centerLayout;
    @Autowired
    RightLayout rightLayout;

    @Autowired
    public ViewImpl(Controller controller) {
        this.controller = controller;
    }
}
