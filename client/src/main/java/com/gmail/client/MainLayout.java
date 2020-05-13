package com.gmail.client;

import com.gmail.client.config.SpringConfig;
import com.gmail.client.controller.Controller;
import com.gmail.client.controller.ControllerImpl;
import com.gmail.client.model.Model;
import com.gmail.client.model.ModelLocal;
import com.gmail.client.view.*;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@Route
//@PWA(name = "Vaadin Application",
//        shortName = "Vaadin App",
//        description = "This is an example Vaadin application.",
//        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainLayout extends HorizontalLayout {

    public MainLayout() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Model model = context.getBean("modelLocal",ModelLocal.class);
        View view = context.getBean("viewImpl",ViewImpl.class);
        Controller controller = context.getBean("controllerImpl",ControllerImpl.class);
        SideBarLayout sideBarLayout = context.getBean("sideBarLayout",SideBarLayout.class);
        CenterLayout centerLayout = context.getBean("centerLayout",CenterLayout.class);
        RightLayout rightLayout = context.getBean("rightLayout",RightLayout.class);
        add(sideBarLayout,centerLayout,rightLayout);
        setHeightFull();
    }
}
