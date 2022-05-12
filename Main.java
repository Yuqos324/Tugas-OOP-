package com.company;

class Olahraga{
    void bola(){
        System.out.println("Ada beberapa olahraga yang menggunakan bola");
    }
}

class SepakBola extends Olahraga{

    @Override
    void bola(){
        System.out.println("Salah satunya adalah sepak bola");
    }
}

public class Main {

    public static void main(String[] args) {
        Olahraga sport = new Olahraga();
        SepakBola sport1 = new SepakBola();

        sport1.bola();
    }
}
