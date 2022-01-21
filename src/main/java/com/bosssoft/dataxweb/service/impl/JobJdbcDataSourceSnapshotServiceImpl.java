package com.bosssoft.dataxweb.service.impl;

import com.bosssoft.dataxweb.entity.JobJdbcDatasourceSnapshot;
import com.bosssoft.dataxweb.mapper.JobJdbcDatasourceSnapshotMapper;
import com.bosssoft.dataxweb.service.JobJdbcDataSourceSnapshotService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class JobJdbcDataSourceSnapshotServiceImpl implements JobJdbcDataSourceSnapshotService {
    @Resource
    private JobJdbcDatasourceSnapshotMapper jobJdbcDatasourceSnapshotMapper;


    @Override
    public int addDataSourceSnapshot(JobJdbcDatasourceSnapshot jobJdbcDatasourceSnapshot) {
        jobJdbcDatasourceSnapshotMapper.insert(jobJdbcDatasourceSnapshot);
        return 1;

    }

    @Override
    public void truncateSnapshot() {
        jobJdbcDatasourceSnapshotMapper.truncateSnapshot();
    }
}
