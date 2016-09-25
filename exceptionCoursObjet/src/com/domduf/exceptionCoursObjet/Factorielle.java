package com.domduf.exceptionCoursObjet;

public class Factorielle {
	static int factorielle(int n){
		int res=1;
		if (n<0){
			throw new PasDefini();
		}
		for (int i=1;i<=n;i++){
			res=res*i;
		}
		return res;
	}

}
