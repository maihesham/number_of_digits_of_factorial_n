package codefores;
//# of digits of factorial n?
/*
can use fact of 1+floor(log10(x))=> get lengh
//n!=1*2 ....n
//log(n!)=log(1*2* .....n)
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
        double digits = 0;
        for (long i=2; i<=n; i++)
            digits += Math.log10(i);
        int res=(int) (Math.floor(digits) + 1);
        System.out.println(res);
	
		
}
}