package dripStock;

import java.util.ArrayList;

public class Backtraking {
    //ArrayList <Lot> combinaisonRetenu;
    //double beneficeRetenu;
    ArrayList <Lot> listLot;
    double beneficeMax;
    ArrayList <Lot> combinaisonsBeneficeMax;
    public Backtraking(ArrayList <Lot> listeLots, double volumeVehicule){
        beneficeMax = 0.0;
        combinaisonsBeneficeMax = new ArrayList<Lot>();
        listLot = new ArrayList<Lot>();
    }
    public double getBeneficeMax(){
        return this.beneficeMax;
    }

    public ArrayList<Lot> getCombinaisonsBenefice_max() {
        return combinaisonsBeneficeMax;
    }

    public void chercherMeilleureCombinaison(int indice, double volumeRestant, double beneficeRetenu, ArrayList <Lot> combinaisonLotRetenu){


    }
}


