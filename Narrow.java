package oop;
import java.io.*;

public class Narrow {
	public static void main(String args[]) {
		double d = 100.245;
		short j=(short)d;
		int k=(int)d;
		System.out.println("original value: "+d);
		System.out.println("changed into short value: "+j);
		System.out.println("changed into int value: "+k);
		
	}

}
