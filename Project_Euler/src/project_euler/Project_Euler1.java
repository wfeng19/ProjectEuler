package project_euler;

public class Project_Euler1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long x=600851475143L ;
		long y=2;
		while (y<x) {
			if (x%y==0) {
				x=x/y;
				System.out.println(x);
			}
			else{
				y=y+1;
			}
		}
		
		
	}
}
