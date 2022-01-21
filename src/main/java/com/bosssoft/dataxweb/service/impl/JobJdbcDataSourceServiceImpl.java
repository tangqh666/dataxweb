package com.bosssoft.dataxweb.service.impl;

import com.bosssoft.dataxweb.entity.JobJdbcDatasource;
import com.bosssoft.dataxweb.mapper.JobJdbcDatasourceMapper;
import com.bosssoft.dataxweb.service.JobJdbcDataSourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobJdbcDataSourceServiceImpl implements JobJdbcDataSourceService {
    @Resource
    private JobJdbcDatasourceMapper jobJdbcDatasourceMapper;

    @Override
    public List<JobJdbcDatasource> getAllDatasource() {
        return jobJdbcDatasourceMapper.selectByExample(null);
    }
}
