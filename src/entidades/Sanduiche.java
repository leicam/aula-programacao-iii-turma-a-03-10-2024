package entidades;

public class Sanduiche {
    private String pao = "";
    private String carne = "";
    private String salada = "";
    private Boolean temMolho = false;

    public Sanduiche(String pao, String carne) {
        this.pao = pao;
        this.carne = carne;
    }

    public Sanduiche(String pao, String carne, String salada) {
        this.pao = pao;
        this.carne = carne;
        this.salada = salada;
    }

    public Sanduiche(String pao, String carne, String salada, Boolean temMolho) {
        this.pao = pao;
        this.carne = carne;
        this.salada = salada;
        this.temMolho = temMolho;
    }

    @Override
    public String toString() {
        return "Pão: " + this.pao + " " +
                "Carne: " + this.carne + " " +
                "Salada: " + this.salada + " " +
                "Tem molho: " + (this.temMolho ? "Sim" : "Não");
    }
}