package edu.java.contact02;

enum Menu1 {
	END, SAVE , LIST, SEARCH, CHANGE, DELETE, UNKONWM;
	
	
	
	public static Menu1 getValue(int n) {
		Menu1[] menues = values();
		int len = menues.length;
		if(n >= 0 && n < len) {
			return menues[n];
		} else {
			return menues[len - 1];
		}
	}
}	