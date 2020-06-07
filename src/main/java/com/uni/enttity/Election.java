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
@Table(name = "election")
@NamedQueries({
    @NamedQuery(name = "Election.findAll", query = "SELECT e FROM Election e"),
    @NamedQuery(name = "Election.findById", query = "SELECT e FROM Election e WHERE e.id = :id"),
    @NamedQuery(name = "Election.findByTitle", query = "SELECT e FROM Election e WHERE e.title = :title"),
    @NamedQuery(name = "Election.findByDescription", query = "SELECT e FROM Election e WHERE e.description = :description"),
    @NamedQuery(name = "Election.findByCreatedBy", query = "SELECT e FROM Election e WHERE e.createdBy = :createdBy"),
    @NamedQuery(name = "Election.findByCreatedDate", query = "SELECT e FROM Election e WHERE e.createdDate = :createdDate")})
public class Election implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Title")
    private String title;
    @Size(max = 500)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Created_By")
    private int createdBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Created_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "electionId")
    private List<Questionaire> questionaireList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "electionId")
    private List<Voting> votingList;

    public Election() {
    }

    public Election(Integer id) {
        this.id = id;
    }

    public Election(Integer id, String title, int createdBy, Date createdDate) {
        this.id = id;
        this.title = title;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<Questionaire> getQuestionaireList() {
        return questionaireList;
    }

    public void setQuestionaireList(List<Questionaire> questionaireList) {
        this.questionaireList = questionaireList;
    }

    public List<Voting> getVotingList() {
        return votingList;
    }

    public void setVotingList(List<Voting> votingList) {
        this.votingList = votingList;
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
        if (!(object instanceof Election)) {
            return false;
        }
        Election other = (Election) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uni.enttity.Election[ id=" + id + " ]";
    }
    
}
