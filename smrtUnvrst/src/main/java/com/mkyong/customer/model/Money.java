/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.customer.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Antony
 */
@Entity
@Table(name = "money")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Money.findAll", query = "SELECT m FROM Money m")
    , @NamedQuery(name = "Money.findByCardNumber", query = "SELECT m FROM Money m WHERE m.cardNumber = :cardNumber")
    , @NamedQuery(name = "Money.findBySuppMoney", query = "SELECT m FROM Money m WHERE m.suppMoney = :suppMoney")
    , @NamedQuery(name = "Money.findById", query = "SELECT m FROM Money m WHERE m.id = :id")})
public class Money implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "card_number")
    private String cardNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "supp_money")
    private int suppMoney;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "id_event", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Events idEvent;

    public Money() {
    }

    public Money(Integer id) {
        this.id = id;
    }

    public Money(Integer id, String cardNumber, int suppMoney) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.suppMoney = suppMoney;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getSuppMoney() {
        return suppMoney;
    }

    public void setSuppMoney(int suppMoney) {
        this.suppMoney = suppMoney;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Events getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Events idEvent) {
        this.idEvent = idEvent;
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
        if (!(object instanceof Money)) {
            return false;
        }
        Money other = (Money) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mkyong.customer.model.Money[ id=" + id + " ]";
    }
    
}
