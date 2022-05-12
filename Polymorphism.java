package com.company;

class Bahasa{
    public void obrolan(){
        System.out.println("Apa kabar?");
    }
}

class BahasaJawa extends Bahasa{
    public void obrolan(){
        System.out.println("Piye Kabare?");
    }
}
class BahasaSunda extends Bahasa{
    public void obrolan(){
        System.out.println("Kumaha damang?");
    }
}

public class Main {

    public static void main(String[] args) {
        BahasaJawa bahasa = new BahasaJawa();
        bahasa.obrolan();
    }
}
