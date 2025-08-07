package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
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
