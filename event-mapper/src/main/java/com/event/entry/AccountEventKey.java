package com.event.entry;

public class AccountEventKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column er_account_event.account_no
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    private String accountNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column er_account_event.account_event_id
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    private String accountEventId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column er_account_event.account_no
     *
     * @return the value of er_account_event.account_no
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column er_account_event.account_no
     *
     * @param accountNo the value for er_account_event.account_no
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column er_account_event.account_event_id
     *
     * @return the value of er_account_event.account_event_id
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    public String getAccountEventId() {
        return accountEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column er_account_event.account_event_id
     *
     * @param accountEventId the value for er_account_event.account_event_id
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    public void setAccountEventId(String accountEventId) {
        this.accountEventId = accountEventId == null ? null : accountEventId.trim();
    }
}