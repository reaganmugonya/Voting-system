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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "questionaire")
@NamedQueries({
    @NamedQuery(name = "Questionaire.findAll", query = "SELECT q FROM Questionaire q"),
    @NamedQuery(name = "Questionaire.findById", query = "SELECT q FROM Questionaire q WHERE q.id = :id"),
    @NamedQuery(name = "Questionaire.findByText", query = "SELECT q FROM Questionaire q WHERE q.text = :text")})
public class Questionaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Text")
    private String text;
    @JoinColumn(name = "ElectionId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Election electionId;
    @JoinColumn(name = "TypeId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Qiuestionairetype typeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionaireId")
    private List<Questionaireoptions> questionaireoptionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionaireId")
    private List<Votinganswermapping> votinganswermappingList;

    public Questionaire() {
    }

    public Questionaire(Integer id) {
        this.id = id;
    }

    public Questionaire(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Election getElectionId() {
        return electionId;
    }

    public void setElectionId(Election electionId) {
        this.electionId = electionId;
    }

    public Qiuestionairetype getTypeId() {
        return typeId;
    }

    public void setTypeId(Qiuestionairetype typeId) {
        this.typeId = typeId;
    }

    public List<Questionaireoptions> getQuestionaireoptionsList() {
        return questionaireoptionsList;
    }

    public void setQuestionaireoptionsList(List<Questionaireoptions> questionaireoptionsList) {
        this.questionaireoptionsList = questionaireoptionsList;
    }

    public List<Votinganswermapping> getVotinganswermappingList() {
        return votinganswermappingList;
    }

    public void setVotinganswermappingList(List<Votinganswermapping> votinganswermappingList) {
        this.votinganswermappingList = votinganswermappingList;
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
        if (!(object instanceof Questionaire)) {
            return false;
        }
        Questionaire other = (Questionaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uni.enttity.Questionaire[ id=" + id + " ]";
    }
    
}
