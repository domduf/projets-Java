package com.domduf.exceptionTest;

public class Exception1 {
	
	public static void genException(int i){
		int nums[] = new int[4];
		Terminal.ecrireStringln("avant generation exception");
		
		//index out 
		nums[8]=10;
		
		Terminal.ecrireStringln("terminé");
		
	}

}
