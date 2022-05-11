package com.company;

class MerekHp {
    void penjelasan(){
        System.out.println("Inilah harga Hp yang sedang kami jual");
    }
}

class Oppo extends MerekHp{
    int harga1= 1500000;

}

class Vivo extends MerekHp{
    int harga2 = 2000000;
}

class Realme extends MerekHp{
    int harga3 = 1700000;
}

public class Main {

    public static void main(String[] args){

        MerekHp toko = new MerekHp();
        toko.penjelasan();

        System.out.println();

        Oppo hp_oppo = new Oppo();
        System.out.println("Harga HP bermerek OPPO: Rp "+hp_oppo.harga1);

        Vivo hp_vivo = new Vivo();
        System.out.println("Harga HP bermerek Vivo: Rp "+hp_vivo.harga2);

        Realme hp_realme = new Realme();
        System.out.println("Harga HP bermerek Realme: Rp "+hp_realme.harga3);

    }
}
