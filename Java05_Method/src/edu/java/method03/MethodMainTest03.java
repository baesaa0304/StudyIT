package edu.java.method03;

import java.util.Random;

public class MethodMainTest03 {

	public static void main(String[] args) {
		int [] array =MakeTestData(5);
		printTestArray(array);

//		Random random = new Random();
//		// 메서드 기능 테스트 위한 배열 만들기
//		int[]array =new int[10];
//		for (int i =0; i < array.length; i++) {
//			array[i] = random.nextInt(10);
//		}
		
//		int[]array = MakeTestData(10);
//		// 테스트 데이터 출력하기
		int total = sum(array);
		System.out.println("sum = " + total);
		
		double average =mean(array);
		System.out.println("mean = " + average);
		
		int max1 =max(array);
		System.out.println("max = " + max1);
		
		int maxIndex = maxAT(array);
		System.out.println("maxIndex = " + maxIndex);
		
		int min1 = min(array);
		System.out.println("min = " + min1);

		int minIndex = minAT(array);
		System.out.println("minIndex = " + minIndex);

	}
	
	
	
	public static void printTestArray(int[] array) {
		System.out.print("[ ");
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println("]");
		
		// void 타입의 메서드에서는 return; 문을 생략해도 됨.
		return;
	}
	/**
	 * 메서드 만들기
	 */
	 // TODO
	 public static int[] MakeTestData(int n) {
		 int[]array = new int[n];
		 
		 Random random = new Random();
		 for (int i = 0; i < array.length; i++) {
				array[i] = random.nextInt(10);
			} 
		 	return array;
	 }
	
	
	
	
	/**
     * sum
     * 정수 배열의 모든 원소들의 합을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 합.
     */
    // TODO
	public static int sum(int[] arr) {
		int total = 0;
		for(int x : arr) {
			total +=x;
		}
		
		return total;
	}
    
    /**
     * mean
     * 정수 배열의 모든 원소들의 평균을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 평균(double).
     */
    // TODO
	public static double mean(int[] arr) {
		// 평균 = 합계 / 개수;
		return (double) sum(arr) / arr.length;
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
     * maxAt (최대값이 있는 위치)
     * 정수 배열에서 최댓값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값의 인덱스.
     * 최댓값이 여러개 있는 경우, 첫번째 최댓값의 인덱스.
     */
    // TODO
	 public static int maxAT(int[] arr) {
		 int max = arr[0]; // 배열의 최댓값을 저장할 변수.
		 int index = 0; // 베열의 최댓값의 인덱스를 저장할 변수.
		 for(int i = 0; i < arr.length; i++) {// 배열의 원소들을 순서대로 반복하면서
			 if(arr[i] > max) { // 배열에서 읽은 값이 max보다 크다면
				 max = arr[i]; // max 값을 배열에서 읽은 값으로 변경
				 index = i; // 최댓값의 인덱스를 현재 인덱스
			 }
		 }
		 return index;
	 }
	 

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
     * minAt (최소값이 있는 위치)
     * 정수 배열에서 최솟값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값의 인덱스.
     * 최솟값이 여러개 있는 경우, 첫번째 최솟값의 인덱스.
     */
    // TODO
	public static int minAT(int[] arr) {
		// 최소값을 찾음.
		// 배열의 원소들을 순서대로 반복하면서, 그 원소가 최솟값인 지 검사.
		// 최솟값을 찾았으면 반복을 종료.
		// 반복문이 종료됐을 때의 인덱스를 리턴.
		
		int min1 = min(arr);
		int index = 0; // 배열의 인덱스
		for(index = 0; index < arr.length; index++) { //지역변수라 int를 쓰지 않음.
			// 배열의 원소들을 순ㅅ대로 반복하면서, 그 원소가 최솟값인 지 검사.
			if(arr[index] == min1) {
				break; //최솟값을 찾으면 반복문 종료
			}
		}
		return index;
	}
	
	
	
	
	
	
	

}
