package com.plantBiz.services.hr;

import com.plantBiz.dto.EmployeeDetails;
import com.plantBiz.remoteServices.HrRemoteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeDetailsService {

    @Autowired
    private final HrRemoteService hrRemoteService;

    public Optional<EmployeeDetails> findByUsername(String username) {
        Optional<EmployeeDetails> employeeDetails = Optional.ofNullable(null);
        try {
           employeeDetails = Optional.of(hrRemoteService.getUserById(username));
           return employeeDetails;
        }catch (Exception e){
            e.printStackTrace();
        }
        return employeeDetails;
    }
}
