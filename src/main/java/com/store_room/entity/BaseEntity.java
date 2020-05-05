package com.store_room.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable{

    /**
     * 主键
     */
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(length = 32, unique = true)
    private String id;

    /**
     * 创建人id
     */
    @Column(name = "FOUNDER_Id", length = 200)
    private String founderId;

    /**
     * 创建人
     */
    @Column(name = "FOUNDER", length = 200)
    private String founder;

    /**
     * 创建时间
     */
    @Column(name = "FOUNDER_TIME", length = 200)
    private String foundertime;
    /**
     * 修改人id
     */
    @Column(name = "REVISER_Id", length = 200)
    private String reviserId;

    /**
     * 修改人
     */
    @Column(name = "REVISER", length = 200)
    private String reviser;

    /**
     * 修改时间
     */
    @Column(name = "REVISER_TIME", length = 200)
    private String revisertime;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getFoundertime() {
        return foundertime;
    }

    public void setFoundertime(String foundertime) {
        this.foundertime = foundertime;
    }

    public String getReviser() {
        return reviser;
    }

    public void setReviser(String reviser) {
        this.reviser = reviser;
    }

    public String getRevisertime() {
        return revisertime;
    }

    public void setRevisertime(String revisertime) {
        this.revisertime = revisertime;
    }

    public String getFounderId() {
        return founderId;
    }

    public void setFounderId(String founderId) {
        this.founderId = founderId;
    }

    public String getReviserId() {
        return reviserId;
    }

    public void setReviserId(String reviserId) {
        this.reviserId = reviserId;
    }


}
