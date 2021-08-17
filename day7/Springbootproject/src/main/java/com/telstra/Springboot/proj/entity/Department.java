package com.telstra.Springboot.proj.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long deptId;

    @NotBlank(message = "Please add department name")
    /*@Length(max = 5, min = 1)
    @Size(max = 10,min = 1)
    @Email
    @Positive
    @Negative
    @PositiveOrZero*/
    private String deptName;
    private String deptAdd;
    private String deptCode;

    /*public Department(long deptId, String deptName, String deptAdd, String deptCode) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptAdd = deptAdd;
        this.deptCode = deptCode;
    }



    public Department() {
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptAdd() {
        return deptAdd;
    }

    public void setDeptAdd(String deptAdd) {
        this.deptAdd = deptAdd;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptAdd='" + deptAdd + '\'' +
                ", deptCode='" + deptCode + '\'' +
                '}';
    }*/
}
