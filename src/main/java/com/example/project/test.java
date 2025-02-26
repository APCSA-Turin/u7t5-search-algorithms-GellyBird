package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.project.Binary_Search.BinarySearch;
import com.example.project.Linear_Search.Search;
import com.example.project.Repair.RepairSchedule;

public class test {
    public static void main(String[] args) {
        RepairSchedule schedule = new RepairSchedule(3); 

        // all mechanics free
        // ArrayList<Integer> availableMechanics = schedule.availableMechanics();
        System.out.println(schedule.availableMechanics());
    }
}