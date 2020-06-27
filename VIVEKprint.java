/*VIVEK For best view plz type odd number  :  5
 V       V  I  V       V EEEEEE  K   K
  V     V   I   V     V  E       K  K
   V   V    I    V   V   EEEEEE  K K
    V V     I     V V    E       K  K
     V      I      V     EEEEEE  K   K

*/package com.vivek.coreJava;
import java.util.Scanner;
public class VIVEKprint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("For best view plz type odd number  :");
		int num=sc.nextInt();
		int count=num/2+1;
		for(int i=1;i<=num;i++) {		
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k= num*2-1;k>=i*2-1;k--) {
				if(k==num*2-1 || k==i*2-1)
				System.out.print("V");
				else 
					System.out.print(" ");
			}			
			for(int l=1;l<=i;l++) {
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++) {
				if(m==1)
				System.out.print(" I ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
					}
			for(int k= num*2-1;k>=i*2-1;k--) {
			    if(k==num*2-1 || k==i*2-1)
				System.out.print("V");
				else 
				    System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print(" ");
			}
			
			
			for(int j=1;j<2;j++) {
			System.out.print("E");
			}
			for(int k=1;k<=num;k++) {
				if(i==1 || i==num/2+1 || i==num)
				System.out.print("E");
				else 
					System.out.print(" ");
			}
			for(int m=1;m<2;m++) {
				System.out.print("  K");
			}
			
			for(int n=0;n<=count;n++) {
				if(n==count) {
					System.out.print("K");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<=num/2) {
				count--;
			}else if(i<=num) {
				count++;
			}
			System.out.println();
		}
		sc.close();
	}

}
