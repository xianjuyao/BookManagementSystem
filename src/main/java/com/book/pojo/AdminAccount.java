package com.book.pojo;

public class AdminAccount {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_account.admin_name
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    private String adminName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_account.amdin_password
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    private String amdinPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_account.admin_name
     *
     * @return the value of admin_account.admin_name
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_account.admin_name
     *
     * @param adminName the value for admin_account.admin_name
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_account.amdin_password
     *
     * @return the value of admin_account.amdin_password
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public String getAmdinPassword() {
        return amdinPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_account.amdin_password
     *
     * @param amdinPassword the value for admin_account.amdin_password
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public void setAmdinPassword(String amdinPassword) {
        this.amdinPassword = amdinPassword == null ? null : amdinPassword.trim();
    }

    @Override
    public String toString() {
        return "AdminAccount{" +
                "adminName='" + adminName + '\'' +
                ", amdinPassword='" + amdinPassword + '\'' +
                '}';
    }
}