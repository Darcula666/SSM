package com.gfdz.bean;

public class Department {
    private Integer deptId;

    private String deptName;

    private String deptDepict;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptDepict() {
        return deptDepict;
    }

    public void setDeptDepict(String deptDepict) {
        this.deptDepict = deptDepict == null ? null : deptDepict.trim();
    }
}