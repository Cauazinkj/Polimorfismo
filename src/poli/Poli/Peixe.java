package poli.Poli;

public class Peixe extends Animal{

    private String corDaEscama;

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    //getter e setters

    public String getCorDaEscama() {
        return corDaEscama;
    }
    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
}
