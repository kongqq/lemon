package com.mossle.vote.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VoteInfo .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "VOTE_INFO")
public class VoteInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String name;

    /** null. */
    private String content;

    /** null. */
    private String userId;

    /** null. */
    private Date createTime;

    /** null. */
    private String status;

    /** null. */
    private String tenantId;

    /** . */
    private Set<VoteItem> voteItems = new HashSet<VoteItem>(0);

    public VoteInfo() {
    }

    public VoteInfo(Long id) {
        this.id = id;
    }

    public VoteInfo(Long id, String name, String content, String userId,
            Date createTime, String status, String tenantId,
            Set<VoteItem> voteItems) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.userId = userId;
        this.createTime = createTime;
        this.status = status;
        this.tenantId = tenantId;
        this.voteItems = voteItems;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "NAME", length = 100)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "CONTENT", length = 200)
    public String getContent() {
        return this.content;
    }

    /**
     * @param content
     *            null.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /** @return null. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "voteInfo")
    public Set<VoteItem> getVoteItems() {
        return this.voteItems;
    }

    /**
     * @param voteItems
     *            .
     */
    public void setVoteItems(Set<VoteItem> voteItems) {
        this.voteItems = voteItems;
    }
}
