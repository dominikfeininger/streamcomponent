package main.java.firstTest;

public class Mutation {
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		System.out.println(geschachteltesIf(5, 2, 1));

	}

	public static String fooBar(int i) {
		
		if (i >= 0) {
			return "foo";
		} else {
			return "bar";
		}
	}
	
	public static int geschachteltesIf(int x, int y, int z) throws Exception{
		
		int a = 7;
		int b = 3;
		
		if(x>y && a>=x){
			if(z>x){
				return y;
			}else{
				return z;
			}
		}else if(y<z&& a>=y){
			if(y>x){
				return a;
			}else{
				return x;
			}
		}
		return b;
	}

}
