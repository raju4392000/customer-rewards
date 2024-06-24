package com.charter.customer.rewards.controller;

import com.charter.customer.rewards.model.CustomerRewards;
import com.charter.customer.rewards.service.CustomerRewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerRewardsController {

    @Autowired
    private CustomerRewardService customerRewardService;

    @GetMapping(value = "/customerRewards")
    public List<CustomerRewards> getRewardsByCustomer(){

        List<CustomerRewards> customerRewardsList = customerRewardService.getCustomerRewards();

        return customerRewardsList;
    }

}
