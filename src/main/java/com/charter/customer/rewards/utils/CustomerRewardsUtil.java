package com.charter.customer.rewards.utils;

import com.charter.customer.rewards.entity.CustomerTransaction;
import com.charter.customer.rewards.model.CustomerRewards;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CustomerRewardsUtil {

    public static List<CustomerTransaction> getCustomerTransactions() {

        List<CustomerTransaction> customerTransactions= new ArrayList<CustomerTransaction>();
        customerTransactions.add(new CustomerTransaction(123,1,"John",55.00, Timestamp.valueOf("2024-06-20 09:01:15")));
        customerTransactions.add(new CustomerTransaction(124,1,"John",110.00, Timestamp.valueOf("2024-06-20 09:01:15")));

        customerTransactions.add(new CustomerTransaction(125,1,"John",56.00, Timestamp.valueOf("2024-05-20 09:01:15")));
        customerTransactions.add(new CustomerTransaction(126,1,"John",111.00, Timestamp.valueOf("2024-05-20 09:01:15")));

        customerTransactions.add(new CustomerTransaction(127,1,"John",57.00, Timestamp.valueOf("2024-04-20 09:01:15")));
        customerTransactions.add(new CustomerTransaction(128,1,"John",112.00, Timestamp.valueOf("2024-04-20 09:01:15")));


        customerTransactions.add(new CustomerTransaction(129,2,"Mark",58.00, Timestamp.valueOf("2024-06-20 09:01:15")));
        customerTransactions.add(new CustomerTransaction(130,2,"Mark",113.00, Timestamp.valueOf("2024-06-20 09:01:15")));

        customerTransactions.add(new CustomerTransaction(131,2,"Mark",59.00, Timestamp.valueOf("2024-05-20 09:01:15")));
        customerTransactions.add(new CustomerTransaction(132,2,"Mark",114.00, Timestamp.valueOf("2024-05-20 09:01:15")));

        customerTransactions.add(new CustomerTransaction(133,2,"Mark",60.00, Timestamp.valueOf("2024-04-20 09:01:15")));
        customerTransactions.add(new CustomerTransaction(134,2,"Mark",115.00, Timestamp.valueOf("2024-04-20 09:01:15")));


        customerTransactions.add(new CustomerTransaction(135,3,"David",61.00, Timestamp.valueOf("2024-06-20 09:01:15")));
        customerTransactions.add(new CustomerTransaction(136,3,"David",116.00, Timestamp.valueOf("2024-06-20 09:01:15")));

        customerTransactions.add(new CustomerTransaction(137,3,"David",62.00, Timestamp.valueOf("2024-05-20 09:01:15")));
        customerTransactions.add(new CustomerTransaction(138,3,"David",117.00, Timestamp.valueOf("2024-05-20 09:01:15")));

        customerTransactions.add(new CustomerTransaction(139,3,"David",63.00, Timestamp.valueOf("2024-04-20 09:01:15")));
        customerTransactions.add(new CustomerTransaction(140,3,"David",118.00, Timestamp.valueOf("2024-04-20 09:01:15")));

        return customerTransactions;
    }

    public static List<CustomerRewards> getCustomerRewards() {
        CustomerRewards customerRewards = new CustomerRewards(1, "John", 10, 20, 30,60);
        CustomerRewards  customerRewards1 = new CustomerRewards(2, "Mark", 40, 50, 60,150);

        List<CustomerRewards> customerRewardsList = new ArrayList<CustomerRewards>();
        customerRewardsList.add(customerRewards);
        customerRewardsList.add(customerRewards1);
        return customerRewardsList;
    }


}
