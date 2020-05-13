package com.gmail.client.view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class RightLayout extends VerticalLayout {

    public RightLayout() {
        setMargin(false);
        setPadding(false);
        setWidthFull();
        setMinWidth("60em");
    }
}
