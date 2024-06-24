package com.charter.customer.rewards.service;

import com.charter.customer.rewards.entity.CustomerTransaction;
import com.charter.customer.rewards.model.CustomerRewards;
import com.charter.customer.rewards.utils.CustomerRewardsUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;

@Service
public class CustomerRewardService {


    public List<CustomerRewards> getCustomerRewards() {

        List<CustomerTransaction>  customerTransactions = CustomerRewardsUtil.getCustomerTransactions();

        Map<String, CustomerTransaction> custTransactions =
                customerTransactions.stream()
                        .collect(groupingBy(trans -> trans.customerName, collectingAndThen(calcRewardPoints(trans.amount))
                        ));
        return CustomerRewardsUtil.getCustomerRewards();
    }

    public int calcRewardPoints(int amount) {
        int rewardPoints = 0;
        if (amount > 50 && amount <100) {
            rewardPoints = (amount - 50);
        }else if(amount > 100){
            rewardPoints = 2*(amount - 100);
        }
        return rewardPoints;
    }
}
