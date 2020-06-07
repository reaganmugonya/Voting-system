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
@Table(name = "voting")
@NamedQueries({
    @NamedQuery(name = "Voting.findAll", query = "SELECT v FROM Voting v"),
    @NamedQuery(name = "Voting.findById", query = "SELECT v FROM Voting v WHERE v.id = :id"),
    @NamedQuery(name = "Voting.findByTransactionId", query = "SELECT v FROM Voting v WHERE v.transactionId = :transactionId"),
    @NamedQuery(name = "Voting.findByCreationDate", query = "SELECT v FROM Voting v WHERE v.creationDate = :creationDate")})
public class Voting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TransactionId")
    private String transactionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreationDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @JoinColumn(name = "ElectionId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Election electionId;
    @JoinColumn(name = "UserId", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Users userId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "votingId")
    private List<Votinganswermapping> votinganswermappingList;

    public Voting() {
    }

    public Voting(Integer id) {
        this.id = id;
    }

    public Voting(Integer id, String transactionId, Date creationDate) {
        this.id = id;
        this.transactionId = transactionId;
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Election getElectionId() {
        return electionId;
    }

    public void setElectionId(Election electionId) {
        this.electionId = electionId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
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
        if (!(object instanceof Voting)) {
            return false;
        }
        Voting other = (Voting) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uni.enttity.Voting[ id=" + id + " ]";
    }
    
}
