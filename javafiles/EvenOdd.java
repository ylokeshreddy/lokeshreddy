import java.util.Scanner;
 
public class EvenOdd{

public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter a number which you want to check whether that is even or odd");
int n = in.nextInt();
 
if(n%2==0){
System.out.println(n+" is an even number.");
}else{
System.out.println(n+" is an odd number.");

}
}
}