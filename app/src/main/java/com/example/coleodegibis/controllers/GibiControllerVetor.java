package com.example.coleodegibis.controllers;

import com.example.coleodegibis.entities.Gibi;
import com.example.coleodegibis.interfaces.IGibiController;

import java.util.ArrayList;
import java.util.List;

public class GibiControllerVetor implements IGibiController {

    private static GibiControllerVetor instace;

    private List<Gibi> gibis = new ArrayList<Gibi>();

    private  GibiControllerVetor(){}


    public  static GibiControllerVetor getInstace(){

        if(instace == null)
            instace = new GibiControllerVetor();
        return instace;

    }


    @Override
    public void create(Gibi gibi) {
        gibis.add(gibi);
    }

    @Override
    public List<Gibi> read() {
        return gibis;
    }

    @Override
    public Gibi update(long i, Gibi gibi) {
        return gibis.set((int) i, gibi);
    }

    @Override
    public void delete(long i) {

    }
}
