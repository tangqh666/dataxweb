package com.bosssoft.dataxweb.controller;

import com.bosssoft.dataxweb.entity.JobJdbcDatasource;
import com.bosssoft.dataxweb.entity.JobJdbcDatasourceSnapshot;
import com.bosssoft.dataxweb.service.JobJdbcDataSourceService;
import com.bosssoft.dataxweb.service.JobJdbcDataSourceSnapshotService;
import com.bosssoft.dataxweb.util.CopyUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class JobJdbcDataSourceController {
    @Resource
    private JobJdbcDataSourceService jobJdbcDataSourceService;
    @Resource
    private JobJdbcDataSourceSnapshotService jobJdbcDataSourceSnapshotService;

@RequestMapping("snapshot1")
    public List<JobJdbcDatasourceSnapshot> snapshot(){

    jobJdbcDataSourceSnapshotService.truncateSnapshot();

    List<JobJdbcDatasource> datasourceList=jobJdbcDataSourceService.getAllDatasource();
    List<JobJdbcDatasourceSnapshot> jobJdbcDatasourceSnapshots = CopyUtil.copyList(datasourceList, JobJdbcDatasourceSnapshot.class);

  for (JobJdbcDatasourceSnapshot jobJdbcDatasourceSnapshot : jobJdbcDatasourceSnapshots) {
   //   jobJdbcDatasourceSnapshot.setSnapshotTime(sdf.parse(string,pos));


      jobJdbcDataSourceSnapshotService.addDataSourceSnapshot(jobJdbcDatasourceSnapshot);

  }
    return jobJdbcDatasourceSnapshots;
}
}
