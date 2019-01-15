package entidade;

// @author WolfBattle

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "chirp")
@NamedQueries({
    @NamedQuery(name = "Chirp.findAll", query = "SELECT c FROM Chirp c"),
    @NamedQuery(name = "Chirp.findById", query = "SELECT c FROM Chirp c WHERE c.id = :id"),
    @NamedQuery(name = "Chirp.findByUserName", query = "SELECT c FROM Chirp c WHERE c.userName = :userName"),
    @NamedQuery(name = "Chirp.findByTextChirp", query = "SELECT c FROM Chirp c WHERE c.textChirp = :textChirp")})
public class Chirp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "user_name", length = 30)
    private String userName;
    @Size(max = 255)
    @Column(name = "text_chirp", length = 255)
    private String textChirp;

    public Chirp() {
    }

    public Chirp(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTextChirp() {
        return textChirp;
    }

    public void setTextChirp(String textChirp) {
        this.textChirp = textChirp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chirp)) {
            return false;
        }
        Chirp other = (Chirp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Chirp[ id=" + id + " ]";
    }

}
