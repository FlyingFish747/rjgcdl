package com.liangweifeng.ysdy.entity;

import javax.persistence.*;

@Table(name = "cdt.ad")
public class Ad {
    @Id
    @Column(name = "A_id")
    private String aId;

    private String password;

    /**
     * @return A_id
     */
    public String getaId() {
        return aId;
    }

    /**
     * @param aId
     */
    public void setaId(String aId) {
        this.aId = aId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}