package managedBeans;

import entidade.Users;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ManagedBean
@RequestScoped
public class LoginBean {
    
    @PersistenceContext()
    private EntityManager em;

    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String login(){
        //List<Users> results = em.createNamedQuery("Users.findAll", Users.class).getResultList();
        List<Users> results = em.createNamedQuery("Users.autentication", Users.class).setParameter("userName", user).setParameter("userPassword", password).getResultList();
        if(!results.isEmpty()){
            System.out.println("login");
            UserManager.user = user;
            return "main";
        }
        return "";
    }

}
