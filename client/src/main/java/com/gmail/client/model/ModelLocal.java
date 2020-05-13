package com.gmail.client.model;

import com.gmail.client.controller.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ModelLocal implements Model {
    Controller controller;

    @Autowired
    public ModelLocal(Controller controller) {
        this.controller = controller;
    }
}
