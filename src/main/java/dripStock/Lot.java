package dripStock;

public class Lot{
    private String nomProduit;
    private int volume;
    private int benef;


    public Lot(String nomProduit, int volume, int benef){
        nomProduit = nomProduit;
        volume = volume;
        benef = benef;

    }

    public String getNomProduit(){
        return this.nomProduit;
    }

    public int getVolume(){
        return this.volume;
    }

    public int getBenef(){
        return this.benef;

    }




    }









