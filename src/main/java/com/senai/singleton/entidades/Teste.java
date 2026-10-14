package com.senai.singleton.entidades;

import com.senai.singleton.Singleton;

public class Teste {

    public void testar(){
        for (Carro  c : Singleton.getInstanciA().carros){
            System.out.println(c.getModelo());
        }


    }
}
