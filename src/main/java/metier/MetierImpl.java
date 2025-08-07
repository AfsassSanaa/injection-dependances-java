package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;
    //injection via setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul(){
        Double data = dao.getData();
        return data * 2; // EX: traitement
    }
}
