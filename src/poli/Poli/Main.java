package poli.Poli;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.reagir("Olá");
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(11, 45);
        cachorro.reagir(21, 00);
        cachorro.reagir(2, 7.5f);
        cachorro.reagir(17, 4.5f);
        cachorro.reagir(17, 12.5f);

    }
}
