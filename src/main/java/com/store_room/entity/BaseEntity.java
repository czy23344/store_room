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
    @Column(name = "CREATE_ID", length = 200)
    private String createId;

    /**
     * 创建人
     */
    @Column(name = "CREATE_USER", length = 200)
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME", length = 200)
    private String createTime;

    /**
     * 修改人id
     */
    @Column(name = "UPDATA_ID", length = 200)
    private String updataId;

    /**
     * 修改人
     */
    @Column(name = "UPDATA_USER", length = 200)
    private String updataUser;

    /**
     * 修改时间
     */
    @Column(name = "UPDATA_TIME", length = 200)
    private String updataTime;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdataId() {
        return updataId;
    }

    public void setUpdataId(String updataId) {
        this.updataId = updataId;
    }

    public String getUpdataUser() {
        return updataUser;
    }

    public void setUpdataUser(String updataUser) {
        this.updataUser = updataUser;
    }

    public String getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(String updataTime) {
        this.updataTime = updataTime;
    }

}
