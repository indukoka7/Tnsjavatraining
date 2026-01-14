package com.tnsif.Exception;
class Sample{
	public void show() throws Exception
	{
		try {
			int a=10, b=0;
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("division by 0 is not possible");
		}
			
			finally {
			System.out.println("this is finally block");
			}
			
		}
	}


public class ThrowsExc {

	public static void main(String[] args) throws Exception {
		Sample s = new Sample();
		s.show();
		

	}

}
