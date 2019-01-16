package managedBeans;

// @author WolfBattle

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UserManager {
    
    public static String user;

    private String aux;

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        UserManager.user = user;
    }

    public String getAux() {
        return user;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }
    
    public String logout() {
        user = null;
        return "index";
    }
}
