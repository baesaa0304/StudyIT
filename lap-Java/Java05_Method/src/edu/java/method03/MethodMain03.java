package edu.java.method03;

import java.lang.reflect.Array;
import java.util.Random;

public class MethodMain03 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println(sum(array));
		System.out.println(mean(array));
		System.out.println(max(array));
		System.out.println(min(array));
		
		
		


	}
	
	
	
	/**
     * sum
     * 정수 배열의 모든 원소들의 합을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 합.
     */
    // TODO
	public static int sum(int[]arr) {
		int sum1 = 0;
		for(int number : arr) {
			sum1+=number;
		}
		return sum1;
		}
		
    
    /**
     * mean
     * 정수 배열의 모든 원소들의 평균을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 평균.
     */
    // TODO
	public static double mean(int[]arr) {
		int sum1 = 0;
		int count = 0;
		double average = 0;
		for(int number : arr) {
			sum1+=number;
			count ++;
		}
		 	average = (double)sum1 / count;
		
		return average;
	}
    
    /**
     * max
     * 정수 배열에서 최댓값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값.
     */
    // TODO
    public static int max(int[]arr) {
    	int max1 = arr[0];
    	for (int x : arr) {
    		max1 = (x > max1) ? x : max1;
    	}
    	return max1;
    }
    /**
     * maxAt
     * 정수 배열에서 최댓값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값의 인덱스.
     * 최댓값이 여러개 있는 경우, 첫번째 최댓값의 인덱스.
     */
    // TODO
    

    /**
     * min
     * 정수 배열에서 최솟값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값.
     */
    // TODO
    public static int min(int[]arr) {
    	int min1 = arr[0];
    	for (int x : arr) {
    		min1 = (x < min1) ? x :min1;
    	}
    	return min1;
    }
    
    /**
     * minAt
     * 정수 배열에서 최솟값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값의 인덱스.
     * 최솟값이 여러개 있는 경우, 첫번째 최솟값의 인덱스.
     */
    // TODO

}
