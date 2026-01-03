package com.tnsif.java.oops.inheritance;

public class A {
	public void show() {
		System.out.println("this is class A");
	}
}	
	class B extends A{
		public void show1() {
			System.out.println(" this is class B");
		}
	}	
		class C extends B{
			public void show2() {
				System.out.println("this is class c");
			}
		}	
			class D extends A{
				public void show3() {
					System.out.println(" this is class D");
				}
			}	
				class E extends A{
					public void show4() {
						System.out.println(" this is class E");
					}
				}
