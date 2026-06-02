import java.util.ArrayList;

public class Backtracking {
    private ArrayList<Lot> listLot;
    private double beneficeMax;
    private ArrayList<Lot> combinaisonsBeneficeMax;

    public Backtracking(ArrayList<Lot> listLot, double volumeVehicule) {
        this.beneficeMax = 0.0;
        this.combinaisonsBeneficeMax = new ArrayList<>();
        this.listLot = listLot;
    }

    public double getBeneficeMax() {
        return this.beneficeMax;
    }

    public ArrayList<Lot> getCombinaisonsBeneficeMax() {
        return this.combinaisonsBeneficeMax;
    }

    public void chercherMeilleureCombinaison(int indice, double volumeRestant, double beneficeRetenu, ArrayList<Lot> combinaisonLotRetenu) {
        if (indice >= this.listLot.size()) {
            if (beneficeRetenu > this.beneficeMax) {
                this.beneficeMax = beneficeRetenu;
                this.combinaisonsBeneficeMax = new ArrayList<>(combinaisonLotRetenu);
            }
            return;
        }

        Lot lotActuel = this.listLot.get(indice);

        if (lotActuel.est_Valide(999999, (int) volumeRestant)) {
            combinaisonLotRetenu.add(lotActuel);
            
            chercherMeilleureCombinaison(
                indice + 1, 
                volumeRestant - lotActuel.getVolume(), 
                beneficeRetenu + lotActuel.getBenefice(), 
                combinaisonLotRetenu
            );
            
            combinaisonLotRetenu.remove(combinaisonLotRetenu.size() - 1);
        }

        chercherMeilleureCombinaison(indice + 1, volumeRestant, beneficeRetenu, combinaisonLotRetenu);
    }
}
