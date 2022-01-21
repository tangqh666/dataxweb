package com.bosssoft.dataxweb.service;

import com.bosssoft.dataxweb.entity.JobJdbcDatasource;
import com.bosssoft.dataxweb.entity.JobJdbcDatasourceSnapshot;

import javax.annotation.Resource;
import java.util.List;

public interface JobJdbcDataSourceSnapshotService {


    int addDataSourceSnapshot(JobJdbcDatasourceSnapshot jobJdbcDatasourceSnapshot);

    void  truncateSnapshot();
}
