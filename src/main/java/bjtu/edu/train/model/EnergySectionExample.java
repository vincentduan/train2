package bjtu.edu.train.model;

import java.util.ArrayList;
import java.util.List;

public class EnergySectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnergySectionExample() {
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

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(String value) {
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(String value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(String value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(String value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(String value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(String value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLike(String value) {
            addCriterion("start like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotLike(String value) {
            addCriterion("start not like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<String> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<String> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(String value1, String value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(String value1, String value2) {
            addCriterion("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andEndIsNull() {
            addCriterion("end is null");
            return (Criteria) this;
        }

        public Criteria andEndIsNotNull() {
            addCriterion("end is not null");
            return (Criteria) this;
        }

        public Criteria andEndEqualTo(String value) {
            addCriterion("end =", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotEqualTo(String value) {
            addCriterion("end <>", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThan(String value) {
            addCriterion("end >", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThanOrEqualTo(String value) {
            addCriterion("end >=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThan(String value) {
            addCriterion("end <", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThanOrEqualTo(String value) {
            addCriterion("end <=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLike(String value) {
            addCriterion("end like", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotLike(String value) {
            addCriterion("end not like", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndIn(List<String> values) {
            addCriterion("end in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotIn(List<String> values) {
            addCriterion("end not in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndBetween(String value1, String value2) {
            addCriterion("end between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotBetween(String value1, String value2) {
            addCriterion("end not between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andEnergeIsNull() {
            addCriterion("energe is null");
            return (Criteria) this;
        }

        public Criteria andEnergeIsNotNull() {
            addCriterion("energe is not null");
            return (Criteria) this;
        }

        public Criteria andEnergeEqualTo(Double value) {
            addCriterion("energe =", value, "energe");
            return (Criteria) this;
        }

        public Criteria andEnergeNotEqualTo(Double value) {
            addCriterion("energe <>", value, "energe");
            return (Criteria) this;
        }

        public Criteria andEnergeGreaterThan(Double value) {
            addCriterion("energe >", value, "energe");
            return (Criteria) this;
        }

        public Criteria andEnergeGreaterThanOrEqualTo(Double value) {
            addCriterion("energe >=", value, "energe");
            return (Criteria) this;
        }

        public Criteria andEnergeLessThan(Double value) {
            addCriterion("energe <", value, "energe");
            return (Criteria) this;
        }

        public Criteria andEnergeLessThanOrEqualTo(Double value) {
            addCriterion("energe <=", value, "energe");
            return (Criteria) this;
        }

        public Criteria andEnergeIn(List<Double> values) {
            addCriterion("energe in", values, "energe");
            return (Criteria) this;
        }

        public Criteria andEnergeNotIn(List<Double> values) {
            addCriterion("energe not in", values, "energe");
            return (Criteria) this;
        }

        public Criteria andEnergeBetween(Double value1, Double value2) {
            addCriterion("energe between", value1, value2, "energe");
            return (Criteria) this;
        }

        public Criteria andEnergeNotBetween(Double value1, Double value2) {
            addCriterion("energe not between", value1, value2, "energe");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNull() {
            addCriterion("runtime is null");
            return (Criteria) this;
        }

        public Criteria andRuntimeIsNotNull() {
            addCriterion("runtime is not null");
            return (Criteria) this;
        }

        public Criteria andRuntimeEqualTo(String value) {
            addCriterion("runtime =", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotEqualTo(String value) {
            addCriterion("runtime <>", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThan(String value) {
            addCriterion("runtime >", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeGreaterThanOrEqualTo(String value) {
            addCriterion("runtime >=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThan(String value) {
            addCriterion("runtime <", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLessThanOrEqualTo(String value) {
            addCriterion("runtime <=", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeLike(String value) {
            addCriterion("runtime like", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotLike(String value) {
            addCriterion("runtime not like", value, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeIn(List<String> values) {
            addCriterion("runtime in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotIn(List<String> values) {
            addCriterion("runtime not in", values, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeBetween(String value1, String value2) {
            addCriterion("runtime between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andRuntimeNotBetween(String value1, String value2) {
            addCriterion("runtime not between", value1, value2, "runtime");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationIsNull() {
            addCriterion("maxAcceleration is null");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationIsNotNull() {
            addCriterion("maxAcceleration is not null");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationEqualTo(Double value) {
            addCriterion("maxAcceleration =", value, "maxacceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationNotEqualTo(Double value) {
            addCriterion("maxAcceleration <>", value, "maxacceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationGreaterThan(Double value) {
            addCriterion("maxAcceleration >", value, "maxacceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationGreaterThanOrEqualTo(Double value) {
            addCriterion("maxAcceleration >=", value, "maxacceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationLessThan(Double value) {
            addCriterion("maxAcceleration <", value, "maxacceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationLessThanOrEqualTo(Double value) {
            addCriterion("maxAcceleration <=", value, "maxacceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationIn(List<Double> values) {
            addCriterion("maxAcceleration in", values, "maxacceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationNotIn(List<Double> values) {
            addCriterion("maxAcceleration not in", values, "maxacceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationBetween(Double value1, Double value2) {
            addCriterion("maxAcceleration between", value1, value2, "maxacceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationNotBetween(Double value1, Double value2) {
            addCriterion("maxAcceleration not between", value1, value2, "maxacceleration");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationIsNull() {
            addCriterion("minusAcceleration is null");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationIsNotNull() {
            addCriterion("minusAcceleration is not null");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationEqualTo(Double value) {
            addCriterion("minusAcceleration =", value, "minusacceleration");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationNotEqualTo(Double value) {
            addCriterion("minusAcceleration <>", value, "minusacceleration");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationGreaterThan(Double value) {
            addCriterion("minusAcceleration >", value, "minusacceleration");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationGreaterThanOrEqualTo(Double value) {
            addCriterion("minusAcceleration >=", value, "minusacceleration");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationLessThan(Double value) {
            addCriterion("minusAcceleration <", value, "minusacceleration");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationLessThanOrEqualTo(Double value) {
            addCriterion("minusAcceleration <=", value, "minusacceleration");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationIn(List<Double> values) {
            addCriterion("minusAcceleration in", values, "minusacceleration");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationNotIn(List<Double> values) {
            addCriterion("minusAcceleration not in", values, "minusacceleration");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationBetween(Double value1, Double value2) {
            addCriterion("minusAcceleration between", value1, value2, "minusacceleration");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationNotBetween(Double value1, Double value2) {
            addCriterion("minusAcceleration not between", value1, value2, "minusacceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateIsNull() {
            addCriterion("maxAcceleration_rate is null");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateIsNotNull() {
            addCriterion("maxAcceleration_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateEqualTo(Double value) {
            addCriterion("maxAcceleration_rate =", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateNotEqualTo(Double value) {
            addCriterion("maxAcceleration_rate <>", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateGreaterThan(Double value) {
            addCriterion("maxAcceleration_rate >", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateGreaterThanOrEqualTo(Double value) {
            addCriterion("maxAcceleration_rate >=", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateLessThan(Double value) {
            addCriterion("maxAcceleration_rate <", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateLessThanOrEqualTo(Double value) {
            addCriterion("maxAcceleration_rate <=", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateIn(List<Double> values) {
            addCriterion("maxAcceleration_rate in", values, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateNotIn(List<Double> values) {
            addCriterion("maxAcceleration_rate not in", values, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateBetween(Double value1, Double value2) {
            addCriterion("maxAcceleration_rate between", value1, value2, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateNotBetween(Double value1, Double value2) {
            addCriterion("maxAcceleration_rate not between", value1, value2, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateIsNull() {
            addCriterion("minusAcceleration_rate is null");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateIsNotNull() {
            addCriterion("minusAcceleration_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateEqualTo(Double value) {
            addCriterion("minusAcceleration_rate =", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateNotEqualTo(Double value) {
            addCriterion("minusAcceleration_rate <>", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateGreaterThan(Double value) {
            addCriterion("minusAcceleration_rate >", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateGreaterThanOrEqualTo(Double value) {
            addCriterion("minusAcceleration_rate >=", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateLessThan(Double value) {
            addCriterion("minusAcceleration_rate <", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateLessThanOrEqualTo(Double value) {
            addCriterion("minusAcceleration_rate <=", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateIn(List<Double> values) {
            addCriterion("minusAcceleration_rate in", values, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateNotIn(List<Double> values) {
            addCriterion("minusAcceleration_rate not in", values, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateBetween(Double value1, Double value2) {
            addCriterion("minusAcceleration_rate between", value1, value2, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateNotBetween(Double value1, Double value2) {
            addCriterion("minusAcceleration_rate not between", value1, value2, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andEbiIsNull() {
            addCriterion("EBI is null");
            return (Criteria) this;
        }

        public Criteria andEbiIsNotNull() {
            addCriterion("EBI is not null");
            return (Criteria) this;
        }

        public Criteria andEbiEqualTo(Integer value) {
            addCriterion("EBI =", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiNotEqualTo(Integer value) {
            addCriterion("EBI <>", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiGreaterThan(Integer value) {
            addCriterion("EBI >", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiGreaterThanOrEqualTo(Integer value) {
            addCriterion("EBI >=", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiLessThan(Integer value) {
            addCriterion("EBI <", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiLessThanOrEqualTo(Integer value) {
            addCriterion("EBI <=", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiIn(List<Integer> values) {
            addCriterion("EBI in", values, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiNotIn(List<Integer> values) {
            addCriterion("EBI not in", values, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiBetween(Integer value1, Integer value2) {
            addCriterion("EBI between", value1, value2, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiNotBetween(Integer value1, Integer value2) {
            addCriterion("EBI not between", value1, value2, "ebi");
            return (Criteria) this;
        }

        public Criteria andField1IsNull() {
            addCriterion("field1 is null");
            return (Criteria) this;
        }

        public Criteria andField1IsNotNull() {
            addCriterion("field1 is not null");
            return (Criteria) this;
        }

        public Criteria andField1EqualTo(String value) {
            addCriterion("field1 =", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotEqualTo(String value) {
            addCriterion("field1 <>", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThan(String value) {
            addCriterion("field1 >", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThanOrEqualTo(String value) {
            addCriterion("field1 >=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThan(String value) {
            addCriterion("field1 <", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThanOrEqualTo(String value) {
            addCriterion("field1 <=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Like(String value) {
            addCriterion("field1 like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotLike(String value) {
            addCriterion("field1 not like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1In(List<String> values) {
            addCriterion("field1 in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotIn(List<String> values) {
            addCriterion("field1 not in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Between(String value1, String value2) {
            addCriterion("field1 between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotBetween(String value1, String value2) {
            addCriterion("field1 not between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField2IsNull() {
            addCriterion("field2 is null");
            return (Criteria) this;
        }

        public Criteria andField2IsNotNull() {
            addCriterion("field2 is not null");
            return (Criteria) this;
        }

        public Criteria andField2EqualTo(String value) {
            addCriterion("field2 =", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotEqualTo(String value) {
            addCriterion("field2 <>", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThan(String value) {
            addCriterion("field2 >", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThanOrEqualTo(String value) {
            addCriterion("field2 >=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThan(String value) {
            addCriterion("field2 <", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThanOrEqualTo(String value) {
            addCriterion("field2 <=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Like(String value) {
            addCriterion("field2 like", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotLike(String value) {
            addCriterion("field2 not like", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2In(List<String> values) {
            addCriterion("field2 in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotIn(List<String> values) {
            addCriterion("field2 not in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Between(String value1, String value2) {
            addCriterion("field2 between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotBetween(String value1, String value2) {
            addCriterion("field2 not between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField3IsNull() {
            addCriterion("field3 is null");
            return (Criteria) this;
        }

        public Criteria andField3IsNotNull() {
            addCriterion("field3 is not null");
            return (Criteria) this;
        }

        public Criteria andField3EqualTo(String value) {
            addCriterion("field3 =", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotEqualTo(String value) {
            addCriterion("field3 <>", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThan(String value) {
            addCriterion("field3 >", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThanOrEqualTo(String value) {
            addCriterion("field3 >=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThan(String value) {
            addCriterion("field3 <", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThanOrEqualTo(String value) {
            addCriterion("field3 <=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Like(String value) {
            addCriterion("field3 like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotLike(String value) {
            addCriterion("field3 not like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3In(List<String> values) {
            addCriterion("field3 in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotIn(List<String> values) {
            addCriterion("field3 not in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Between(String value1, String value2) {
            addCriterion("field3 between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotBetween(String value1, String value2) {
            addCriterion("field3 not between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField4IsNull() {
            addCriterion("field4 is null");
            return (Criteria) this;
        }

        public Criteria andField4IsNotNull() {
            addCriterion("field4 is not null");
            return (Criteria) this;
        }

        public Criteria andField4EqualTo(String value) {
            addCriterion("field4 =", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotEqualTo(String value) {
            addCriterion("field4 <>", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThan(String value) {
            addCriterion("field4 >", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThanOrEqualTo(String value) {
            addCriterion("field4 >=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThan(String value) {
            addCriterion("field4 <", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThanOrEqualTo(String value) {
            addCriterion("field4 <=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Like(String value) {
            addCriterion("field4 like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotLike(String value) {
            addCriterion("field4 not like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4In(List<String> values) {
            addCriterion("field4 in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotIn(List<String> values) {
            addCriterion("field4 not in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Between(String value1, String value2) {
            addCriterion("field4 between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotBetween(String value1, String value2) {
            addCriterion("field4 not between", value1, value2, "field4");
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