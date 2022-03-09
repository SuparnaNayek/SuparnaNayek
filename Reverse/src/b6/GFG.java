package b6;
import java.io.*;
import java.util.Scanner;
public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello",nstr="";
char ch;
System.out.println("Original word:");
System.out.println("Hello");
for(int i=0; i<str.length(); i++)
{
	ch=str.charAt(i);
	nstr=ch+nstr;
}
System.out.println("Reversed word:"+nstr);
	}
}
	
	


