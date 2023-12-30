
# LeetCode Challenge D16

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [1539.  Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

Given an array  `arr`  of positive integers sorted in a  *strictly increasing order*, and an integer  `k`.

Return  _the_  `kth`  _*positive*  integer that is  *missing*  from this array._


**Example**

>**Input:** arr = [2,3,4,7,11], k = 5
>**Output:** 9
>**Explanation:** The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview

The approach involves iteratively searching for missing integers, starting from 1 and progressing until the count of missing integers (`count`) reaches the specified value `k`. The algorithm utilizes a binary search with `Arrays.binarySearch` to efficiently check the presence of each integer in the sorted array (If `i` is present in the array, it returns the index of `i`. If `i` is not present, it returns a negative value.). 

Missing integers are recorded in an array (`absentIntegers`), and the final result is obtained by returning the kth missing integer from this array. The time complexity is O(k log n), where `n` is the length of the input array. The solution provides a clear and concise method for determining the kth missing positive integer in a sorted array.
