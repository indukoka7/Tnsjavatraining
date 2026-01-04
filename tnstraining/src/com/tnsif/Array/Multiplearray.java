package com.tnsif.Array;

public class Multiplearray {

	public static void main(String[] args) {


		        int[][] marks = {{26,3},{53,65}}; // 2x2 array

		        for (int i = 0; i < marks.length; i++) { // rows
		            for (int j = 0; j < marks[i].length; j++) { // columns
		                marks[i][j] = (int)(Math.random() * 100);
		                System.out.print(marks[i][j] + " ");
		            }
		            System.out.println(); // new line after each row
		        }
		    }
		}



