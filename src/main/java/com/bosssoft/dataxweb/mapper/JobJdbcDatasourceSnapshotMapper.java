package com.bosssoft.dataxweb.mapper;

import com.bosssoft.dataxweb.entity.JobJdbcDatasourceSnapshot;
import com.bosssoft.dataxweb.entity.JobJdbcDatasourceSnapshotExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface JobJdbcDatasourceSnapshotMapper {
    long countByExample(JobJdbcDatasourceSnapshotExample example);

    int deleteByExample(JobJdbcDatasourceSnapshotExample example);

    int insert(JobJdbcDatasourceSnapshot record);

    int insertSelective(JobJdbcDatasourceSnapshot record);

    List<JobJdbcDatasourceSnapshot> selectByExample(JobJdbcDatasourceSnapshotExample example);

    int updateByExampleSelective(@Param("record") JobJdbcDatasourceSnapshot record, @Param("example") JobJdbcDatasourceSnapshotExample example);

    int updateByExample(@Param("record") JobJdbcDatasourceSnapshot record, @Param("example") JobJdbcDatasourceSnapshotExample example);

    void  truncateSnapshot();
}