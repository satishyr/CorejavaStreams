package com.app.lam.alltypes.param;

public class Test {
	public static void main(String[] args) {
		I i=()->{return 111;
		
		};
		J j=()->{return 222;
		
		};
		K o3=(I x,J y)->{
			System.out.println(x.m1()+y.m2());
			A o4=()->{
				System.out.println("o4.m4()");};
				return o4;
			
		};
	o3.m3(i, j);

}
}