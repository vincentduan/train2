package bjtu.edu.train.model;

import java.util.ArrayList;
import java.util.List;

public class TrainDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainDataExample() {
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

        public Criteria andFileNameIsNull() {
            addCriterion("file_Name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_Name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_Name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_Name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_Name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_Name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_Name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_Name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_Name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_Name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_Name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_Name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_Name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andStartStationIsNull() {
            addCriterion("start_Station is null");
            return (Criteria) this;
        }

        public Criteria andStartStationIsNotNull() {
            addCriterion("start_Station is not null");
            return (Criteria) this;
        }

        public Criteria andStartStationEqualTo(String value) {
            addCriterion("start_Station =", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationNotEqualTo(String value) {
            addCriterion("start_Station <>", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationGreaterThan(String value) {
            addCriterion("start_Station >", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationGreaterThanOrEqualTo(String value) {
            addCriterion("start_Station >=", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationLessThan(String value) {
            addCriterion("start_Station <", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationLessThanOrEqualTo(String value) {
            addCriterion("start_Station <=", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationLike(String value) {
            addCriterion("start_Station like", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationNotLike(String value) {
            addCriterion("start_Station not like", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationIn(List<String> values) {
            addCriterion("start_Station in", values, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationNotIn(List<String> values) {
            addCriterion("start_Station not in", values, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationBetween(String value1, String value2) {
            addCriterion("start_Station between", value1, value2, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationNotBetween(String value1, String value2) {
            addCriterion("start_Station not between", value1, value2, "startStation");
            return (Criteria) this;
        }

        public Criteria andEndStationIsNull() {
            addCriterion("end_Station is null");
            return (Criteria) this;
        }

        public Criteria andEndStationIsNotNull() {
            addCriterion("end_Station is not null");
            return (Criteria) this;
        }

        public Criteria andEndStationEqualTo(String value) {
            addCriterion("end_Station =", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotEqualTo(String value) {
            addCriterion("end_Station <>", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationGreaterThan(String value) {
            addCriterion("end_Station >", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationGreaterThanOrEqualTo(String value) {
            addCriterion("end_Station >=", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationLessThan(String value) {
            addCriterion("end_Station <", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationLessThanOrEqualTo(String value) {
            addCriterion("end_Station <=", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationLike(String value) {
            addCriterion("end_Station like", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotLike(String value) {
            addCriterion("end_Station not like", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationIn(List<String> values) {
            addCriterion("end_Station in", values, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotIn(List<String> values) {
            addCriterion("end_Station not in", values, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationBetween(String value1, String value2) {
            addCriterion("end_Station between", value1, value2, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotBetween(String value1, String value2) {
            addCriterion("end_Station not between", value1, value2, "endStation");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("speed is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("speed is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(Double value) {
            addCriterion("speed =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(Double value) {
            addCriterion("speed <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(Double value) {
            addCriterion("speed >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("speed >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(Double value) {
            addCriterion("speed <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(Double value) {
            addCriterion("speed <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<Double> values) {
            addCriterion("speed in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<Double> values) {
            addCriterion("speed not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(Double value1, Double value2) {
            addCriterion("speed between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(Double value1, Double value2) {
            addCriterion("speed not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSlopeIsNull() {
            addCriterion("slope is null");
            return (Criteria) this;
        }

        public Criteria andSlopeIsNotNull() {
            addCriterion("slope is not null");
            return (Criteria) this;
        }

        public Criteria andSlopeEqualTo(Double value) {
            addCriterion("slope =", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeNotEqualTo(Double value) {
            addCriterion("slope <>", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeGreaterThan(Double value) {
            addCriterion("slope >", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeGreaterThanOrEqualTo(Double value) {
            addCriterion("slope >=", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeLessThan(Double value) {
            addCriterion("slope <", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeLessThanOrEqualTo(Double value) {
            addCriterion("slope <=", value, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeIn(List<Double> values) {
            addCriterion("slope in", values, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeNotIn(List<Double> values) {
            addCriterion("slope not in", values, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeBetween(Double value1, Double value2) {
            addCriterion("slope between", value1, value2, "slope");
            return (Criteria) this;
        }

        public Criteria andSlopeNotBetween(Double value1, Double value2) {
            addCriterion("slope not between", value1, value2, "slope");
            return (Criteria) this;
        }

        public Criteria andTractionIsNull() {
            addCriterion("traction is null");
            return (Criteria) this;
        }

        public Criteria andTractionIsNotNull() {
            addCriterion("traction is not null");
            return (Criteria) this;
        }

        public Criteria andTractionEqualTo(Double value) {
            addCriterion("traction =", value, "traction");
            return (Criteria) this;
        }

        public Criteria andTractionNotEqualTo(Double value) {
            addCriterion("traction <>", value, "traction");
            return (Criteria) this;
        }

        public Criteria andTractionGreaterThan(Double value) {
            addCriterion("traction >", value, "traction");
            return (Criteria) this;
        }

        public Criteria andTractionGreaterThanOrEqualTo(Double value) {
            addCriterion("traction >=", value, "traction");
            return (Criteria) this;
        }

        public Criteria andTractionLessThan(Double value) {
            addCriterion("traction <", value, "traction");
            return (Criteria) this;
        }

        public Criteria andTractionLessThanOrEqualTo(Double value) {
            addCriterion("traction <=", value, "traction");
            return (Criteria) this;
        }

        public Criteria andTractionIn(List<Double> values) {
            addCriterion("traction in", values, "traction");
            return (Criteria) this;
        }

        public Criteria andTractionNotIn(List<Double> values) {
            addCriterion("traction not in", values, "traction");
            return (Criteria) this;
        }

        public Criteria andTractionBetween(Double value1, Double value2) {
            addCriterion("traction between", value1, value2, "traction");
            return (Criteria) this;
        }

        public Criteria andTractionNotBetween(Double value1, Double value2) {
            addCriterion("traction not between", value1, value2, "traction");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(Double value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(Double value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(Double value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(Double value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(Double value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(Double value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<Double> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<Double> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(Double value1, Double value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(Double value1, Double value2) {
            addCriterion("power not between", value1, value2, "power");
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

        public Criteria andEbiIsNull() {
            addCriterion("EBI is null");
            return (Criteria) this;
        }

        public Criteria andEbiIsNotNull() {
            addCriterion("EBI is not null");
            return (Criteria) this;
        }

        public Criteria andEbiEqualTo(Double value) {
            addCriterion("EBI =", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiNotEqualTo(Double value) {
            addCriterion("EBI <>", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiGreaterThan(Double value) {
            addCriterion("EBI >", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiGreaterThanOrEqualTo(Double value) {
            addCriterion("EBI >=", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiLessThan(Double value) {
            addCriterion("EBI <", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiLessThanOrEqualTo(Double value) {
            addCriterion("EBI <=", value, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiIn(List<Double> values) {
            addCriterion("EBI in", values, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiNotIn(List<Double> values) {
            addCriterion("EBI not in", values, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiBetween(Double value1, Double value2) {
            addCriterion("EBI between", value1, value2, "ebi");
            return (Criteria) this;
        }

        public Criteria andEbiNotBetween(Double value1, Double value2) {
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