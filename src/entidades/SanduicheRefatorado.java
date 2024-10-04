package entidades;

public class SanduicheRefatorado {
    private String pao = "";
    private String carne = "";
    private String salada = "";
    private Boolean temMolho = false;

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setTemMolho(Boolean temMolho) {
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
