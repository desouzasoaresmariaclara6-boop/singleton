package com.senai.singleton;

import com.senai.singleton.entidades.Carro;

import java.util.ArrayList;

public class Singleton {


    private static Singleton instancia;
    public ArrayList<Carro> carros = new ArrayList<>();

    private Singleton() {
    }

    public static Singleton getInstanciA() {
    if(instancia == null){
     instancia = new Singleton();
     }
     return instancia;
    }
}
