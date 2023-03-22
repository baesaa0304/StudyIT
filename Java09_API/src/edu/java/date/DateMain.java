package edu.java.date;
// Java.lang..String, java.lang.system,... -> import 문장 생략

import java.time.LocalDate;
public class DateMain {

	public static void main(String[] args) {
		// Java 8버전에서 새로 추가된 날짜/시간 관련 클래스와 메서드
		LocalDate now = LocalDate.now();// LocalDate 클래스의 static 메서드 호출.
		System.out.println(now); // LocalData 클래스는 toString() 메서드를 override.
		System.out.println(now.getYear());
		System.out.println(now.getMonth()); // java.time.Month enum 상수를 리턴.
		System.out.println(now.getMonthValue()); // 월을 숫자 (int)로 리턴.
		System.out.println(now.getDayOfWeek()); // java.time.DayWeek enum 상수를 리턴.
		System.out.println(now.plusDays(7));
		System.out.println(now.plusWeeks(1));
		
		
		LocalDate date = LocalDate.of(2023, 4, 1);
		System.out.println(date);
		
		
		
	}

}
