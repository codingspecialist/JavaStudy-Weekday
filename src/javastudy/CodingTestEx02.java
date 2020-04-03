package javastudy;

class Add {
	int n1, n2;

	public Add(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
}

class Minus {
	int n1, n2;
	
	public Minus(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
}

class Multi {
	int n1, n2;
	
	public Multi(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
}

public class CodingTestEx02 {

	public static void main(String[] args) {
		int n1[] = {1,2,3,5,2,4,11,15,2,4,8,9};
		int bigNum = 0;
		// + (1,11) (2,10) (3,9) (4,8) (5,7)
		// - (15,3) (14,2) (13,1)
		// * (1,12) (2,6)  (3,4) 
		
		System.out.println(1*3*5*2*4*11*15*2/4/8/9);
		
	}

}
