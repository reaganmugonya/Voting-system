/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uni.enttity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Samsung
 */
@Entity
@Table(name = "questionaireoptions")
@NamedQueries({
    @NamedQuery(name = "Questionaireoptions.findAll", query = "SELECT q FROM Questionaireoptions q"),
    @NamedQuery(name = "Questionaireoptions.findById", query = "SELECT q FROM Questionaireoptions q WHERE q.id = :id"),
    @NamedQuery(name = "Questionaireoptions.findByText", query = "SELECT q FROM Questionaireoptions q WHERE q.text = :text"),
    @NamedQuery(name = "Questionaireoptions.findByCreatedBy", query = "SELECT q FROM Questionaireoptions q WHERE q.createdBy = :createdBy"),
    @NamedQuery(name = "Questionaireoptions.findByCreatedDate", query = "SELECT q FROM Questionaireoptions q WHERE q.createdDate = :createdDate")})
public class Questionaireoptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Text")
    private String text;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Created_By")
    private int createdBy;
    @Column(name = "Created_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @JoinColumn(name = "QuestionaireId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Questionaire questionaireId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "optionId")
    private List<Votinganswermapping> votinganswermappingList;

    public Questionaireoptions() {
    }

    public Questionaireoptions(Integer id) {
        this.id = id;
    }

    public Questionaireoptions(Integer id, String text, int createdBy) {
        this.id = id;
        this.text = text;
        this.createdBy = createdBy;
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

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Questionaire getQuestionaireId() {
        return questionaireId;
    }

    public void setQuestionaireId(Questionaire questionaireId) {
        this.questionaireId = questionaireId;
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
        if (!(object instanceof Questionaireoptions)) {
            return false;
        }
        Questionaireoptions other = (Questionaireoptions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uni.enttity.Questionaireoptions[ id=" + id + " ]";
    }
    
}
