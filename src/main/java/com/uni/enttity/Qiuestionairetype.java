/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uni.enttity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Samsung
 */
@Entity
@Table(name = "qiuestionairetype")
@NamedQueries({
    @NamedQuery(name = "Qiuestionairetype.findAll", query = "SELECT q FROM Qiuestionairetype q"),
    @NamedQuery(name = "Qiuestionairetype.findById", query = "SELECT q FROM Qiuestionairetype q WHERE q.id = :id"),
    @NamedQuery(name = "Qiuestionairetype.findByType", query = "SELECT q FROM Qiuestionairetype q WHERE q.type = :type"),
    @NamedQuery(name = "Qiuestionairetype.findByMaxSelection", query = "SELECT q FROM Qiuestionairetype q WHERE q.maxSelection = :maxSelection"),
    @NamedQuery(name = "Qiuestionairetype.findByMinSelection", query = "SELECT q FROM Qiuestionairetype q WHERE q.minSelection = :minSelection")})
public class Qiuestionairetype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaxSelection")
    private int maxSelection;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MinSelection")
    private int minSelection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeId")
    private List<Questionaire> questionaireList;

    public Qiuestionairetype() {
    }

    public Qiuestionairetype(Integer id) {
        this.id = id;
    }

    public Qiuestionairetype(Integer id, String type, int maxSelection, int minSelection) {
        this.id = id;
        this.type = type;
        this.maxSelection = maxSelection;
        this.minSelection = minSelection;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSelection() {
        return maxSelection;
    }

    public void setMaxSelection(int maxSelection) {
        this.maxSelection = maxSelection;
    }

    public int getMinSelection() {
        return minSelection;
    }

    public void setMinSelection(int minSelection) {
        this.minSelection = minSelection;
    }

    public List<Questionaire> getQuestionaireList() {
        return questionaireList;
    }

    public void setQuestionaireList(List<Questionaire> questionaireList) {
        this.questionaireList = questionaireList;
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
        if (!(object instanceof Qiuestionairetype)) {
            return false;
        }
        Qiuestionairetype other = (Qiuestionairetype) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uni.enttity.Qiuestionairetype[ id=" + id + " ]";
    }
    
}
