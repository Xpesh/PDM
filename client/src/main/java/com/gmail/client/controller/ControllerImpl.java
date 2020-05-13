package com.gmail.client.controller;

import com.gmail.client.model.Model;
import com.gmail.client.view.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ControllerImpl implements Controller {
    @Autowired
    private Model model;
    @Autowired
    private View view;

    public ControllerImpl() {

    }
}
