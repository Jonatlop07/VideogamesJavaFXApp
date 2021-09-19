package com.jonathan.videogame.menu.controller;

import com.jonathan.videogame.menu.model.MenuModelInterface;
import com.jonathan.videogame.menu.view.MenuView;

import java.io.IOException;

public class MenuController extends MenuControllerInterface {
    private MenuModelInterface model;
    
    public MenuController( MenuModelInterface model ) throws IOException {
        this.model = model;
        view = new MenuView( this, model );
        view.createView();
    }
    
    @Override
    public void start() {
        
    }
}
