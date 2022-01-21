package com.bosssoft.dataxweb.entity;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
@Data
public class JobJdbcDatasourceSnapshot {
    private Long id;

    private String datasourceName;

    private String datasource;

    private String datasourceGroup;

    private String databaseName;

    private String jdbcUsername;

    private String jdbcUrl;

    private Boolean status;

    private Date snapshotTime;

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

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getSnapshotTime() {
        return snapshotTime;
    }

    public void setSnapshotTime(Date date) {}

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
        sb.append(", jdbcUrl=").append(jdbcUrl);
        sb.append(", status=").append(status);
        sb.append(", snapshotTime=").append(snapshotTime);
        sb.append("]");
        return sb.toString();
    }
}