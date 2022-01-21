package com.bosssoft.dataxweb.entity;

import lombok.Data;

import java.util.Date;

@Data
public class JobJdbcDatasource {
    private Long id;

    private String datasourceName;

    private String datasource;

    private String datasourceGroup;

    private String databaseName;

    private String jdbcUsername;

    private String jdbcPassword;

    private String jdbcUrl;

    private String jdbcDriverClass;

    private String zkAdress;

    private Boolean status;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getDatasourceGroup() {
        return datasourceGroup;
    }

    public void setDatasourceGroup(String datasourceGroup) {
        this.datasourceGroup = datasourceGroup;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getJdbcUsername() {
        return jdbcUsername;
    }

    public void setJdbcUsername(String jdbcUsername) {
        this.jdbcUsername = jdbcUsername;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getJdbcDriverClass() {
        return jdbcDriverClass;
    }

    public void setJdbcDriverClass(String jdbcDriverClass) {
        this.jdbcDriverClass = jdbcDriverClass;
    }

    public String getZkAdress() {
        return zkAdress;
    }

    public void setZkAdress(String zkAdress) {
        this.zkAdress = zkAdress;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", datasourceName=").append(datasourceName);
        sb.append(", datasource=").append(datasource);
        sb.append(", datasourceGroup=").append(datasourceGroup);
        sb.append(", databaseName=").append(databaseName);
        sb.append(", jdbcUsername=").append(jdbcUsername);
        sb.append(", jdbcPassword=").append(jdbcPassword);
        sb.append(", jdbcUrl=").append(jdbcUrl);
        sb.append(", jdbcDriverClass=").append(jdbcDriverClass);
        sb.append(", zkAdress=").append(zkAdress);
        sb.append(", status=").append(status);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", comments=").append(comments);
        sb.append("]");
        return sb.toString();
    }
}