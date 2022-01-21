package com.bosssoft.dataxweb.mapper;

import com.bosssoft.dataxweb.entity.JobJdbcDatasource;
import com.bosssoft.dataxweb.entity.JobJdbcDatasourceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface JobJdbcDatasourceMapper {
    long countByExample(JobJdbcDatasourceExample example);

    int deleteByExample(JobJdbcDatasourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JobJdbcDatasource record);

    int insertSelective(JobJdbcDatasource record);

    List<JobJdbcDatasource> selectByExample(JobJdbcDatasourceExample example);

    JobJdbcDatasource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JobJdbcDatasource record, @Param("example") JobJdbcDatasourceExample example);

    int updateByExample(@Param("record") JobJdbcDatasource record, @Param("example") JobJdbcDatasourceExample example);

    int updateByPrimaryKeySelective(JobJdbcDatasource record);

    int updateByPrimaryKey(JobJdbcDatasource record);
}