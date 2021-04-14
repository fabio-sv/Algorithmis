package teste;

public class Carro extends Proprietario{

    private String marca = "Vw";

    public Carro(String nome) {
        super(nome);
    }

    public String getMarca() {
        return marca;
    }


}
