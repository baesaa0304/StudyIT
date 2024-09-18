package edu.java.interface01;

public class MariaDBModule implements DatabaseModule {

	@Override
	public int select() {
		System.out.println("MariaDB select()");
		return 0;
	}

	@Override
	public int insert(String srtVal, int intVal) {
		System.out.printf("MariaDB insert(%s, %d)\n", srtVal , intVal);
		return 0;
	}

}
