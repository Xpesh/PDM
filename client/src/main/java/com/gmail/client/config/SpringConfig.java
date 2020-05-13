package com.gmail.client.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan("com.gmail.client.*")
public class SpringConfig {

//    @Bean
//    public Model modelLocal(){
//        return new ModelLocal(null);
//    }
//
//    @Bean
//    public View viewBean(){
//        return new ViewImpl(controllerBean());
//    }
//
//    @Bean
//    public Controller controllerBean(){
//        ControllerImpl controller =  new ControllerImpl();
//        controller.setModel(modelBean());
//        controller.setView(viewBean());
//        return controller;
//    }



}
