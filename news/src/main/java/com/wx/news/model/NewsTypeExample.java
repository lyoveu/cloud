package com.wx.news.model;

import java.util.ArrayList;
import java.util.List;

public class NewsTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsTypeExample() {
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

        public Criteria andNewsTypeIdIsNull() {
            addCriterion("news_type_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdIsNotNull() {
            addCriterion("news_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdEqualTo(Integer value) {
            addCriterion("news_type_id =", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdNotEqualTo(Integer value) {
            addCriterion("news_type_id <>", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdGreaterThan(Integer value) {
            addCriterion("news_type_id >", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_type_id >=", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdLessThan(Integer value) {
            addCriterion("news_type_id <", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_type_id <=", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdIn(List<Integer> values) {
            addCriterion("news_type_id in", values, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdNotIn(List<Integer> values) {
            addCriterion("news_type_id not in", values, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("news_type_id between", value1, value2, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_type_id not between", value1, value2, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIsNull() {
            addCriterion("news_type is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIsNotNull() {
            addCriterion("news_type is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeEqualTo(Integer value) {
            addCriterion("news_type =", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotEqualTo(Integer value) {
            addCriterion("news_type <>", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeGreaterThan(Integer value) {
            addCriterion("news_type >", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_type >=", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLessThan(Integer value) {
            addCriterion("news_type <", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("news_type <=", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIn(List<Integer> values) {
            addCriterion("news_type in", values, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotIn(List<Integer> values) {
            addCriterion("news_type not in", values, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeBetween(Integer value1, Integer value2) {
            addCriterion("news_type between", value1, value2, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("news_type not between", value1, value2, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameIsNull() {
            addCriterion("news_type_name is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameIsNotNull() {
            addCriterion("news_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameEqualTo(String value) {
            addCriterion("news_type_name =", value, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameNotEqualTo(String value) {
            addCriterion("news_type_name <>", value, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameGreaterThan(String value) {
            addCriterion("news_type_name >", value, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("news_type_name >=", value, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameLessThan(String value) {
            addCriterion("news_type_name <", value, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameLessThanOrEqualTo(String value) {
            addCriterion("news_type_name <=", value, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameLike(String value) {
            addCriterion("news_type_name like", value, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameNotLike(String value) {
            addCriterion("news_type_name not like", value, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameIn(List<String> values) {
            addCriterion("news_type_name in", values, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameNotIn(List<String> values) {
            addCriterion("news_type_name not in", values, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameBetween(String value1, String value2) {
            addCriterion("news_type_name between", value1, value2, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNameNotBetween(String value1, String value2) {
            addCriterion("news_type_name not between", value1, value2, "newsTypeName");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateIsNull() {
            addCriterion("news_type_state is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateIsNotNull() {
            addCriterion("news_type_state is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateEqualTo(Integer value) {
            addCriterion("news_type_state =", value, "newsTypeState");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateNotEqualTo(Integer value) {
            addCriterion("news_type_state <>", value, "newsTypeState");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateGreaterThan(Integer value) {
            addCriterion("news_type_state >", value, "newsTypeState");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_type_state >=", value, "newsTypeState");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateLessThan(Integer value) {
            addCriterion("news_type_state <", value, "newsTypeState");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateLessThanOrEqualTo(Integer value) {
            addCriterion("news_type_state <=", value, "newsTypeState");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateIn(List<Integer> values) {
            addCriterion("news_type_state in", values, "newsTypeState");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateNotIn(List<Integer> values) {
            addCriterion("news_type_state not in", values, "newsTypeState");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateBetween(Integer value1, Integer value2) {
            addCriterion("news_type_state between", value1, value2, "newsTypeState");
            return (Criteria) this;
        }

        public Criteria andNewsTypeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("news_type_state not between", value1, value2, "newsTypeState");
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