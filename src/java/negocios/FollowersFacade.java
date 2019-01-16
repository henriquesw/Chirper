package negocios;

// @author WolfBattle

import entidade.Followers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class FollowersFacade extends AbstractFacade<Followers> {

    @PersistenceContext(unitName = "Chirper1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FollowersFacade() {
        super(Followers.class);
    }

}
