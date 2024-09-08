package com.plantBiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.plantBiz.dto.hr.DepartmentMasterDto;
import org.plantBiz.dto.hr.EmployeeDetailsDto;
import org.springframework.stereotype.Service;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Service
@Data
public class UserInfo {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String userOrgMail;
    private String userPersonalMail;
    private String userPhoneNumber;

    private Date hireDate;
    private String employeeDesignation;

    private DepartmentMasterDto employeeDepartment;

    private EmployeeDetailsDto managerId;
    private double employeeSalary;
    private Date lastDayOfWorking;
    private String reasonForLeavingOrg;
    private Long employeeIdCount;

}
