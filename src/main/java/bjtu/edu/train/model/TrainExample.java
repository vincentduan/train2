package bjtu.edu.train.model;

import java.util.ArrayList;
import java.util.List;

public class TrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainExample() {
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_Time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_Time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_Time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_Time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_Time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_Time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_Time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_Time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_Time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_Time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_Time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_Time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_Time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_Time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andActualLengthIsNull() {
            addCriterion("actual_Length is null");
            return (Criteria) this;
        }

        public Criteria andActualLengthIsNotNull() {
            addCriterion("actual_Length is not null");
            return (Criteria) this;
        }

        public Criteria andActualLengthEqualTo(String value) {
            addCriterion("actual_Length =", value, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthNotEqualTo(String value) {
            addCriterion("actual_Length <>", value, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthGreaterThan(String value) {
            addCriterion("actual_Length >", value, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthGreaterThanOrEqualTo(String value) {
            addCriterion("actual_Length >=", value, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthLessThan(String value) {
            addCriterion("actual_Length <", value, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthLessThanOrEqualTo(String value) {
            addCriterion("actual_Length <=", value, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthLike(String value) {
            addCriterion("actual_Length like", value, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthNotLike(String value) {
            addCriterion("actual_Length not like", value, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthIn(List<String> values) {
            addCriterion("actual_Length in", values, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthNotIn(List<String> values) {
            addCriterion("actual_Length not in", values, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthBetween(String value1, String value2) {
            addCriterion("actual_Length between", value1, value2, "actualLength");
            return (Criteria) this;
        }

        public Criteria andActualLengthNotBetween(String value1, String value2) {
            addCriterion("actual_Length not between", value1, value2, "actualLength");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_Time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_Time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_Time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_Time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_Time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_Time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_Time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_Time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_Time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_Time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_Time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_Time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_Time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeIsNull() {
            addCriterion("runing_Time is null");
            return (Criteria) this;
        }

        public Criteria andRuningTimeIsNotNull() {
            addCriterion("runing_Time is not null");
            return (Criteria) this;
        }

        public Criteria andRuningTimeEqualTo(String value) {
            addCriterion("runing_Time =", value, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeNotEqualTo(String value) {
            addCriterion("runing_Time <>", value, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeGreaterThan(String value) {
            addCriterion("runing_Time >", value, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeGreaterThanOrEqualTo(String value) {
            addCriterion("runing_Time >=", value, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeLessThan(String value) {
            addCriterion("runing_Time <", value, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeLessThanOrEqualTo(String value) {
            addCriterion("runing_Time <=", value, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeLike(String value) {
            addCriterion("runing_Time like", value, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeNotLike(String value) {
            addCriterion("runing_Time not like", value, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeIn(List<String> values) {
            addCriterion("runing_Time in", values, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeNotIn(List<String> values) {
            addCriterion("runing_Time not in", values, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeBetween(String value1, String value2) {
            addCriterion("runing_Time between", value1, value2, "runingTime");
            return (Criteria) this;
        }

        public Criteria andRuningTimeNotBetween(String value1, String value2) {
            addCriterion("runing_Time not between", value1, value2, "runingTime");
            return (Criteria) this;
        }

        public Criteria andLoadFactorIsNull() {
            addCriterion("load_Factor is null");
            return (Criteria) this;
        }

        public Criteria andLoadFactorIsNotNull() {
            addCriterion("load_Factor is not null");
            return (Criteria) this;
        }

        public Criteria andLoadFactorEqualTo(String value) {
            addCriterion("load_Factor =", value, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorNotEqualTo(String value) {
            addCriterion("load_Factor <>", value, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorGreaterThan(String value) {
            addCriterion("load_Factor >", value, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorGreaterThanOrEqualTo(String value) {
            addCriterion("load_Factor >=", value, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorLessThan(String value) {
            addCriterion("load_Factor <", value, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorLessThanOrEqualTo(String value) {
            addCriterion("load_Factor <=", value, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorLike(String value) {
            addCriterion("load_Factor like", value, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorNotLike(String value) {
            addCriterion("load_Factor not like", value, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorIn(List<String> values) {
            addCriterion("load_Factor in", values, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorNotIn(List<String> values) {
            addCriterion("load_Factor not in", values, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorBetween(String value1, String value2) {
            addCriterion("load_Factor between", value1, value2, "loadFactor");
            return (Criteria) this;
        }

        public Criteria andLoadFactorNotBetween(String value1, String value2) {
            addCriterion("load_Factor not between", value1, value2, "loadFactor");
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

        public Criteria andMaxAccelerationIsNull() {
            addCriterion("max_Acceleration is null");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationIsNotNull() {
            addCriterion("max_Acceleration is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationEqualTo(Double value) {
            addCriterion("max_Acceleration =", value, "maxAcceleration");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationNotEqualTo(Double value) {
            addCriterion("max_Acceleration <>", value, "maxAcceleration");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationGreaterThan(Double value) {
            addCriterion("max_Acceleration >", value, "maxAcceleration");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationGreaterThanOrEqualTo(Double value) {
            addCriterion("max_Acceleration >=", value, "maxAcceleration");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationLessThan(Double value) {
            addCriterion("max_Acceleration <", value, "maxAcceleration");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationLessThanOrEqualTo(Double value) {
            addCriterion("max_Acceleration <=", value, "maxAcceleration");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationIn(List<Double> values) {
            addCriterion("max_Acceleration in", values, "maxAcceleration");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationNotIn(List<Double> values) {
            addCriterion("max_Acceleration not in", values, "maxAcceleration");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationBetween(Double value1, Double value2) {
            addCriterion("max_Acceleration between", value1, value2, "maxAcceleration");
            return (Criteria) this;
        }

        public Criteria andMaxAccelerationNotBetween(Double value1, Double value2) {
            addCriterion("max_Acceleration not between", value1, value2, "maxAcceleration");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationIsNull() {
            addCriterion("minus_Acceleration is null");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationIsNotNull() {
            addCriterion("minus_Acceleration is not null");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationEqualTo(Double value) {
            addCriterion("minus_Acceleration =", value, "minusAcceleration");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationNotEqualTo(Double value) {
            addCriterion("minus_Acceleration <>", value, "minusAcceleration");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationGreaterThan(Double value) {
            addCriterion("minus_Acceleration >", value, "minusAcceleration");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationGreaterThanOrEqualTo(Double value) {
            addCriterion("minus_Acceleration >=", value, "minusAcceleration");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationLessThan(Double value) {
            addCriterion("minus_Acceleration <", value, "minusAcceleration");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationLessThanOrEqualTo(Double value) {
            addCriterion("minus_Acceleration <=", value, "minusAcceleration");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationIn(List<Double> values) {
            addCriterion("minus_Acceleration in", values, "minusAcceleration");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationNotIn(List<Double> values) {
            addCriterion("minus_Acceleration not in", values, "minusAcceleration");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationBetween(Double value1, Double value2) {
            addCriterion("minus_Acceleration between", value1, value2, "minusAcceleration");
            return (Criteria) this;
        }

        public Criteria andMinusAccelerationNotBetween(Double value1, Double value2) {
            addCriterion("minus_Acceleration not between", value1, value2, "minusAcceleration");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateIsNull() {
            addCriterion("maxAcceleration_Rate is null");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateIsNotNull() {
            addCriterion("maxAcceleration_Rate is not null");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateEqualTo(Double value) {
            addCriterion("maxAcceleration_Rate =", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateNotEqualTo(Double value) {
            addCriterion("maxAcceleration_Rate <>", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateGreaterThan(Double value) {
            addCriterion("maxAcceleration_Rate >", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateGreaterThanOrEqualTo(Double value) {
            addCriterion("maxAcceleration_Rate >=", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateLessThan(Double value) {
            addCriterion("maxAcceleration_Rate <", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateLessThanOrEqualTo(Double value) {
            addCriterion("maxAcceleration_Rate <=", value, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateIn(List<Double> values) {
            addCriterion("maxAcceleration_Rate in", values, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateNotIn(List<Double> values) {
            addCriterion("maxAcceleration_Rate not in", values, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateBetween(Double value1, Double value2) {
            addCriterion("maxAcceleration_Rate between", value1, value2, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMaxaccelerationRateNotBetween(Double value1, Double value2) {
            addCriterion("maxAcceleration_Rate not between", value1, value2, "maxaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateIsNull() {
            addCriterion("minusAcceleration_Rate is null");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateIsNotNull() {
            addCriterion("minusAcceleration_Rate is not null");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateEqualTo(Double value) {
            addCriterion("minusAcceleration_Rate =", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateNotEqualTo(Double value) {
            addCriterion("minusAcceleration_Rate <>", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateGreaterThan(Double value) {
            addCriterion("minusAcceleration_Rate >", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateGreaterThanOrEqualTo(Double value) {
            addCriterion("minusAcceleration_Rate >=", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateLessThan(Double value) {
            addCriterion("minusAcceleration_Rate <", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateLessThanOrEqualTo(Double value) {
            addCriterion("minusAcceleration_Rate <=", value, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateIn(List<Double> values) {
            addCriterion("minusAcceleration_Rate in", values, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateNotIn(List<Double> values) {
            addCriterion("minusAcceleration_Rate not in", values, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateBetween(Double value1, Double value2) {
            addCriterion("minusAcceleration_Rate between", value1, value2, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andMinusaccelerationRateNotBetween(Double value1, Double value2) {
            addCriterion("minusAcceleration_Rate not between", value1, value2, "minusaccelerationRate");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionIsNull() {
            addCriterion("station_Precision is null");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionIsNotNull() {
            addCriterion("station_Precision is not null");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionEqualTo(Double value) {
            addCriterion("station_Precision =", value, "stationPrecision");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionNotEqualTo(Double value) {
            addCriterion("station_Precision <>", value, "stationPrecision");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionGreaterThan(Double value) {
            addCriterion("station_Precision >", value, "stationPrecision");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionGreaterThanOrEqualTo(Double value) {
            addCriterion("station_Precision >=", value, "stationPrecision");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionLessThan(Double value) {
            addCriterion("station_Precision <", value, "stationPrecision");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionLessThanOrEqualTo(Double value) {
            addCriterion("station_Precision <=", value, "stationPrecision");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionIn(List<Double> values) {
            addCriterion("station_Precision in", values, "stationPrecision");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionNotIn(List<Double> values) {
            addCriterion("station_Precision not in", values, "stationPrecision");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionBetween(Double value1, Double value2) {
            addCriterion("station_Precision between", value1, value2, "stationPrecision");
            return (Criteria) this;
        }

        public Criteria andStationPrecisionNotBetween(Double value1, Double value2) {
            addCriterion("station_Precision not between", value1, value2, "stationPrecision");
            return (Criteria) this;
        }

        public Criteria andEbiNumIsNull() {
            addCriterion("EBI_Num is null");
            return (Criteria) this;
        }

        public Criteria andEbiNumIsNotNull() {
            addCriterion("EBI_Num is not null");
            return (Criteria) this;
        }

        public Criteria andEbiNumEqualTo(Integer value) {
            addCriterion("EBI_Num =", value, "ebiNum");
            return (Criteria) this;
        }

        public Criteria andEbiNumNotEqualTo(Integer value) {
            addCriterion("EBI_Num <>", value, "ebiNum");
            return (Criteria) this;
        }

        public Criteria andEbiNumGreaterThan(Integer value) {
            addCriterion("EBI_Num >", value, "ebiNum");
            return (Criteria) this;
        }

        public Criteria andEbiNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("EBI_Num >=", value, "ebiNum");
            return (Criteria) this;
        }

        public Criteria andEbiNumLessThan(Integer value) {
            addCriterion("EBI_Num <", value, "ebiNum");
            return (Criteria) this;
        }

        public Criteria andEbiNumLessThanOrEqualTo(Integer value) {
            addCriterion("EBI_Num <=", value, "ebiNum");
            return (Criteria) this;
        }

        public Criteria andEbiNumIn(List<Integer> values) {
            addCriterion("EBI_Num in", values, "ebiNum");
            return (Criteria) this;
        }

        public Criteria andEbiNumNotIn(List<Integer> values) {
            addCriterion("EBI_Num not in", values, "ebiNum");
            return (Criteria) this;
        }

        public Criteria andEbiNumBetween(Integer value1, Integer value2) {
            addCriterion("EBI_Num between", value1, value2, "ebiNum");
            return (Criteria) this;
        }

        public Criteria andEbiNumNotBetween(Integer value1, Integer value2) {
            addCriterion("EBI_Num not between", value1, value2, "ebiNum");
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