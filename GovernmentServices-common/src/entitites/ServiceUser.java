/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Zaeem
 */
@Entity
@Table(name = "ServiceUser")
@NamedQueries({
    @NamedQuery(name = "ServiceUser.findAll", query = "SELECT s FROM ServiceUser s"),
    @NamedQuery(name = "ServiceUser.findByUserid", query = "SELECT s FROM ServiceUser s WHERE s.userid = :userid"),
    @NamedQuery(name = "ServiceUser.findByLastName", query = "SELECT s FROM ServiceUser s WHERE s.lastName = :lastName"),
    @NamedQuery(name = "ServiceUser.findByFirstName", query = "SELECT s FROM ServiceUser s WHERE s.firstName = :firstName"),
    @NamedQuery(name = "ServiceUser.findByEmail", query = "SELECT s FROM ServiceUser s WHERE s.email = :email"),
    @NamedQuery(name = "ServiceUser.findByPassword", query = "SELECT s FROM ServiceUser s WHERE s.password = :password"),
    @NamedQuery(name = "ServiceUser.findByType", query = "SELECT s FROM ServiceUser s WHERE s.type = :type"),
    @NamedQuery(name = "ServiceUser.findByAddress", query = "SELECT s FROM ServiceUser s WHERE s.address = :address"),
    @NamedQuery(name = "ServiceUser.findByPhone", query = "SELECT s FROM ServiceUser s WHERE s.phone = :phone")})
public class ServiceUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "USERID")
    private Integer userid;
    @Size(max = 20)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Size(max = 20)
    @Column(name = "FIRST_NAME")
    private String firstName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 50)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "TYPE")
    private Integer type;
    @Size(max = 100)
    @Column(name = "ADDRESS")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "PHONE")
    private String phone;

    public ServiceUser() {
    }

    public ServiceUser(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceUser)) {
            return false;
        }
        ServiceUser other = (ServiceUser) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitites.ServiceUser[ userid=" + userid + " ]";
    }
    
}
