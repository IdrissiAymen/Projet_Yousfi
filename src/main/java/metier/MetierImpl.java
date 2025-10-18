package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao; // couplage faible

    public MetierImpl() {
    }


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

