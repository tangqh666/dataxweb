package com.bosssoft.dataxweb.job;

import com.bosssoft.dataxweb.controller.JobJdbcDataSourceController;
import com.bosssoft.dataxweb.entity.JobJdbcDatasourceSnapshot;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Slf4j
public class SnapshotJob {

    @Resource
    private JobJdbcDataSourceController jdbcDataSourceController;
    @Scheduled(cron = "* 36 * * * ? ")
    public void snapshotDatasource(){
        log.info("------------------------------------------------开始------------------------------------------------");
        List<JobJdbcDatasourceSnapshot> list=jdbcDataSourceController.snapshot();
        log.info("------------------------------------------------结束------------------------------------------------");
    }
}
