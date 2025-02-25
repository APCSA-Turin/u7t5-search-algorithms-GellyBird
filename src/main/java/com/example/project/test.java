package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.project.Binary_Search.BinarySearch;
import com.example.project.Linear_Search.Search;

public class test {
    public static void main(String[] args) {
    int[] singleElementArray = {10};
    ArrayList<Integer> singleElementList = new ArrayList<>(Arrays.asList(10));
    System.out.println(Search.linearSearchLast(singleElementList,10));
    }
}