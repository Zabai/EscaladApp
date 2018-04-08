package entities;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "mountains")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mountain.findAll", query = "SELECT m FROM Mountain m")
    , @NamedQuery(name = "Mountain.findById", query = "SELECT m FROM Mountain m WHERE m.id = :id")
    , @NamedQuery(name = "Mountain.findByName", query = "SELECT m FROM Mountain m WHERE m.name = :name")
    , @NamedQuery(name = "Mountain.findByAltitude", query = "SELECT m FROM Mountain m WHERE m.altitude = :altitude")
    , @NamedQuery(name = "Mountain.findByLocation", query = "SELECT m FROM Mountain m WHERE m.location = :location")
    , @NamedQuery(name = "Mountain.findByImage", query = "SELECT m FROM Mountain m WHERE m.image = :image")})
public class Mountain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    @Expose
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "altitude")
    private Float altitude;
    @Size(max = 255)
    @Column(name = "location")
    private String location;
    @Size(max = 255)
    @Column(name = "image")
    private String image;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "mountain")
    private List<Favourite> favouriteList;
    @OneToMany(mappedBy = "mountain")
    private List<Climbed> climbedList;

    public Mountain() {
    }

    public Mountain(Integer id) {
        this.id = id;
    }

    public Mountain(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAltitude() {
        return altitude;
    }

    public void setAltitude(Float altitude) {
        this.altitude = altitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<Favourite> getFavouriteList() {
        return favouriteList;
    }

    public void setFavouriteList(List<Favourite> favouriteList) {
        this.favouriteList = favouriteList;
    }

    @XmlTransient
    public List<Climbed> getClimbedList() {
        return climbedList;
    }

    public void setClimbedList(List<Climbed> climbedList) {
        this.climbedList = climbedList;
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
        if (!(object instanceof Mountain)) {
            return false;
        }
        Mountain other = (Mountain) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mountain[ id=" + id + " ]";
    }
    
}
