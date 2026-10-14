package com.senai.singleton;

import com.senai.singleton.entidades.Carro;
import com.senai.singleton.entidades.Teste;
import javafx.application.Application;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Application.launch(HelloApplication.class, args);

        Carro c1 = new Carro("prata", "civic manual Vtec", "honda",1999);
        Carro c2 = new Carro("preto", "VW Beatle ISI EABBB", "Volkswagen",2014);
        Carro c3 = new Carro("Laranja", "7878", "Mazda",1979);

        Singleton.getInstanciA().carros.add(c1);
        Singleton.getInstanciA().carros.add(c2);
        Singleton.getInstanciA().carros.add(c3);

        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);

        for (Carro  c : carros){
            System.out.println(c.getModelo());
        }
        Teste teste = new Teste();
        teste.testar();
    }
}
