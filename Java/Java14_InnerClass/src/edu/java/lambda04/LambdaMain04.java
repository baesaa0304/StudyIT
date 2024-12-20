package edu.java.lambda04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaMain04 {

	public static void main(String[] args) {
		LambdaMain04 app =new LambdaMain04();
		
		
		List<Object> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Object> odds = app.filter(list, new MyFilter() {
			
			@Override
			public boolean cherck(Object x) {
				
				return ((Integer) x) % 2 == 1;
			}
		});
		System.out.println(odds);
		
		List<Object> evens  = app.filter(list, (x) -> ((Integer) x) % 2 == 0); // 아규먼트가 하나인 경우 (x)는 가로 생략 가능
		System.out.println(evens);
		
		
		List<Object> squares = app.mapper(list, new MyMapper() {
			
			@Override
			public Object transform(Object x) {
				Integer n = (Integer) x;
				
				return n * n;
			}
		});
		System.out.println(squares);
		
		List<Object> result = app.mapper(list, x -> ((Integer) x) + 10);
		System.out.println(result);
		
	}
	
	
	public List<Object> filter(List<Object> list, MyFilter func) {
		List<Object> result = new ArrayList<>();
		for(Object x : list) {
			if (func.cherck(x)) {
				result.add(x);
			}
		}
		return result;
	}
	
	public List<Object> mapper(List<Object> list, MyMapper func) {
		List<Object> result = new ArrayList<>();
		
		for(Object x : list) {
			result.add(func.transform(x));
		}
		
		return result;
	}
}
