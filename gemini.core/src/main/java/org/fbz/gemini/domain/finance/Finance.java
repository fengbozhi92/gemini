package org.fbz.gemini.domain.finance;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.fbz.gemini.domain.common.SimpleEntity;
@Entity
@Table(name="b_finance")
public class Finance extends SimpleEntity{
    private static final long serialVersionUID = -1740384795988991688L;
    private String name;
    private Integer type;
    private double residue;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public double getResidue() {
        return residue;
    }
    public void setResidue(double residue) {
        this.residue = residue;
    }
}
