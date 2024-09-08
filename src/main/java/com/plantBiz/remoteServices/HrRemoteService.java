package com.plantBiz.remoteServices;

import com.plantBiz.dto.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class HrRemoteService {
    @Value("${hr.service.url}")
    private String remoteUrl;

    @Autowired
    private RestTemplate restTemplate;


    public EmployeeDetails getUserById(String username){
        System.out.println(remoteUrl + "/emplDet/getEmployee");
        String url = UriComponentsBuilder.fromHttpUrl(remoteUrl + "/emplDet/getEmployee")
                    .queryParam("username",username)
                    .toUriString();
        ResponseEntity<EmployeeDetails> data = restTemplate.getForEntity(url, EmployeeDetails.class);
        return data.getBody();
    };

}
