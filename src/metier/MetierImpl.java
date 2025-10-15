package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    // Setter injection
    public void setDao(IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 *Math.PI/2;
        return res ;
    }
}

