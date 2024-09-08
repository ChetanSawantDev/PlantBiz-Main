package com.plantBiz.services.AuthenticationServices;

import com.plantBiz.dto.EmployeeDetails;
import com.plantBiz.services.hr.EmployeeDetailsService;
import org.plantBiz.dto.hr.EmployeeDetailsDto;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
public class UserDetailsServicesImpl  implements UserDetailsService{
    @Autowired
    private EmployeeDetailsService employeeDetailsService;

    private static final Logger logger =(Logger) LoggerFactory.getLogger(UserDetailsServicesImpl.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        logger.info("Entering in loadUserByUsername Method...");
        Optional<EmployeeDetails> user = employeeDetailsService.findByUsername(username);
        if(user.isEmpty()){
            logger.error("Username not found: " + username);
            throw new UsernameNotFoundException("could not found user..!!");
        }
        logger.info("User Authenticated Successfully..!!!");
        return user.orElse(new EmployeeDetails());
    }
}
