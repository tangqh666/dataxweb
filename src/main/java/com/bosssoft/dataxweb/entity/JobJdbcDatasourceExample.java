package com.bosssoft.dataxweb.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class JobJdbcDatasourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobJdbcDatasourceExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameIsNull() {
            addCriterion("datasource_name is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameIsNotNull() {
            addCriterion("datasource_name is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameEqualTo(String value) {
            addCriterion("datasource_name =", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameNotEqualTo(String value) {
            addCriterion("datasource_name <>", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameGreaterThan(String value) {
            addCriterion("datasource_name >", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("datasource_name >=", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameLessThan(String value) {
            addCriterion("datasource_name <", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameLessThanOrEqualTo(String value) {
            addCriterion("datasource_name <=", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameLike(String value) {
            addCriterion("datasource_name like", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameNotLike(String value) {
            addCriterion("datasource_name not like", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameIn(List<String> values) {
            addCriterion("datasource_name in", values, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameNotIn(List<String> values) {
            addCriterion("datasource_name not in", values, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameBetween(String value1, String value2) {
            addCriterion("datasource_name between", value1, value2, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameNotBetween(String value1, String value2) {
            addCriterion("datasource_name not between", value1, value2, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNull() {
            addCriterion("datasource is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("datasource is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("datasource =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("datasource <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("datasource >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("datasource >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("datasource <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("datasource <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("datasource like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("datasource not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("datasource in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("datasource not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("datasource between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("datasource not between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupIsNull() {
            addCriterion("datasource_group is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupIsNotNull() {
            addCriterion("datasource_group is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupEqualTo(String value) {
            addCriterion("datasource_group =", value, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupNotEqualTo(String value) {
            addCriterion("datasource_group <>", value, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupGreaterThan(String value) {
            addCriterion("datasource_group >", value, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupGreaterThanOrEqualTo(String value) {
            addCriterion("datasource_group >=", value, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupLessThan(String value) {
            addCriterion("datasource_group <", value, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupLessThanOrEqualTo(String value) {
            addCriterion("datasource_group <=", value, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupLike(String value) {
            addCriterion("datasource_group like", value, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupNotLike(String value) {
            addCriterion("datasource_group not like", value, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupIn(List<String> values) {
            addCriterion("datasource_group in", values, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupNotIn(List<String> values) {
            addCriterion("datasource_group not in", values, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupBetween(String value1, String value2) {
            addCriterion("datasource_group between", value1, value2, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatasourceGroupNotBetween(String value1, String value2) {
            addCriterion("datasource_group not between", value1, value2, "datasourceGroup");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIsNull() {
            addCriterion("database_name is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIsNotNull() {
            addCriterion("database_name is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameEqualTo(String value) {
            addCriterion("database_name =", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotEqualTo(String value) {
            addCriterion("database_name <>", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameGreaterThan(String value) {
            addCriterion("database_name >", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("database_name >=", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLessThan(String value) {
            addCriterion("database_name <", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLessThanOrEqualTo(String value) {
            addCriterion("database_name <=", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameLike(String value) {
            addCriterion("database_name like", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotLike(String value) {
            addCriterion("database_name not like", value, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameIn(List<String> values) {
            addCriterion("database_name in", values, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotIn(List<String> values) {
            addCriterion("database_name not in", values, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameBetween(String value1, String value2) {
            addCriterion("database_name between", value1, value2, "databaseName");
            return (Criteria) this;
        }

        public Criteria andDatabaseNameNotBetween(String value1, String value2) {
            addCriterion("database_name not between", value1, value2, "databaseName");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameIsNull() {
            addCriterion("jdbc_username is null");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameIsNotNull() {
            addCriterion("jdbc_username is not null");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameEqualTo(String value) {
            addCriterion("jdbc_username =", value, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameNotEqualTo(String value) {
            addCriterion("jdbc_username <>", value, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameGreaterThan(String value) {
            addCriterion("jdbc_username >", value, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("jdbc_username >=", value, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameLessThan(String value) {
            addCriterion("jdbc_username <", value, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameLessThanOrEqualTo(String value) {
            addCriterion("jdbc_username <=", value, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameLike(String value) {
            addCriterion("jdbc_username like", value, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameNotLike(String value) {
            addCriterion("jdbc_username not like", value, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameIn(List<String> values) {
            addCriterion("jdbc_username in", values, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameNotIn(List<String> values) {
            addCriterion("jdbc_username not in", values, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameBetween(String value1, String value2) {
            addCriterion("jdbc_username between", value1, value2, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcUsernameNotBetween(String value1, String value2) {
            addCriterion("jdbc_username not between", value1, value2, "jdbcUsername");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordIsNull() {
            addCriterion("jdbc_password is null");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordIsNotNull() {
            addCriterion("jdbc_password is not null");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordEqualTo(String value) {
            addCriterion("jdbc_password =", value, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordNotEqualTo(String value) {
            addCriterion("jdbc_password <>", value, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordGreaterThan(String value) {
            addCriterion("jdbc_password >", value, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("jdbc_password >=", value, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordLessThan(String value) {
            addCriterion("jdbc_password <", value, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordLessThanOrEqualTo(String value) {
            addCriterion("jdbc_password <=", value, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordLike(String value) {
            addCriterion("jdbc_password like", value, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordNotLike(String value) {
            addCriterion("jdbc_password not like", value, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordIn(List<String> values) {
            addCriterion("jdbc_password in", values, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordNotIn(List<String> values) {
            addCriterion("jdbc_password not in", values, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordBetween(String value1, String value2) {
            addCriterion("jdbc_password between", value1, value2, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcPasswordNotBetween(String value1, String value2) {
            addCriterion("jdbc_password not between", value1, value2, "jdbcPassword");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlIsNull() {
            addCriterion("jdbc_url is null");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlIsNotNull() {
            addCriterion("jdbc_url is not null");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlEqualTo(String value) {
            addCriterion("jdbc_url =", value, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlNotEqualTo(String value) {
            addCriterion("jdbc_url <>", value, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlGreaterThan(String value) {
            addCriterion("jdbc_url >", value, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlGreaterThanOrEqualTo(String value) {
            addCriterion("jdbc_url >=", value, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlLessThan(String value) {
            addCriterion("jdbc_url <", value, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlLessThanOrEqualTo(String value) {
            addCriterion("jdbc_url <=", value, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlLike(String value) {
            addCriterion("jdbc_url like", value, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlNotLike(String value) {
            addCriterion("jdbc_url not like", value, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlIn(List<String> values) {
            addCriterion("jdbc_url in", values, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlNotIn(List<String> values) {
            addCriterion("jdbc_url not in", values, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlBetween(String value1, String value2) {
            addCriterion("jdbc_url between", value1, value2, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcUrlNotBetween(String value1, String value2) {
            addCriterion("jdbc_url not between", value1, value2, "jdbcUrl");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassIsNull() {
            addCriterion("jdbc_driver_class is null");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassIsNotNull() {
            addCriterion("jdbc_driver_class is not null");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassEqualTo(String value) {
            addCriterion("jdbc_driver_class =", value, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassNotEqualTo(String value) {
            addCriterion("jdbc_driver_class <>", value, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassGreaterThan(String value) {
            addCriterion("jdbc_driver_class >", value, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassGreaterThanOrEqualTo(String value) {
            addCriterion("jdbc_driver_class >=", value, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassLessThan(String value) {
            addCriterion("jdbc_driver_class <", value, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassLessThanOrEqualTo(String value) {
            addCriterion("jdbc_driver_class <=", value, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassLike(String value) {
            addCriterion("jdbc_driver_class like", value, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassNotLike(String value) {
            addCriterion("jdbc_driver_class not like", value, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassIn(List<String> values) {
            addCriterion("jdbc_driver_class in", values, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassNotIn(List<String> values) {
            addCriterion("jdbc_driver_class not in", values, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassBetween(String value1, String value2) {
            addCriterion("jdbc_driver_class between", value1, value2, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andJdbcDriverClassNotBetween(String value1, String value2) {
            addCriterion("jdbc_driver_class not between", value1, value2, "jdbcDriverClass");
            return (Criteria) this;
        }

        public Criteria andZkAdressIsNull() {
            addCriterion("zk_adress is null");
            return (Criteria) this;
        }

        public Criteria andZkAdressIsNotNull() {
            addCriterion("zk_adress is not null");
            return (Criteria) this;
        }

        public Criteria andZkAdressEqualTo(String value) {
            addCriterion("zk_adress =", value, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressNotEqualTo(String value) {
            addCriterion("zk_adress <>", value, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressGreaterThan(String value) {
            addCriterion("zk_adress >", value, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressGreaterThanOrEqualTo(String value) {
            addCriterion("zk_adress >=", value, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressLessThan(String value) {
            addCriterion("zk_adress <", value, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressLessThanOrEqualTo(String value) {
            addCriterion("zk_adress <=", value, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressLike(String value) {
            addCriterion("zk_adress like", value, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressNotLike(String value) {
            addCriterion("zk_adress not like", value, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressIn(List<String> values) {
            addCriterion("zk_adress in", values, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressNotIn(List<String> values) {
            addCriterion("zk_adress not in", values, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressBetween(String value1, String value2) {
            addCriterion("zk_adress between", value1, value2, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andZkAdressNotBetween(String value1, String value2) {
            addCriterion("zk_adress not between", value1, value2, "zkAdress");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}