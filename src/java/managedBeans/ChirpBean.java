/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author pagliares
 */
@ManagedBean
@RequestScoped
public class ChirpBean {
    
    private String chirp;

    public String getChirp() {
        return chirp;
    }

    public void setChirp(String chirp) {
        this.chirp = chirp;
    }

}
