package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andTrCustomerAcountIdIsNull() {
            addCriterion("tr_customer_acount_id is null");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdIsNotNull() {
            addCriterion("tr_customer_acount_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdEqualTo(Long value) {
            addCriterion("tr_customer_acount_id =", value, "trCustomerAcountId");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdNotEqualTo(Long value) {
            addCriterion("tr_customer_acount_id <>", value, "trCustomerAcountId");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdGreaterThan(Long value) {
            addCriterion("tr_customer_acount_id >", value, "trCustomerAcountId");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tr_customer_acount_id >=", value, "trCustomerAcountId");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdLessThan(Long value) {
            addCriterion("tr_customer_acount_id <", value, "trCustomerAcountId");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdLessThanOrEqualTo(Long value) {
            addCriterion("tr_customer_acount_id <=", value, "trCustomerAcountId");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdIn(List<Long> values) {
            addCriterion("tr_customer_acount_id in", values, "trCustomerAcountId");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdNotIn(List<Long> values) {
            addCriterion("tr_customer_acount_id not in", values, "trCustomerAcountId");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdBetween(Long value1, Long value2) {
            addCriterion("tr_customer_acount_id between", value1, value2, "trCustomerAcountId");
            return (Criteria) this;
        }

        public Criteria andTrCustomerAcountIdNotBetween(Long value1, Long value2) {
            addCriterion("tr_customer_acount_id not between", value1, value2, "trCustomerAcountId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdIsNull() {
            addCriterion("cu_customer_info_id is null");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdIsNotNull() {
            addCriterion("cu_customer_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdEqualTo(Long value) {
            addCriterion("cu_customer_info_id =", value, "cuCustomerInfoId");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdNotEqualTo(Long value) {
            addCriterion("cu_customer_info_id <>", value, "cuCustomerInfoId");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdGreaterThan(Long value) {
            addCriterion("cu_customer_info_id >", value, "cuCustomerInfoId");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cu_customer_info_id >=", value, "cuCustomerInfoId");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdLessThan(Long value) {
            addCriterion("cu_customer_info_id <", value, "cuCustomerInfoId");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("cu_customer_info_id <=", value, "cuCustomerInfoId");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdIn(List<Long> values) {
            addCriterion("cu_customer_info_id in", values, "cuCustomerInfoId");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdNotIn(List<Long> values) {
            addCriterion("cu_customer_info_id not in", values, "cuCustomerInfoId");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdBetween(Long value1, Long value2) {
            addCriterion("cu_customer_info_id between", value1, value2, "cuCustomerInfoId");
            return (Criteria) this;
        }

        public Criteria andCuCustomerInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("cu_customer_info_id not between", value1, value2, "cuCustomerInfoId");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountIsNull() {
            addCriterion("availble_amount is null");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountIsNotNull() {
            addCriterion("availble_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountEqualTo(BigDecimal value) {
            addCriterion("availble_amount =", value, "availbleAmount");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountNotEqualTo(BigDecimal value) {
            addCriterion("availble_amount <>", value, "availbleAmount");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountGreaterThan(BigDecimal value) {
            addCriterion("availble_amount >", value, "availbleAmount");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("availble_amount >=", value, "availbleAmount");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountLessThan(BigDecimal value) {
            addCriterion("availble_amount <", value, "availbleAmount");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("availble_amount <=", value, "availbleAmount");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountIn(List<BigDecimal> values) {
            addCriterion("availble_amount in", values, "availbleAmount");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountNotIn(List<BigDecimal> values) {
            addCriterion("availble_amount not in", values, "availbleAmount");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("availble_amount between", value1, value2, "availbleAmount");
            return (Criteria) this;
        }

        public Criteria andAvailbleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("availble_amount not between", value1, value2, "availbleAmount");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountIsNull() {
            addCriterion("freeze_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountIsNotNull() {
            addCriterion("freeze_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountEqualTo(BigDecimal value) {
            addCriterion("freeze_amount =", value, "freezeAmount");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountNotEqualTo(BigDecimal value) {
            addCriterion("freeze_amount <>", value, "freezeAmount");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountGreaterThan(BigDecimal value) {
            addCriterion("freeze_amount >", value, "freezeAmount");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freeze_amount >=", value, "freezeAmount");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountLessThan(BigDecimal value) {
            addCriterion("freeze_amount <", value, "freezeAmount");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freeze_amount <=", value, "freezeAmount");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountIn(List<BigDecimal> values) {
            addCriterion("freeze_amount in", values, "freezeAmount");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountNotIn(List<BigDecimal> values) {
            addCriterion("freeze_amount not in", values, "freezeAmount");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freeze_amount between", value1, value2, "freezeAmount");
            return (Criteria) this;
        }

        public Criteria andFreezeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freeze_amount not between", value1, value2, "freezeAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeIsNull() {
            addCriterion("payment_account_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeIsNotNull() {
            addCriterion("payment_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeEqualTo(Integer value) {
            addCriterion("payment_account_type =", value, "paymentAccountType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeNotEqualTo(Integer value) {
            addCriterion("payment_account_type <>", value, "paymentAccountType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeGreaterThan(Integer value) {
            addCriterion("payment_account_type >", value, "paymentAccountType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_account_type >=", value, "paymentAccountType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeLessThan(Integer value) {
            addCriterion("payment_account_type <", value, "paymentAccountType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_account_type <=", value, "paymentAccountType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeIn(List<Integer> values) {
            addCriterion("payment_account_type in", values, "paymentAccountType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeNotIn(List<Integer> values) {
            addCriterion("payment_account_type not in", values, "paymentAccountType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_account_type between", value1, value2, "paymentAccountType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_account_type not between", value1, value2, "paymentAccountType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoIsNull() {
            addCriterion("payment_account_no is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoIsNotNull() {
            addCriterion("payment_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoEqualTo(String value) {
            addCriterion("payment_account_no =", value, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoNotEqualTo(String value) {
            addCriterion("payment_account_no <>", value, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoGreaterThan(String value) {
            addCriterion("payment_account_no >", value, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("payment_account_no >=", value, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoLessThan(String value) {
            addCriterion("payment_account_no <", value, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoLessThanOrEqualTo(String value) {
            addCriterion("payment_account_no <=", value, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoLike(String value) {
            addCriterion("payment_account_no like", value, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoNotLike(String value) {
            addCriterion("payment_account_no not like", value, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoIn(List<String> values) {
            addCriterion("payment_account_no in", values, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoNotIn(List<String> values) {
            addCriterion("payment_account_no not in", values, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoBetween(String value1, String value2) {
            addCriterion("payment_account_no between", value1, value2, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNoNotBetween(String value1, String value2) {
            addCriterion("payment_account_no not between", value1, value2, "paymentAccountNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNull() {
            addCriterion("version_no is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("version_no is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(Integer value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Integer value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Integer value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Integer value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Integer value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<Integer> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<Integer> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(Integer value1, Integer value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
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

        public Criteria andAutoFlagIsNull() {
            addCriterion("auto_flag is null");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIsNotNull() {
            addCriterion("auto_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAutoFlagEqualTo(String value) {
            addCriterion("auto_flag =", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotEqualTo(String value) {
            addCriterion("auto_flag <>", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagGreaterThan(String value) {
            addCriterion("auto_flag >", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagGreaterThanOrEqualTo(String value) {
            addCriterion("auto_flag >=", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagLessThan(String value) {
            addCriterion("auto_flag <", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagLessThanOrEqualTo(String value) {
            addCriterion("auto_flag <=", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagLike(String value) {
            addCriterion("auto_flag like", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotLike(String value) {
            addCriterion("auto_flag not like", value, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagIn(List<String> values) {
            addCriterion("auto_flag in", values, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotIn(List<String> values) {
            addCriterion("auto_flag not in", values, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagBetween(String value1, String value2) {
            addCriterion("auto_flag between", value1, value2, "autoFlag");
            return (Criteria) this;
        }

        public Criteria andAutoFlagNotBetween(String value1, String value2) {
            addCriterion("auto_flag not between", value1, value2, "autoFlag");
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