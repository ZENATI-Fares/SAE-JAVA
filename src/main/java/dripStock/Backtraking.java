package dripStock;

import java.util.ArrayList;

public class Backtraking {
    //ArrayList <Lot> combinaisonRetenu;
    //double beneficeRetenu;
    ArrayList <Lot> listLot;
    double beneficeMax;
    ArrayList <Lot> combinaisonsBeneficeMax;
    public Backtraking(ArrayList <Lot> listeLots, double volumeVehicule){
        listLot = listeLots;
        beneficeMax = 0.0;
        combinaisonsBeneficeMax = new ArrayList<Lot>();

    }
    public double getBeneficeMax(){
        return this.beneficeMax;
    }

    public ArrayList<Lot> getCombinaisonsBenefice_max() {
        return combinaisonsBeneficeMax;
    }

    public void chercherMeilleureCombinaison(int indice, double volumeRestant, double beneficeRetenu, ArrayList <Lot> combinaisonLotRetenu){
        if (indice >= this.listLot.size()){
            if (beneficeRetenu > beneficeMax){
                beneficeMax = beneficeRetenu;
                combinaisonsBeneficeMax = new ArrayList<Lot>(combinaisonLotRetenu);
            }

            return;
        }

        chercherMeilleureCombinaison(indice + 1, volumeRestant,beneficeRetenu,combinaisonLotRetenu);

        Lot lot = this.listLot.get(indice);
        if (lot.getVolume() <= volumeRestant){

            combinaisonLotRetenu.add(lot);


            chercherMeilleureCombinaison(indice +1, volumeRestant - lot.getVolume(),beneficeRetenu +  lot.getBenef(),combinaisonLotRetenu);
            combinaisonLotRetenu.remove(combinaisonLotRetenu.size() - 1);
        }
    }
}


