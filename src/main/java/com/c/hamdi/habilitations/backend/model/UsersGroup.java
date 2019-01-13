/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c.hamdi.habilitations.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author miled
 */
@Entity
@Table(name = "grp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersGroup.findAll", query = "SELECT u FROM UsersGroup u"),
    @NamedQuery(name = "UsersGroup.findById", query = "SELECT u FROM UsersGroup u WHERE u.id = :id"),
    @NamedQuery(name = "UsersGroup.findByLabel", query = "SELECT u FROM UsersGroup u WHERE u.label = :label"),
    @NamedQuery(name = "UsersGroup.findByCreationDate", query = "SELECT u FROM UsersGroup u WHERE u.creationDate = :creationDate")})
public class UsersGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    //@Size(max = 45)
    @Column(name = "label")
    private String label;
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @JoinTable(name = "user_has_group", joinColumns = {
        @JoinColumn(name = "group_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "user_id", referencedColumnName = "id")})
    @ManyToMany
    private Collection<User> userCollection;
    @JoinTable(name = "grp_has_profile", joinColumns = {
        @JoinColumn(name = "grp_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "profile_id", referencedColumnName = "id")})
    @ManyToMany
    @JsonIgnoreProperties(value={ "usersGroupCollection" }, allowSetters= true)
    private Collection<Profile> profileCollection;

    public UsersGroup() {
    }

    public UsersGroup(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @XmlTransient
    public Collection<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
    }

    @XmlTransient
    public Collection<Profile> getProfileCollection() {
        return profileCollection;
    }

    public void setProfileCollection(Collection<Profile> profileCollection) {
        this.profileCollection = profileCollection;
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
        if (!(object instanceof UsersGroup)) {
            return false;
        }
        UsersGroup other = (UsersGroup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.c.hamdi.habilitations.backend.model.UsersGroup[ id=" + id + " ]";
    }
    
}
