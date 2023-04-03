package edu.java.lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdMain03 {

	public static void main(String[] args) {
		// Employee를 원소로 갖는 리스트를 선언, 생성
		List<Employee> employees = Arrays.asList(
				new Employee(100, "이찬희", "개발1팀", "대리", 400.0),
				new Employee(101, "지대한", "개발2팀", "사원", 350.0),
				new Employee(200, "김다훈", "개발2팀", "과장", 380.0),
				new Employee(201, "유다한", "개발1팀", "부장", 500.0),
				new Employee(300, "강효남", "인사팀", "사원", 300.0),
				new Employee(301, "위태욱", "인사팀", "과장", 1000.0)
		);
		
		// 1. 모든 직원들의 정보를 한 줄에 한 명씩 츨력.								
		System.out.println("1번문제 >>");
		employees.forEach(x ->System.out.println(x));
		employees.forEach(System.out :: println); // 같은 람다 표현
								
		// 2. 개발1 ,2 팀에서 일하는 직원들의 급여의 합계를 출력.
		System.out.println("2번문제 >>");
		double sum = 0;
		int count = 0;
		for(Employee x : employees) {		 
			if(x.getDept().equals("개발1팀") || x.getDept().equals("개발2팀")) {
				sum+=x.getSalary();	
				count++;	
			}			
		}  System.out.println("개발팀 급여" + sum);
		
		// 3. 개발 1,2팀에서 일하는 직원들의 급여의 평균을 출력.
		System.out.println("3번문제 >>");
		System.out.println("개발팀 급여 평균" + sum/count);
		
		// 4. 직급이 사원인 직원들의 급여의 합계를 출력,
		
		// 5. 직급이 사원인 직원들의 급여의 평균을 출력.
		
		// 6. 급여가 400 이상인 직원들의 정보를 출력. 한줄에 한 명씩 출력.
		System.out.println("6번문제 >>");
		
		for(Employee x : employees) {
			if(x.getSalary() >= 400) {				
			System.out.println(x);
		}
	}
		// 7. 개발1팀 직원들의 급여를 10% 인상하고, 그 직원들의 급여 평균을 계산하고 출력.
		System.out.println("7번문제 >>");
		double multiplication = 0;
		for(Employee x :employees) {
			if(x.getDept().contains("개발1팀")) {
				multiplication = x.getSalary() * 1.1;
				count++;
			} 
		} 
		System.out.println("개발1팀 직원 급여" + multiplication);
		System.out.println("개발1팀 직원 급여 평균" + multiplication / count);
		
		// 8. 직원 리스트에서 "사원"은 몇 명?
		System.out.println("8번문제 >>");
		List<Employee> result = new ArrayList<>();
		count = 0;
		for(Employee x : employees) {
			if(x.getEmpTitle().equals("사원")) {
				result.add(x);	
				count++;
			}
		}
		System.out.println(count);
	}

}
