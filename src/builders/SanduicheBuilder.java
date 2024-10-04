package builders;

import entidades.SanduicheRefatorado;

public class SanduicheBuilder {
    private SanduicheRefatorado sanduiche
            = new SanduicheRefatorado();

    // equivalente a linha seis
    //public SanduicheBuilder(){
    //   this.sanduiche = new SanduicheRefatorado();
    //}

    public SanduicheBuilder setPao(String pao){
        this.sanduiche.setPao(pao);
        return this;
    }

    public SanduicheBuilder setCarne(String carne){
        this.sanduiche.setCarne(carne);
        return this;
    }

    public SanduicheBuilder setSalada(String salada){
        this.sanduiche.setSalada(salada);
        return this;
    }

    public SanduicheBuilder setTemMolho(Boolean temMolho){
        this.sanduiche.setTemMolho(temMolho);
        return this;
    }

    public SanduicheRefatorado build(){
        return this.sanduiche;
    }
}
