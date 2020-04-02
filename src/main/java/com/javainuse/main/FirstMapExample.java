package com.javainuse.main;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

public class FirstMapExample {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        Map<String, String> employees = hz.getReplicatedMap("employees");
        employees.put("1", "emp1");
        employees.put("2", "emp2");
        employees.put("3", "emp3");
        employees.put("4", "emp4");
        employees.put("5", "emp5");
        System.out.println("Total number of employees " + employees.size());
    }
}
