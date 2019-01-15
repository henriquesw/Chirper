package managedBeans;

import entidade.Users;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@ManagedBean
@RequestScoped
public class RegistrationBean {
    
    @PersistenceContext()
    private EntityManager em;
    
    private String user;
    private String email;
    private String password;
    private String passwordConfirmation;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }
    
    public void register(){
        
        Users u = new Users();
        u.setUserName(user);
        u.setEmail(email);
        u.setUserPassword(password);
        
        UsersController controller = new UsersController();
        controller.createR(u);
        
    }

}
