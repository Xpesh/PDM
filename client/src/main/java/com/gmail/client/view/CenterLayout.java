package com.gmail.client.view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CenterLayout extends VerticalLayout {

    public CenterLayout() {
        setMargin(false);
        setPadding(false);
        Style style = getStyle();
        style.set("background","aliceblue");
        setWidth("20em");
    }
}
