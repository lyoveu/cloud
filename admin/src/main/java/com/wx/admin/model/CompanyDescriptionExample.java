package com.wx.admin.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyDescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyDescriptionExample() {
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

        public Criteria andCompanyDescriptionIdIsNull() {
            addCriterion("company_description_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdIsNotNull() {
            addCriterion("company_description_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdEqualTo(Integer value) {
            addCriterion("company_description_id =", value, "companyDescriptionId");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdNotEqualTo(Integer value) {
            addCriterion("company_description_id <>", value, "companyDescriptionId");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdGreaterThan(Integer value) {
            addCriterion("company_description_id >", value, "companyDescriptionId");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_description_id >=", value, "companyDescriptionId");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdLessThan(Integer value) {
            addCriterion("company_description_id <", value, "companyDescriptionId");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_description_id <=", value, "companyDescriptionId");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdIn(List<Integer> values) {
            addCriterion("company_description_id in", values, "companyDescriptionId");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdNotIn(List<Integer> values) {
            addCriterion("company_description_id not in", values, "companyDescriptionId");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdBetween(Integer value1, Integer value2) {
            addCriterion("company_description_id between", value1, value2, "companyDescriptionId");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_description_id not between", value1, value2, "companyDescriptionId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIsNull() {
            addCriterion("company_description is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIsNotNull() {
            addCriterion("company_description is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionEqualTo(String value) {
            addCriterion("company_description =", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionNotEqualTo(String value) {
            addCriterion("company_description <>", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionGreaterThan(String value) {
            addCriterion("company_description >", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("company_description >=", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionLessThan(String value) {
            addCriterion("company_description <", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionLessThanOrEqualTo(String value) {
            addCriterion("company_description <=", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionLike(String value) {
            addCriterion("company_description like", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionNotLike(String value) {
            addCriterion("company_description not like", value, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionIn(List<String> values) {
            addCriterion("company_description in", values, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionNotIn(List<String> values) {
            addCriterion("company_description not in", values, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionBetween(String value1, String value2) {
            addCriterion("company_description between", value1, value2, "companyDescription");
            return (Criteria) this;
        }

        public Criteria andCompanyDescriptionNotBetween(String value1, String value2) {
            addCriterion("company_description not between", value1, value2, "companyDescription");
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