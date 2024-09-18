package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class FileMain07 {

	public static void main(String[] args) {
		// TODO 
		// 1. ArrayList<Student> 객체 생성
		ArrayList<Student> student = new ArrayList<>(); 
		// 2. 1,000,000개의 Student 객체를 리스트에 저장. - Random 클래스 이용
		Random rand = new Random();				
		
		for(int i = 0; i <1_000_000; i++) {
			Score score1 = new Score(rand.nextInt(101), rand.nextInt(101), rand.nextInt(101));
			Student student1 = new Student(i,"Name_" + i ,score1);
			
			student.add(student1);
			
		}
	
		// 3. 리스트를 student .dat 파일에 (직렬화)씀.
		String file = "data/student-list.dat";
		
//		FileOutputStream out = null;
//		BufferedOutputStream bout = null;
//		ObjectOutputStream oout =null;
		
		try ( FileOutputStream out = new FileOutputStream(file);
			  BufferedOutputStream bout	= new BufferedOutputStream(out);
				ObjectOutputStream oout = new ObjectOutputStream(bout);						 
		) {		
			long start = System.currentTimeMillis();
									
			oout.writeObject(student); // 리스트를 직렬화
			
			long end = System.currentTimeMillis();
			System.out.println("Write 경과 시간: " + (end - start) + "ms");
												
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		finally {
//			try {
//				oout.close();
//			} catch (Exception e) {				
//				e.printStackTrace();
//			}
//		}
		// 4. 파일에서 데이터를 읽어서 (역직렬화) 씀. - > 읽은 데이터 확인.
		
		 try   ( FileInputStream in = new FileInputStream(file);
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream oin = new ObjectInputStream(bin);
				) {
				long start = System.currentTimeMillis();
				ArrayList<Student> list = (ArrayList<Student>) oin.readObject();												
				long end = System.currentTimeMillis();
				 System.out.println("read 경과시간: " + (end - start) + "ms");
				 
				 // 데이터 확인
				 System.out.println("size = " + student.size());
				 int index =rand.nextInt(1_000_000);
				 System.out.println("student: " + student.get(index));
				 System.out.println("List size = " + list.size());
				System.out.println(list.get(index));
		
		 
		 
		 
		 } catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
