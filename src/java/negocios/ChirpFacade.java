package negocios;

import entidade.Chirp;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class ChirpFacade extends AbstractFacade<Chirp> {

    @PersistenceContext(unitName = "Chirper1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ChirpFacade() {
        super(Chirp.class);
    }

}
