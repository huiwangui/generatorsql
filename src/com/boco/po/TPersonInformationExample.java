package com.boco.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPersonInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPersonInformationExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(String value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(String value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(String value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(String value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(String value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLike(String value) {
            addCriterion("person_id like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotLike(String value) {
            addCriterion("person_id not like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<String> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<String> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(String value1, String value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(String value1, String value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameIsNull() {
            addCriterion("build_org_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameIsNotNull() {
            addCriterion("build_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameEqualTo(String value) {
            addCriterion("build_org_name =", value, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameNotEqualTo(String value) {
            addCriterion("build_org_name <>", value, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameGreaterThan(String value) {
            addCriterion("build_org_name >", value, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("build_org_name >=", value, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameLessThan(String value) {
            addCriterion("build_org_name <", value, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameLessThanOrEqualTo(String value) {
            addCriterion("build_org_name <=", value, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameLike(String value) {
            addCriterion("build_org_name like", value, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameNotLike(String value) {
            addCriterion("build_org_name not like", value, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameIn(List<String> values) {
            addCriterion("build_org_name in", values, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameNotIn(List<String> values) {
            addCriterion("build_org_name not in", values, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameBetween(String value1, String value2) {
            addCriterion("build_org_name between", value1, value2, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andBuildOrgNameNotBetween(String value1, String value2) {
            addCriterion("build_org_name not between", value1, value2, "buildOrgName");
            return (Criteria) this;
        }

        public Criteria andPersonCodeIsNull() {
            addCriterion("person_code is null");
            return (Criteria) this;
        }

        public Criteria andPersonCodeIsNotNull() {
            addCriterion("person_code is not null");
            return (Criteria) this;
        }

        public Criteria andPersonCodeEqualTo(String value) {
            addCriterion("person_code =", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeNotEqualTo(String value) {
            addCriterion("person_code <>", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeGreaterThan(String value) {
            addCriterion("person_code >", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("person_code >=", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeLessThan(String value) {
            addCriterion("person_code <", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeLessThanOrEqualTo(String value) {
            addCriterion("person_code <=", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeLike(String value) {
            addCriterion("person_code like", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeNotLike(String value) {
            addCriterion("person_code not like", value, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeIn(List<String> values) {
            addCriterion("person_code in", values, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeNotIn(List<String> values) {
            addCriterion("person_code not in", values, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeBetween(String value1, String value2) {
            addCriterion("person_code between", value1, value2, "personCode");
            return (Criteria) this;
        }

        public Criteria andPersonCodeNotBetween(String value1, String value2) {
            addCriterion("person_code not between", value1, value2, "personCode");
            return (Criteria) this;
        }

        public Criteria andCustomNumberIsNull() {
            addCriterion("custom_number is null");
            return (Criteria) this;
        }

        public Criteria andCustomNumberIsNotNull() {
            addCriterion("custom_number is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNumberEqualTo(String value) {
            addCriterion("custom_number =", value, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberNotEqualTo(String value) {
            addCriterion("custom_number <>", value, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberGreaterThan(String value) {
            addCriterion("custom_number >", value, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("custom_number >=", value, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberLessThan(String value) {
            addCriterion("custom_number <", value, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberLessThanOrEqualTo(String value) {
            addCriterion("custom_number <=", value, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberLike(String value) {
            addCriterion("custom_number like", value, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberNotLike(String value) {
            addCriterion("custom_number not like", value, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberIn(List<String> values) {
            addCriterion("custom_number in", values, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberNotIn(List<String> values) {
            addCriterion("custom_number not in", values, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberBetween(String value1, String value2) {
            addCriterion("custom_number between", value1, value2, "customNumber");
            return (Criteria) this;
        }

        public Criteria andCustomNumberNotBetween(String value1, String value2) {
            addCriterion("custom_number not between", value1, value2, "customNumber");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andNationCodeIsNull() {
            addCriterion("nation_code is null");
            return (Criteria) this;
        }

        public Criteria andNationCodeIsNotNull() {
            addCriterion("nation_code is not null");
            return (Criteria) this;
        }

        public Criteria andNationCodeEqualTo(String value) {
            addCriterion("nation_code =", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotEqualTo(String value) {
            addCriterion("nation_code <>", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeGreaterThan(String value) {
            addCriterion("nation_code >", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nation_code >=", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLessThan(String value) {
            addCriterion("nation_code <", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLessThanOrEqualTo(String value) {
            addCriterion("nation_code <=", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLike(String value) {
            addCriterion("nation_code like", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotLike(String value) {
            addCriterion("nation_code not like", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeIn(List<String> values) {
            addCriterion("nation_code in", values, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotIn(List<String> values) {
            addCriterion("nation_code not in", values, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeBetween(String value1, String value2) {
            addCriterion("nation_code between", value1, value2, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotBetween(String value1, String value2) {
            addCriterion("nation_code not between", value1, value2, "nationCode");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMarryStatusIsNull() {
            addCriterion("marry_status is null");
            return (Criteria) this;
        }

        public Criteria andMarryStatusIsNotNull() {
            addCriterion("marry_status is not null");
            return (Criteria) this;
        }

        public Criteria andMarryStatusEqualTo(String value) {
            addCriterion("marry_status =", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusNotEqualTo(String value) {
            addCriterion("marry_status <>", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusGreaterThan(String value) {
            addCriterion("marry_status >", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusGreaterThanOrEqualTo(String value) {
            addCriterion("marry_status >=", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusLessThan(String value) {
            addCriterion("marry_status <", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusLessThanOrEqualTo(String value) {
            addCriterion("marry_status <=", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusLike(String value) {
            addCriterion("marry_status like", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusNotLike(String value) {
            addCriterion("marry_status not like", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusIn(List<String> values) {
            addCriterion("marry_status in", values, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusNotIn(List<String> values) {
            addCriterion("marry_status not in", values, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusBetween(String value1, String value2) {
            addCriterion("marry_status between", value1, value2, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusNotBetween(String value1, String value2) {
            addCriterion("marry_status not between", value1, value2, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andJobCodeIsNull() {
            addCriterion("job_code is null");
            return (Criteria) this;
        }

        public Criteria andJobCodeIsNotNull() {
            addCriterion("job_code is not null");
            return (Criteria) this;
        }

        public Criteria andJobCodeEqualTo(String value) {
            addCriterion("job_code =", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotEqualTo(String value) {
            addCriterion("job_code <>", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeGreaterThan(String value) {
            addCriterion("job_code >", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeGreaterThanOrEqualTo(String value) {
            addCriterion("job_code >=", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLessThan(String value) {
            addCriterion("job_code <", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLessThanOrEqualTo(String value) {
            addCriterion("job_code <=", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeLike(String value) {
            addCriterion("job_code like", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotLike(String value) {
            addCriterion("job_code not like", value, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeIn(List<String> values) {
            addCriterion("job_code in", values, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotIn(List<String> values) {
            addCriterion("job_code not in", values, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeBetween(String value1, String value2) {
            addCriterion("job_code between", value1, value2, "jobCode");
            return (Criteria) this;
        }

        public Criteria andJobCodeNotBetween(String value1, String value2) {
            addCriterion("job_code not between", value1, value2, "jobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeIsNull() {
            addCriterion("other_job_code is null");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeIsNotNull() {
            addCriterion("other_job_code is not null");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeEqualTo(String value) {
            addCriterion("other_job_code =", value, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeNotEqualTo(String value) {
            addCriterion("other_job_code <>", value, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeGreaterThan(String value) {
            addCriterion("other_job_code >", value, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeGreaterThanOrEqualTo(String value) {
            addCriterion("other_job_code >=", value, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeLessThan(String value) {
            addCriterion("other_job_code <", value, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeLessThanOrEqualTo(String value) {
            addCriterion("other_job_code <=", value, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeLike(String value) {
            addCriterion("other_job_code like", value, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeNotLike(String value) {
            addCriterion("other_job_code not like", value, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeIn(List<String> values) {
            addCriterion("other_job_code in", values, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeNotIn(List<String> values) {
            addCriterion("other_job_code not in", values, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeBetween(String value1, String value2) {
            addCriterion("other_job_code between", value1, value2, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andOtherJobCodeNotBetween(String value1, String value2) {
            addCriterion("other_job_code not between", value1, value2, "otherJobCode");
            return (Criteria) this;
        }

        public Criteria andHuKouIndIsNull() {
            addCriterion("hu_kou_ind is null");
            return (Criteria) this;
        }

        public Criteria andHuKouIndIsNotNull() {
            addCriterion("hu_kou_ind is not null");
            return (Criteria) this;
        }

        public Criteria andHuKouIndEqualTo(String value) {
            addCriterion("hu_kou_ind =", value, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndNotEqualTo(String value) {
            addCriterion("hu_kou_ind <>", value, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndGreaterThan(String value) {
            addCriterion("hu_kou_ind >", value, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndGreaterThanOrEqualTo(String value) {
            addCriterion("hu_kou_ind >=", value, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndLessThan(String value) {
            addCriterion("hu_kou_ind <", value, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndLessThanOrEqualTo(String value) {
            addCriterion("hu_kou_ind <=", value, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndLike(String value) {
            addCriterion("hu_kou_ind like", value, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndNotLike(String value) {
            addCriterion("hu_kou_ind not like", value, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndIn(List<String> values) {
            addCriterion("hu_kou_ind in", values, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndNotIn(List<String> values) {
            addCriterion("hu_kou_ind not in", values, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndBetween(String value1, String value2) {
            addCriterion("hu_kou_ind between", value1, value2, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andHuKouIndNotBetween(String value1, String value2) {
            addCriterion("hu_kou_ind not between", value1, value2, "huKouInd");
            return (Criteria) this;
        }

        public Criteria andEducationCodeIsNull() {
            addCriterion("education_code is null");
            return (Criteria) this;
        }

        public Criteria andEducationCodeIsNotNull() {
            addCriterion("education_code is not null");
            return (Criteria) this;
        }

        public Criteria andEducationCodeEqualTo(String value) {
            addCriterion("education_code =", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeNotEqualTo(String value) {
            addCriterion("education_code <>", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeGreaterThan(String value) {
            addCriterion("education_code >", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("education_code >=", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeLessThan(String value) {
            addCriterion("education_code <", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeLessThanOrEqualTo(String value) {
            addCriterion("education_code <=", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeLike(String value) {
            addCriterion("education_code like", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeNotLike(String value) {
            addCriterion("education_code not like", value, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeIn(List<String> values) {
            addCriterion("education_code in", values, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeNotIn(List<String> values) {
            addCriterion("education_code not in", values, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeBetween(String value1, String value2) {
            addCriterion("education_code between", value1, value2, "educationCode");
            return (Criteria) this;
        }

        public Criteria andEducationCodeNotBetween(String value1, String value2) {
            addCriterion("education_code not between", value1, value2, "educationCode");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNull() {
            addCriterion("date_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNotNull() {
            addCriterion("date_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth =", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth <>", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("date_of_birth >", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth >=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThan(Date value) {
            addCriterionForJDBCDate("date_of_birth <", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth <=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_birth in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_birth not in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_birth between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_birth not between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNull() {
            addCriterion("build_date is null");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNotNull() {
            addCriterion("build_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuildDateEqualTo(Date value) {
            addCriterionForJDBCDate("build_date =", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("build_date <>", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThan(Date value) {
            addCriterionForJDBCDate("build_date >", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("build_date >=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThan(Date value) {
            addCriterionForJDBCDate("build_date <", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("build_date <=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateIn(List<Date> values) {
            addCriterionForJDBCDate("build_date in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("build_date not in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("build_date between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("build_date not between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNull() {
            addCriterion("family_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNotNull() {
            addCriterion("family_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdEqualTo(String value) {
            addCriterion("family_id =", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotEqualTo(String value) {
            addCriterion("family_id <>", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThan(String value) {
            addCriterion("family_id >", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThanOrEqualTo(String value) {
            addCriterion("family_id >=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThan(String value) {
            addCriterion("family_id <", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThanOrEqualTo(String value) {
            addCriterion("family_id <=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLike(String value) {
            addCriterion("family_id like", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotLike(String value) {
            addCriterion("family_id not like", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIn(List<String> values) {
            addCriterion("family_id in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotIn(List<String> values) {
            addCriterion("family_id not in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdBetween(String value1, String value2) {
            addCriterion("family_id between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotBetween(String value1, String value2) {
            addCriterion("family_id not between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameIsNull() {
            addCriterion("work_org_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameIsNotNull() {
            addCriterion("work_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameEqualTo(String value) {
            addCriterion("work_org_name =", value, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameNotEqualTo(String value) {
            addCriterion("work_org_name <>", value, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameGreaterThan(String value) {
            addCriterion("work_org_name >", value, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_org_name >=", value, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameLessThan(String value) {
            addCriterion("work_org_name <", value, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameLessThanOrEqualTo(String value) {
            addCriterion("work_org_name <=", value, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameLike(String value) {
            addCriterion("work_org_name like", value, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameNotLike(String value) {
            addCriterion("work_org_name not like", value, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameIn(List<String> values) {
            addCriterion("work_org_name in", values, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameNotIn(List<String> values) {
            addCriterion("work_org_name not in", values, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameBetween(String value1, String value2) {
            addCriterion("work_org_name between", value1, value2, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andWorkOrgNameNotBetween(String value1, String value2) {
            addCriterion("work_org_name not between", value1, value2, "workOrgName");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("res_type is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("res_type is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(String value) {
            addCriterion("res_type =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(String value) {
            addCriterion("res_type <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(String value) {
            addCriterion("res_type >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(String value) {
            addCriterion("res_type >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(String value) {
            addCriterion("res_type <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(String value) {
            addCriterion("res_type <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLike(String value) {
            addCriterion("res_type like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotLike(String value) {
            addCriterion("res_type not like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<String> values) {
            addCriterion("res_type in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<String> values) {
            addCriterion("res_type not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(String value1, String value2) {
            addCriterion("res_type between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(String value1, String value2) {
            addCriterion("res_type not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateIsNull() {
            addCriterion("hr_status_date is null");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateIsNotNull() {
            addCriterion("hr_status_date is not null");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateEqualTo(Date value) {
            addCriterionForJDBCDate("hr_status_date =", value, "hrStatusDate");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hr_status_date <>", value, "hrStatusDate");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateGreaterThan(Date value) {
            addCriterionForJDBCDate("hr_status_date >", value, "hrStatusDate");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hr_status_date >=", value, "hrStatusDate");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateLessThan(Date value) {
            addCriterionForJDBCDate("hr_status_date <", value, "hrStatusDate");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hr_status_date <=", value, "hrStatusDate");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateIn(List<Date> values) {
            addCriterionForJDBCDate("hr_status_date in", values, "hrStatusDate");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hr_status_date not in", values, "hrStatusDate");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hr_status_date between", value1, value2, "hrStatusDate");
            return (Criteria) this;
        }

        public Criteria andHrStatusDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hr_status_date not between", value1, value2, "hrStatusDate");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkIsNull() {
            addCriterion("hr_status_remark is null");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkIsNotNull() {
            addCriterion("hr_status_remark is not null");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkEqualTo(String value) {
            addCriterion("hr_status_remark =", value, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkNotEqualTo(String value) {
            addCriterion("hr_status_remark <>", value, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkGreaterThan(String value) {
            addCriterion("hr_status_remark >", value, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("hr_status_remark >=", value, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkLessThan(String value) {
            addCriterion("hr_status_remark <", value, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkLessThanOrEqualTo(String value) {
            addCriterion("hr_status_remark <=", value, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkLike(String value) {
            addCriterion("hr_status_remark like", value, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkNotLike(String value) {
            addCriterion("hr_status_remark not like", value, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkIn(List<String> values) {
            addCriterion("hr_status_remark in", values, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkNotIn(List<String> values) {
            addCriterion("hr_status_remark not in", values, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkBetween(String value1, String value2) {
            addCriterion("hr_status_remark between", value1, value2, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andHrStatusRemarkNotBetween(String value1, String value2) {
            addCriterion("hr_status_remark not between", value1, value2, "hrStatusRemark");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("region_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("region_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("region_code =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("region_code <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("region_code >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_code >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("region_code <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("region_code <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("region_code like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("region_code not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("region_code in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("region_code not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("region_code between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("region_code not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("contact_tel =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("contact_tel <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("contact_tel >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("contact_tel >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("contact_tel <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("contact_tel <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("contact_tel like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("contact_tel not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("contact_tel in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("contact_tel not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("contact_tel between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("contact_tel not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressIsNull() {
            addCriterion("residence_address is null");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressIsNotNull() {
            addCriterion("residence_address is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressEqualTo(String value) {
            addCriterion("residence_address =", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressNotEqualTo(String value) {
            addCriterion("residence_address <>", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressGreaterThan(String value) {
            addCriterion("residence_address >", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("residence_address >=", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressLessThan(String value) {
            addCriterion("residence_address <", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressLessThanOrEqualTo(String value) {
            addCriterion("residence_address <=", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressLike(String value) {
            addCriterion("residence_address like", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressNotLike(String value) {
            addCriterion("residence_address not like", value, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressIn(List<String> values) {
            addCriterion("residence_address in", values, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressNotIn(List<String> values) {
            addCriterion("residence_address not in", values, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressBetween(String value1, String value2) {
            addCriterion("residence_address between", value1, value2, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andResidenceAddressNotBetween(String value1, String value2) {
            addCriterion("residence_address not between", value1, value2, "residenceAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIsNull() {
            addCriterion("current_address is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIsNotNull() {
            addCriterion("current_address is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressEqualTo(String value) {
            addCriterion("current_address =", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotEqualTo(String value) {
            addCriterion("current_address <>", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressGreaterThan(String value) {
            addCriterion("current_address >", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("current_address >=", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLessThan(String value) {
            addCriterion("current_address <", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLessThanOrEqualTo(String value) {
            addCriterion("current_address <=", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLike(String value) {
            addCriterion("current_address like", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotLike(String value) {
            addCriterion("current_address not like", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIn(List<String> values) {
            addCriterion("current_address in", values, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotIn(List<String> values) {
            addCriterion("current_address not in", values, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressBetween(String value1, String value2) {
            addCriterion("current_address between", value1, value2, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotBetween(String value1, String value2) {
            addCriterion("current_address not between", value1, value2, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNull() {
            addCriterion("blood_type is null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNotNull() {
            addCriterion("blood_type is not null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeEqualTo(String value) {
            addCriterion("blood_type =", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotEqualTo(String value) {
            addCriterion("blood_type <>", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThan(String value) {
            addCriterion("blood_type >", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("blood_type >=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThan(String value) {
            addCriterion("blood_type <", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThanOrEqualTo(String value) {
            addCriterion("blood_type <=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLike(String value) {
            addCriterion("blood_type like", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotLike(String value) {
            addCriterion("blood_type not like", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIn(List<String> values) {
            addCriterion("blood_type in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotIn(List<String> values) {
            addCriterion("blood_type not in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeBetween(String value1, String value2) {
            addCriterion("blood_type between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotBetween(String value1, String value2) {
            addCriterion("blood_type not between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andRhBloodIsNull() {
            addCriterion("rh_blood is null");
            return (Criteria) this;
        }

        public Criteria andRhBloodIsNotNull() {
            addCriterion("rh_blood is not null");
            return (Criteria) this;
        }

        public Criteria andRhBloodEqualTo(String value) {
            addCriterion("rh_blood =", value, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodNotEqualTo(String value) {
            addCriterion("rh_blood <>", value, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodGreaterThan(String value) {
            addCriterion("rh_blood >", value, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodGreaterThanOrEqualTo(String value) {
            addCriterion("rh_blood >=", value, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodLessThan(String value) {
            addCriterion("rh_blood <", value, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodLessThanOrEqualTo(String value) {
            addCriterion("rh_blood <=", value, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodLike(String value) {
            addCriterion("rh_blood like", value, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodNotLike(String value) {
            addCriterion("rh_blood not like", value, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodIn(List<String> values) {
            addCriterion("rh_blood in", values, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodNotIn(List<String> values) {
            addCriterion("rh_blood not in", values, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodBetween(String value1, String value2) {
            addCriterion("rh_blood between", value1, value2, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andRhBloodNotBetween(String value1, String value2) {
            addCriterion("rh_blood not between", value1, value2, "rhBlood");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringIsNull() {
            addCriterion("payment_waystring is null");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringIsNotNull() {
            addCriterion("payment_waystring is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringEqualTo(String value) {
            addCriterion("payment_waystring =", value, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringNotEqualTo(String value) {
            addCriterion("payment_waystring <>", value, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringGreaterThan(String value) {
            addCriterion("payment_waystring >", value, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringGreaterThanOrEqualTo(String value) {
            addCriterion("payment_waystring >=", value, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringLessThan(String value) {
            addCriterion("payment_waystring <", value, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringLessThanOrEqualTo(String value) {
            addCriterion("payment_waystring <=", value, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringLike(String value) {
            addCriterion("payment_waystring like", value, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringNotLike(String value) {
            addCriterion("payment_waystring not like", value, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringIn(List<String> values) {
            addCriterion("payment_waystring in", values, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringNotIn(List<String> values) {
            addCriterion("payment_waystring not in", values, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringBetween(String value1, String value2) {
            addCriterion("payment_waystring between", value1, value2, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andPaymentWaystringNotBetween(String value1, String value2) {
            addCriterion("payment_waystring not between", value1, value2, "paymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringIsNull() {
            addCriterion("other_payment_waystring is null");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringIsNotNull() {
            addCriterion("other_payment_waystring is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringEqualTo(String value) {
            addCriterion("other_payment_waystring =", value, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringNotEqualTo(String value) {
            addCriterion("other_payment_waystring <>", value, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringGreaterThan(String value) {
            addCriterion("other_payment_waystring >", value, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringGreaterThanOrEqualTo(String value) {
            addCriterion("other_payment_waystring >=", value, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringLessThan(String value) {
            addCriterion("other_payment_waystring <", value, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringLessThanOrEqualTo(String value) {
            addCriterion("other_payment_waystring <=", value, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringLike(String value) {
            addCriterion("other_payment_waystring like", value, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringNotLike(String value) {
            addCriterion("other_payment_waystring not like", value, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringIn(List<String> values) {
            addCriterion("other_payment_waystring in", values, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringNotIn(List<String> values) {
            addCriterion("other_payment_waystring not in", values, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringBetween(String value1, String value2) {
            addCriterion("other_payment_waystring between", value1, value2, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andOtherPaymentWaystringNotBetween(String value1, String value2) {
            addCriterion("other_payment_waystring not between", value1, value2, "otherPaymentWaystring");
            return (Criteria) this;
        }

        public Criteria andMasterFlagIsNull() {
            addCriterion("master_flag is null");
            return (Criteria) this;
        }

        public Criteria andMasterFlagIsNotNull() {
            addCriterion("master_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMasterFlagEqualTo(String value) {
            addCriterion("master_flag =", value, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagNotEqualTo(String value) {
            addCriterion("master_flag <>", value, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagGreaterThan(String value) {
            addCriterion("master_flag >", value, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagGreaterThanOrEqualTo(String value) {
            addCriterion("master_flag >=", value, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagLessThan(String value) {
            addCriterion("master_flag <", value, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagLessThanOrEqualTo(String value) {
            addCriterion("master_flag <=", value, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagLike(String value) {
            addCriterion("master_flag like", value, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagNotLike(String value) {
            addCriterion("master_flag not like", value, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagIn(List<String> values) {
            addCriterion("master_flag in", values, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagNotIn(List<String> values) {
            addCriterion("master_flag not in", values, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagBetween(String value1, String value2) {
            addCriterion("master_flag between", value1, value2, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andMasterFlagNotBetween(String value1, String value2) {
            addCriterion("master_flag not between", value1, value2, "masterFlag");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNull() {
            addCriterion("work_date is null");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNotNull() {
            addCriterion("work_date is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDateEqualTo(Date value) {
            addCriterionForJDBCDate("work_date =", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("work_date <>", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("work_date >", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_date >=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThan(Date value) {
            addCriterionForJDBCDate("work_date <", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_date <=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateIn(List<Date> values) {
            addCriterionForJDBCDate("work_date in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("work_date not in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_date between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_date not between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNull() {
            addCriterion("contact_person is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNotNull() {
            addCriterion("contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonEqualTo(String value) {
            addCriterion("contact_person =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("contact_person <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThan(String value) {
            addCriterion("contact_person >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThan(String value) {
            addCriterion("contact_person <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("contact_person <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLike(String value) {
            addCriterion("contact_person like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotLike(String value) {
            addCriterion("contact_person not like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonIn(List<String> values) {
            addCriterion("contact_person in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("contact_person not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("contact_person between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("contact_person not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorIsNull() {
            addCriterion("responsibility_doctor is null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorIsNotNull() {
            addCriterion("responsibility_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorEqualTo(String value) {
            addCriterion("responsibility_doctor =", value, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorNotEqualTo(String value) {
            addCriterion("responsibility_doctor <>", value, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorGreaterThan(String value) {
            addCriterion("responsibility_doctor >", value, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("responsibility_doctor >=", value, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorLessThan(String value) {
            addCriterion("responsibility_doctor <", value, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorLessThanOrEqualTo(String value) {
            addCriterion("responsibility_doctor <=", value, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorLike(String value) {
            addCriterion("responsibility_doctor like", value, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorNotLike(String value) {
            addCriterion("responsibility_doctor not like", value, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorIn(List<String> values) {
            addCriterion("responsibility_doctor in", values, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorNotIn(List<String> values) {
            addCriterion("responsibility_doctor not in", values, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorBetween(String value1, String value2) {
            addCriterion("responsibility_doctor between", value1, value2, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andResponsibilityDoctorNotBetween(String value1, String value2) {
            addCriterion("responsibility_doctor not between", value1, value2, "responsibilityDoctor");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNull() {
            addCriterion("income_type is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNotNull() {
            addCriterion("income_type is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeEqualTo(String value) {
            addCriterion("income_type =", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotEqualTo(String value) {
            addCriterion("income_type <>", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThan(String value) {
            addCriterion("income_type >", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("income_type >=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThan(String value) {
            addCriterion("income_type <", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThanOrEqualTo(String value) {
            addCriterion("income_type <=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLike(String value) {
            addCriterion("income_type like", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotLike(String value) {
            addCriterion("income_type not like", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIn(List<String> values) {
            addCriterion("income_type in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotIn(List<String> values) {
            addCriterion("income_type not in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeBetween(String value1, String value2) {
            addCriterion("income_type between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotBetween(String value1, String value2) {
            addCriterion("income_type not between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameIsNull() {
            addCriterion("build_employee_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameIsNotNull() {
            addCriterion("build_employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameEqualTo(String value) {
            addCriterion("build_employee_name =", value, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameNotEqualTo(String value) {
            addCriterion("build_employee_name <>", value, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameGreaterThan(String value) {
            addCriterion("build_employee_name >", value, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("build_employee_name >=", value, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameLessThan(String value) {
            addCriterion("build_employee_name <", value, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("build_employee_name <=", value, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameLike(String value) {
            addCriterion("build_employee_name like", value, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameNotLike(String value) {
            addCriterion("build_employee_name not like", value, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameIn(List<String> values) {
            addCriterion("build_employee_name in", values, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameNotIn(List<String> values) {
            addCriterion("build_employee_name not in", values, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameBetween(String value1, String value2) {
            addCriterion("build_employee_name between", value1, value2, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andBuildEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("build_employee_name not between", value1, value2, "buildEmployeeName");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryIsNull() {
            addCriterion("drug_allergy_history is null");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryIsNotNull() {
            addCriterion("drug_allergy_history is not null");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryEqualTo(String value) {
            addCriterion("drug_allergy_history =", value, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryNotEqualTo(String value) {
            addCriterion("drug_allergy_history <>", value, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryGreaterThan(String value) {
            addCriterion("drug_allergy_history >", value, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("drug_allergy_history >=", value, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryLessThan(String value) {
            addCriterion("drug_allergy_history <", value, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryLessThanOrEqualTo(String value) {
            addCriterion("drug_allergy_history <=", value, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryLike(String value) {
            addCriterion("drug_allergy_history like", value, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryNotLike(String value) {
            addCriterion("drug_allergy_history not like", value, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryIn(List<String> values) {
            addCriterion("drug_allergy_history in", values, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryNotIn(List<String> values) {
            addCriterion("drug_allergy_history not in", values, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryBetween(String value1, String value2) {
            addCriterion("drug_allergy_history between", value1, value2, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andDrugAllergyHistoryNotBetween(String value1, String value2) {
            addCriterion("drug_allergy_history not between", value1, value2, "drugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryIsNull() {
            addCriterion("other_drug_allergy_history is null");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryIsNotNull() {
            addCriterion("other_drug_allergy_history is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryEqualTo(String value) {
            addCriterion("other_drug_allergy_history =", value, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryNotEqualTo(String value) {
            addCriterion("other_drug_allergy_history <>", value, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryGreaterThan(String value) {
            addCriterion("other_drug_allergy_history >", value, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("other_drug_allergy_history >=", value, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryLessThan(String value) {
            addCriterion("other_drug_allergy_history <", value, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryLessThanOrEqualTo(String value) {
            addCriterion("other_drug_allergy_history <=", value, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryLike(String value) {
            addCriterion("other_drug_allergy_history like", value, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryNotLike(String value) {
            addCriterion("other_drug_allergy_history not like", value, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryIn(List<String> values) {
            addCriterion("other_drug_allergy_history in", values, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryNotIn(List<String> values) {
            addCriterion("other_drug_allergy_history not in", values, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryBetween(String value1, String value2) {
            addCriterion("other_drug_allergy_history between", value1, value2, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andOtherDrugAllergyHistoryNotBetween(String value1, String value2) {
            addCriterion("other_drug_allergy_history not between", value1, value2, "otherDrugAllergyHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryIsNull() {
            addCriterion("exposure_history is null");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryIsNotNull() {
            addCriterion("exposure_history is not null");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryEqualTo(String value) {
            addCriterion("exposure_history =", value, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryNotEqualTo(String value) {
            addCriterion("exposure_history <>", value, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryGreaterThan(String value) {
            addCriterion("exposure_history >", value, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("exposure_history >=", value, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryLessThan(String value) {
            addCriterion("exposure_history <", value, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryLessThanOrEqualTo(String value) {
            addCriterion("exposure_history <=", value, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryLike(String value) {
            addCriterion("exposure_history like", value, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryNotLike(String value) {
            addCriterion("exposure_history not like", value, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryIn(List<String> values) {
            addCriterion("exposure_history in", values, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryNotIn(List<String> values) {
            addCriterion("exposure_history not in", values, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryBetween(String value1, String value2) {
            addCriterion("exposure_history between", value1, value2, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andExposureHistoryNotBetween(String value1, String value2) {
            addCriterion("exposure_history not between", value1, value2, "exposureHistory");
            return (Criteria) this;
        }

        public Criteria andDisabilityIsNull() {
            addCriterion("disability is null");
            return (Criteria) this;
        }

        public Criteria andDisabilityIsNotNull() {
            addCriterion("disability is not null");
            return (Criteria) this;
        }

        public Criteria andDisabilityEqualTo(String value) {
            addCriterion("disability =", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotEqualTo(String value) {
            addCriterion("disability <>", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityGreaterThan(String value) {
            addCriterion("disability >", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityGreaterThanOrEqualTo(String value) {
            addCriterion("disability >=", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLessThan(String value) {
            addCriterion("disability <", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLessThanOrEqualTo(String value) {
            addCriterion("disability <=", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityLike(String value) {
            addCriterion("disability like", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotLike(String value) {
            addCriterion("disability not like", value, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityIn(List<String> values) {
            addCriterion("disability in", values, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotIn(List<String> values) {
            addCriterion("disability not in", values, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityBetween(String value1, String value2) {
            addCriterion("disability between", value1, value2, "disability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNotBetween(String value1, String value2) {
            addCriterion("disability not between", value1, value2, "disability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityIsNull() {
            addCriterion("other_disability is null");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityIsNotNull() {
            addCriterion("other_disability is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityEqualTo(String value) {
            addCriterion("other_disability =", value, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityNotEqualTo(String value) {
            addCriterion("other_disability <>", value, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityGreaterThan(String value) {
            addCriterion("other_disability >", value, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityGreaterThanOrEqualTo(String value) {
            addCriterion("other_disability >=", value, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityLessThan(String value) {
            addCriterion("other_disability <", value, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityLessThanOrEqualTo(String value) {
            addCriterion("other_disability <=", value, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityLike(String value) {
            addCriterion("other_disability like", value, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityNotLike(String value) {
            addCriterion("other_disability not like", value, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityIn(List<String> values) {
            addCriterion("other_disability in", values, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityNotIn(List<String> values) {
            addCriterion("other_disability not in", values, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityBetween(String value1, String value2) {
            addCriterion("other_disability between", value1, value2, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andOtherDisabilityNotBetween(String value1, String value2) {
            addCriterion("other_disability not between", value1, value2, "otherDisability");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberIsNull() {
            addCriterion("disability_number is null");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberIsNotNull() {
            addCriterion("disability_number is not null");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberEqualTo(String value) {
            addCriterion("disability_number =", value, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberNotEqualTo(String value) {
            addCriterion("disability_number <>", value, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberGreaterThan(String value) {
            addCriterion("disability_number >", value, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberGreaterThanOrEqualTo(String value) {
            addCriterion("disability_number >=", value, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberLessThan(String value) {
            addCriterion("disability_number <", value, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberLessThanOrEqualTo(String value) {
            addCriterion("disability_number <=", value, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberLike(String value) {
            addCriterion("disability_number like", value, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberNotLike(String value) {
            addCriterion("disability_number not like", value, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberIn(List<String> values) {
            addCriterion("disability_number in", values, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberNotIn(List<String> values) {
            addCriterion("disability_number not in", values, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberBetween(String value1, String value2) {
            addCriterion("disability_number between", value1, value2, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andDisabilityNumberNotBetween(String value1, String value2) {
            addCriterion("disability_number not between", value1, value2, "disabilityNumber");
            return (Criteria) this;
        }

        public Criteria andIsFlowingIsNull() {
            addCriterion("is_flowing is null");
            return (Criteria) this;
        }

        public Criteria andIsFlowingIsNotNull() {
            addCriterion("is_flowing is not null");
            return (Criteria) this;
        }

        public Criteria andIsFlowingEqualTo(String value) {
            addCriterion("is_flowing =", value, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingNotEqualTo(String value) {
            addCriterion("is_flowing <>", value, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingGreaterThan(String value) {
            addCriterion("is_flowing >", value, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingGreaterThanOrEqualTo(String value) {
            addCriterion("is_flowing >=", value, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingLessThan(String value) {
            addCriterion("is_flowing <", value, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingLessThanOrEqualTo(String value) {
            addCriterion("is_flowing <=", value, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingLike(String value) {
            addCriterion("is_flowing like", value, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingNotLike(String value) {
            addCriterion("is_flowing not like", value, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingIn(List<String> values) {
            addCriterion("is_flowing in", values, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingNotIn(List<String> values) {
            addCriterion("is_flowing not in", values, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingBetween(String value1, String value2) {
            addCriterion("is_flowing between", value1, value2, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsFlowingNotBetween(String value1, String value2) {
            addCriterion("is_flowing not between", value1, value2, "isFlowing");
            return (Criteria) this;
        }

        public Criteria andIsPoorIsNull() {
            addCriterion("is_poor is null");
            return (Criteria) this;
        }

        public Criteria andIsPoorIsNotNull() {
            addCriterion("is_poor is not null");
            return (Criteria) this;
        }

        public Criteria andIsPoorEqualTo(String value) {
            addCriterion("is_poor =", value, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorNotEqualTo(String value) {
            addCriterion("is_poor <>", value, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorGreaterThan(String value) {
            addCriterion("is_poor >", value, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorGreaterThanOrEqualTo(String value) {
            addCriterion("is_poor >=", value, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorLessThan(String value) {
            addCriterion("is_poor <", value, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorLessThanOrEqualTo(String value) {
            addCriterion("is_poor <=", value, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorLike(String value) {
            addCriterion("is_poor like", value, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorNotLike(String value) {
            addCriterion("is_poor not like", value, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorIn(List<String> values) {
            addCriterion("is_poor in", values, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorNotIn(List<String> values) {
            addCriterion("is_poor not in", values, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorBetween(String value1, String value2) {
            addCriterion("is_poor between", value1, value2, "isPoor");
            return (Criteria) this;
        }

        public Criteria andIsPoorNotBetween(String value1, String value2) {
            addCriterion("is_poor not between", value1, value2, "isPoor");
            return (Criteria) this;
        }

        public Criteria andXiangzhenIsNull() {
            addCriterion("xiangzhen is null");
            return (Criteria) this;
        }

        public Criteria andXiangzhenIsNotNull() {
            addCriterion("xiangzhen is not null");
            return (Criteria) this;
        }

        public Criteria andXiangzhenEqualTo(String value) {
            addCriterion("xiangzhen =", value, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenNotEqualTo(String value) {
            addCriterion("xiangzhen <>", value, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenGreaterThan(String value) {
            addCriterion("xiangzhen >", value, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenGreaterThanOrEqualTo(String value) {
            addCriterion("xiangzhen >=", value, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenLessThan(String value) {
            addCriterion("xiangzhen <", value, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenLessThanOrEqualTo(String value) {
            addCriterion("xiangzhen <=", value, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenLike(String value) {
            addCriterion("xiangzhen like", value, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenNotLike(String value) {
            addCriterion("xiangzhen not like", value, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenIn(List<String> values) {
            addCriterion("xiangzhen in", values, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenNotIn(List<String> values) {
            addCriterion("xiangzhen not in", values, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenBetween(String value1, String value2) {
            addCriterion("xiangzhen between", value1, value2, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andXiangzhenNotBetween(String value1, String value2) {
            addCriterion("xiangzhen not between", value1, value2, "xiangzhen");
            return (Criteria) this;
        }

        public Criteria andCunIsNull() {
            addCriterion("cun is null");
            return (Criteria) this;
        }

        public Criteria andCunIsNotNull() {
            addCriterion("cun is not null");
            return (Criteria) this;
        }

        public Criteria andCunEqualTo(String value) {
            addCriterion("cun =", value, "cun");
            return (Criteria) this;
        }

        public Criteria andCunNotEqualTo(String value) {
            addCriterion("cun <>", value, "cun");
            return (Criteria) this;
        }

        public Criteria andCunGreaterThan(String value) {
            addCriterion("cun >", value, "cun");
            return (Criteria) this;
        }

        public Criteria andCunGreaterThanOrEqualTo(String value) {
            addCriterion("cun >=", value, "cun");
            return (Criteria) this;
        }

        public Criteria andCunLessThan(String value) {
            addCriterion("cun <", value, "cun");
            return (Criteria) this;
        }

        public Criteria andCunLessThanOrEqualTo(String value) {
            addCriterion("cun <=", value, "cun");
            return (Criteria) this;
        }

        public Criteria andCunLike(String value) {
            addCriterion("cun like", value, "cun");
            return (Criteria) this;
        }

        public Criteria andCunNotLike(String value) {
            addCriterion("cun not like", value, "cun");
            return (Criteria) this;
        }

        public Criteria andCunIn(List<String> values) {
            addCriterion("cun in", values, "cun");
            return (Criteria) this;
        }

        public Criteria andCunNotIn(List<String> values) {
            addCriterion("cun not in", values, "cun");
            return (Criteria) this;
        }

        public Criteria andCunBetween(String value1, String value2) {
            addCriterion("cun between", value1, value2, "cun");
            return (Criteria) this;
        }

        public Criteria andCunNotBetween(String value1, String value2) {
            addCriterion("cun not between", value1, value2, "cun");
            return (Criteria) this;
        }

        public Criteria andOtherNotesIsNull() {
            addCriterion("other_notes is null");
            return (Criteria) this;
        }

        public Criteria andOtherNotesIsNotNull() {
            addCriterion("other_notes is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNotesEqualTo(String value) {
            addCriterion("other_notes =", value, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesNotEqualTo(String value) {
            addCriterion("other_notes <>", value, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesGreaterThan(String value) {
            addCriterion("other_notes >", value, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesGreaterThanOrEqualTo(String value) {
            addCriterion("other_notes >=", value, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesLessThan(String value) {
            addCriterion("other_notes <", value, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesLessThanOrEqualTo(String value) {
            addCriterion("other_notes <=", value, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesLike(String value) {
            addCriterion("other_notes like", value, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesNotLike(String value) {
            addCriterion("other_notes not like", value, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesIn(List<String> values) {
            addCriterion("other_notes in", values, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesNotIn(List<String> values) {
            addCriterion("other_notes not in", values, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesBetween(String value1, String value2) {
            addCriterion("other_notes between", value1, value2, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andOtherNotesNotBetween(String value1, String value2) {
            addCriterion("other_notes not between", value1, value2, "otherNotes");
            return (Criteria) this;
        }

        public Criteria andIfSignIsNull() {
            addCriterion("if_sign is null");
            return (Criteria) this;
        }

        public Criteria andIfSignIsNotNull() {
            addCriterion("if_sign is not null");
            return (Criteria) this;
        }

        public Criteria andIfSignEqualTo(Integer value) {
            addCriterion("if_sign =", value, "ifSign");
            return (Criteria) this;
        }

        public Criteria andIfSignNotEqualTo(Integer value) {
            addCriterion("if_sign <>", value, "ifSign");
            return (Criteria) this;
        }

        public Criteria andIfSignGreaterThan(Integer value) {
            addCriterion("if_sign >", value, "ifSign");
            return (Criteria) this;
        }

        public Criteria andIfSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_sign >=", value, "ifSign");
            return (Criteria) this;
        }

        public Criteria andIfSignLessThan(Integer value) {
            addCriterion("if_sign <", value, "ifSign");
            return (Criteria) this;
        }

        public Criteria andIfSignLessThanOrEqualTo(Integer value) {
            addCriterion("if_sign <=", value, "ifSign");
            return (Criteria) this;
        }

        public Criteria andIfSignIn(List<Integer> values) {
            addCriterion("if_sign in", values, "ifSign");
            return (Criteria) this;
        }

        public Criteria andIfSignNotIn(List<Integer> values) {
            addCriterion("if_sign not in", values, "ifSign");
            return (Criteria) this;
        }

        public Criteria andIfSignBetween(Integer value1, Integer value2) {
            addCriterion("if_sign between", value1, value2, "ifSign");
            return (Criteria) this;
        }

        public Criteria andIfSignNotBetween(Integer value1, Integer value2) {
            addCriterion("if_sign not between", value1, value2, "ifSign");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("lasttime is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Date value) {
            addCriterionForJDBCDate("lasttime =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("lasttime <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("lasttime >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lasttime >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Date value) {
            addCriterionForJDBCDate("lasttime <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lasttime <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Date> values) {
            addCriterionForJDBCDate("lasttime in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("lasttime not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lasttime between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lasttime not between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andFamilyTelIsNull() {
            addCriterion("family_tel is null");
            return (Criteria) this;
        }

        public Criteria andFamilyTelIsNotNull() {
            addCriterion("family_tel is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyTelEqualTo(String value) {
            addCriterion("family_tel =", value, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelNotEqualTo(String value) {
            addCriterion("family_tel <>", value, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelGreaterThan(String value) {
            addCriterion("family_tel >", value, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelGreaterThanOrEqualTo(String value) {
            addCriterion("family_tel >=", value, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelLessThan(String value) {
            addCriterion("family_tel <", value, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelLessThanOrEqualTo(String value) {
            addCriterion("family_tel <=", value, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelLike(String value) {
            addCriterion("family_tel like", value, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelNotLike(String value) {
            addCriterion("family_tel not like", value, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelIn(List<String> values) {
            addCriterion("family_tel in", values, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelNotIn(List<String> values) {
            addCriterion("family_tel not in", values, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelBetween(String value1, String value2) {
            addCriterion("family_tel between", value1, value2, "familyTel");
            return (Criteria) this;
        }

        public Criteria andFamilyTelNotBetween(String value1, String value2) {
            addCriterion("family_tel not between", value1, value2, "familyTel");
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