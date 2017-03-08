/**
 *
 */
package com.testjdk.demo;

/**
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		for (int i = 0; i==0; i++,i--) {
			System.out.println(System.getProperty("java.version"));
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
