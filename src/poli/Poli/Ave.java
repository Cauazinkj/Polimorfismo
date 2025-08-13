package poli.Poli;

public class Ave extends Animal{

    private String corDaPena;

    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da ave");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    //getter e setters

    public String getCorDaPena() {
        return corDaPena;
    }
    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }
}
