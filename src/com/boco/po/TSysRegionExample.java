package com.boco.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSysRegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSysRegionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAnotherNameIsNull() {
            addCriterion("another_name is null");
            return (Criteria) this;
        }

        public Criteria andAnotherNameIsNotNull() {
            addCriterion("another_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnotherNameEqualTo(String value) {
            addCriterion("another_name =", value, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameNotEqualTo(String value) {
            addCriterion("another_name <>", value, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameGreaterThan(String value) {
            addCriterion("another_name >", value, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameGreaterThanOrEqualTo(String value) {
            addCriterion("another_name >=", value, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameLessThan(String value) {
            addCriterion("another_name <", value, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameLessThanOrEqualTo(String value) {
            addCriterion("another_name <=", value, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameLike(String value) {
            addCriterion("another_name like", value, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameNotLike(String value) {
            addCriterion("another_name not like", value, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameIn(List<String> values) {
            addCriterion("another_name in", values, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameNotIn(List<String> values) {
            addCriterion("another_name not in", values, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameBetween(String value1, String value2) {
            addCriterion("another_name between", value1, value2, "anotherName");
            return (Criteria) this;
        }

        public Criteria andAnotherNameNotBetween(String value1, String value2) {
            addCriterion("another_name not between", value1, value2, "anotherName");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(String value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(String value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(String value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(String value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(String value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLike(String value) {
            addCriterion("capital like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotLike(String value) {
            addCriterion("capital not like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<String> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<String> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(String value1, String value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(String value1, String value2) {
            addCriterion("capital not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCenterIsNull() {
            addCriterion("center is null");
            return (Criteria) this;
        }

        public Criteria andCenterIsNotNull() {
            addCriterion("center is not null");
            return (Criteria) this;
        }

        public Criteria andCenterEqualTo(String value) {
            addCriterion("center =", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotEqualTo(String value) {
            addCriterion("center <>", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterGreaterThan(String value) {
            addCriterion("center >", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterGreaterThanOrEqualTo(String value) {
            addCriterion("center >=", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterLessThan(String value) {
            addCriterion("center <", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterLessThanOrEqualTo(String value) {
            addCriterion("center <=", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterLike(String value) {
            addCriterion("center like", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotLike(String value) {
            addCriterion("center not like", value, "center");
            return (Criteria) this;
        }

        public Criteria andCenterIn(List<String> values) {
            addCriterion("center in", values, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotIn(List<String> values) {
            addCriterion("center not in", values, "center");
            return (Criteria) this;
        }

        public Criteria andCenterBetween(String value1, String value2) {
            addCriterion("center between", value1, value2, "center");
            return (Criteria) this;
        }

        public Criteria andCenterNotBetween(String value1, String value2) {
            addCriterion("center not between", value1, value2, "center");
            return (Criteria) this;
        }

        public Criteria andFamilyNumIsNull() {
            addCriterion("family_num is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNumIsNotNull() {
            addCriterion("family_num is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNumEqualTo(Integer value) {
            addCriterion("family_num =", value, "familyNum");
            return (Criteria) this;
        }

        public Criteria andFamilyNumNotEqualTo(Integer value) {
            addCriterion("family_num <>", value, "familyNum");
            return (Criteria) this;
        }

        public Criteria andFamilyNumGreaterThan(Integer value) {
            addCriterion("family_num >", value, "familyNum");
            return (Criteria) this;
        }

        public Criteria andFamilyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_num >=", value, "familyNum");
            return (Criteria) this;
        }

        public Criteria andFamilyNumLessThan(Integer value) {
            addCriterion("family_num <", value, "familyNum");
            return (Criteria) this;
        }

        public Criteria andFamilyNumLessThanOrEqualTo(Integer value) {
            addCriterion("family_num <=", value, "familyNum");
            return (Criteria) this;
        }

        public Criteria andFamilyNumIn(List<Integer> values) {
            addCriterion("family_num in", values, "familyNum");
            return (Criteria) this;
        }

        public Criteria andFamilyNumNotIn(List<Integer> values) {
            addCriterion("family_num not in", values, "familyNum");
            return (Criteria) this;
        }

        public Criteria andFamilyNumBetween(Integer value1, Integer value2) {
            addCriterion("family_num between", value1, value2, "familyNum");
            return (Criteria) this;
        }

        public Criteria andFamilyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("family_num not between", value1, value2, "familyNum");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNull() {
            addCriterion("population is null");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNotNull() {
            addCriterion("population is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationEqualTo(Integer value) {
            addCriterion("population =", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotEqualTo(Integer value) {
            addCriterion("population <>", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThan(Integer value) {
            addCriterion("population >", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThanOrEqualTo(Integer value) {
            addCriterion("population >=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThan(Integer value) {
            addCriterion("population <", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThanOrEqualTo(Integer value) {
            addCriterion("population <=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationIn(List<Integer> values) {
            addCriterion("population in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotIn(List<Integer> values) {
            addCriterion("population not in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationBetween(Integer value1, Integer value2) {
            addCriterion("population between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotBetween(Integer value1, Integer value2) {
            addCriterion("population not between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdIsNull() {
            addCriterion("other_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdIsNotNull() {
            addCriterion("other_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdEqualTo(Integer value) {
            addCriterion("other_parent_id =", value, "otherParentId");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdNotEqualTo(Integer value) {
            addCriterion("other_parent_id <>", value, "otherParentId");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdGreaterThan(Integer value) {
            addCriterion("other_parent_id >", value, "otherParentId");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_parent_id >=", value, "otherParentId");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdLessThan(Integer value) {
            addCriterion("other_parent_id <", value, "otherParentId");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("other_parent_id <=", value, "otherParentId");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdIn(List<Integer> values) {
            addCriterion("other_parent_id in", values, "otherParentId");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdNotIn(List<Integer> values) {
            addCriterion("other_parent_id not in", values, "otherParentId");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdBetween(Integer value1, Integer value2) {
            addCriterion("other_parent_id between", value1, value2, "otherParentId");
            return (Criteria) this;
        }

        public Criteria andOtherParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("other_parent_id not between", value1, value2, "otherParentId");
            return (Criteria) this;
        }

        public Criteria andChildrenNumIsNull() {
            addCriterion("children_num is null");
            return (Criteria) this;
        }

        public Criteria andChildrenNumIsNotNull() {
            addCriterion("children_num is not null");
            return (Criteria) this;
        }

        public Criteria andChildrenNumEqualTo(Integer value) {
            addCriterion("children_num =", value, "childrenNum");
            return (Criteria) this;
        }

        public Criteria andChildrenNumNotEqualTo(Integer value) {
            addCriterion("children_num <>", value, "childrenNum");
            return (Criteria) this;
        }

        public Criteria andChildrenNumGreaterThan(Integer value) {
            addCriterion("children_num >", value, "childrenNum");
            return (Criteria) this;
        }

        public Criteria andChildrenNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("children_num >=", value, "childrenNum");
            return (Criteria) this;
        }

        public Criteria andChildrenNumLessThan(Integer value) {
            addCriterion("children_num <", value, "childrenNum");
            return (Criteria) this;
        }

        public Criteria andChildrenNumLessThanOrEqualTo(Integer value) {
            addCriterion("children_num <=", value, "childrenNum");
            return (Criteria) this;
        }

        public Criteria andChildrenNumIn(List<Integer> values) {
            addCriterion("children_num in", values, "childrenNum");
            return (Criteria) this;
        }

        public Criteria andChildrenNumNotIn(List<Integer> values) {
            addCriterion("children_num not in", values, "childrenNum");
            return (Criteria) this;
        }

        public Criteria andChildrenNumBetween(Integer value1, Integer value2) {
            addCriterion("children_num between", value1, value2, "childrenNum");
            return (Criteria) this;
        }

        public Criteria andChildrenNumNotBetween(Integer value1, Integer value2) {
            addCriterion("children_num not between", value1, value2, "childrenNum");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Short value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Short value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Short value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Short value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Short value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Short> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Short> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Short value1, Short value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Short value1, Short value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andLftIsNull() {
            addCriterion("lft is null");
            return (Criteria) this;
        }

        public Criteria andLftIsNotNull() {
            addCriterion("lft is not null");
            return (Criteria) this;
        }

        public Criteria andLftEqualTo(Integer value) {
            addCriterion("lft =", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftNotEqualTo(Integer value) {
            addCriterion("lft <>", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftGreaterThan(Integer value) {
            addCriterion("lft >", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftGreaterThanOrEqualTo(Integer value) {
            addCriterion("lft >=", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftLessThan(Integer value) {
            addCriterion("lft <", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftLessThanOrEqualTo(Integer value) {
            addCriterion("lft <=", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftIn(List<Integer> values) {
            addCriterion("lft in", values, "lft");
            return (Criteria) this;
        }

        public Criteria andLftNotIn(List<Integer> values) {
            addCriterion("lft not in", values, "lft");
            return (Criteria) this;
        }

        public Criteria andLftBetween(Integer value1, Integer value2) {
            addCriterion("lft between", value1, value2, "lft");
            return (Criteria) this;
        }

        public Criteria andLftNotBetween(Integer value1, Integer value2) {
            addCriterion("lft not between", value1, value2, "lft");
            return (Criteria) this;
        }

        public Criteria andRgtIsNull() {
            addCriterion("rgt is null");
            return (Criteria) this;
        }

        public Criteria andRgtIsNotNull() {
            addCriterion("rgt is not null");
            return (Criteria) this;
        }

        public Criteria andRgtEqualTo(Integer value) {
            addCriterion("rgt =", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtNotEqualTo(Integer value) {
            addCriterion("rgt <>", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtGreaterThan(Integer value) {
            addCriterion("rgt >", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtGreaterThanOrEqualTo(Integer value) {
            addCriterion("rgt >=", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtLessThan(Integer value) {
            addCriterion("rgt <", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtLessThanOrEqualTo(Integer value) {
            addCriterion("rgt <=", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtIn(List<Integer> values) {
            addCriterion("rgt in", values, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtNotIn(List<Integer> values) {
            addCriterion("rgt not in", values, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtBetween(Integer value1, Integer value2) {
            addCriterion("rgt between", value1, value2, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtNotBetween(Integer value1, Integer value2) {
            addCriterion("rgt not between", value1, value2, "rgt");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorIsNull() {
            addCriterion("insert_operator is null");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorIsNotNull() {
            addCriterion("insert_operator is not null");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorEqualTo(String value) {
            addCriterion("insert_operator =", value, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorNotEqualTo(String value) {
            addCriterion("insert_operator <>", value, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorGreaterThan(String value) {
            addCriterion("insert_operator >", value, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("insert_operator >=", value, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorLessThan(String value) {
            addCriterion("insert_operator <", value, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorLessThanOrEqualTo(String value) {
            addCriterion("insert_operator <=", value, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorLike(String value) {
            addCriterion("insert_operator like", value, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorNotLike(String value) {
            addCriterion("insert_operator not like", value, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorIn(List<String> values) {
            addCriterion("insert_operator in", values, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorNotIn(List<String> values) {
            addCriterion("insert_operator not in", values, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorBetween(String value1, String value2) {
            addCriterion("insert_operator between", value1, value2, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertOperatorNotBetween(String value1, String value2) {
            addCriterion("insert_operator not between", value1, value2, "insertOperator");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIsNull() {
            addCriterion("insert_datetime is null");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIsNotNull() {
            addCriterion("insert_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeEqualTo(Date value) {
            addCriterion("insert_datetime =", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotEqualTo(Date value) {
            addCriterion("insert_datetime <>", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeGreaterThan(Date value) {
            addCriterion("insert_datetime >", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_datetime >=", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeLessThan(Date value) {
            addCriterion("insert_datetime <", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_datetime <=", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIn(List<Date> values) {
            addCriterion("insert_datetime in", values, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotIn(List<Date> values) {
            addCriterion("insert_datetime not in", values, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeBetween(Date value1, Date value2) {
            addCriterion("insert_datetime between", value1, value2, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_datetime not between", value1, value2, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorIsNull() {
            addCriterion("last_modify_operator is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorIsNotNull() {
            addCriterion("last_modify_operator is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorEqualTo(String value) {
            addCriterion("last_modify_operator =", value, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorNotEqualTo(String value) {
            addCriterion("last_modify_operator <>", value, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorGreaterThan(String value) {
            addCriterion("last_modify_operator >", value, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("last_modify_operator >=", value, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorLessThan(String value) {
            addCriterion("last_modify_operator <", value, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorLessThanOrEqualTo(String value) {
            addCriterion("last_modify_operator <=", value, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorLike(String value) {
            addCriterion("last_modify_operator like", value, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorNotLike(String value) {
            addCriterion("last_modify_operator not like", value, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorIn(List<String> values) {
            addCriterion("last_modify_operator in", values, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorNotIn(List<String> values) {
            addCriterion("last_modify_operator not in", values, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorBetween(String value1, String value2) {
            addCriterion("last_modify_operator between", value1, value2, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyOperatorNotBetween(String value1, String value2) {
            addCriterion("last_modify_operator not between", value1, value2, "lastModifyOperator");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeIsNull() {
            addCriterion("last_modify_datetime is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeIsNotNull() {
            addCriterion("last_modify_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeEqualTo(Date value) {
            addCriterion("last_modify_datetime =", value, "lastModifyDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeNotEqualTo(Date value) {
            addCriterion("last_modify_datetime <>", value, "lastModifyDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeGreaterThan(Date value) {
            addCriterion("last_modify_datetime >", value, "lastModifyDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_datetime >=", value, "lastModifyDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeLessThan(Date value) {
            addCriterion("last_modify_datetime <", value, "lastModifyDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_datetime <=", value, "lastModifyDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeIn(List<Date> values) {
            addCriterion("last_modify_datetime in", values, "lastModifyDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeNotIn(List<Date> values) {
            addCriterion("last_modify_datetime not in", values, "lastModifyDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_datetime between", value1, value2, "lastModifyDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_datetime not between", value1, value2, "lastModifyDatetime");
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