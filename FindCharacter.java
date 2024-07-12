import java.util.Scanner;
class FindCharacter{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
if(ch>='A'&&ch<='Z'){
System.out.println("It is an alphabet");
}
else if(ch>='a'&&ch<='z'){
System.out.println("It is an alphabet");
}
else if(ch>='0'&&ch<='9'){
System.out.println("It is an numeric value");
}
else{
System.out.println("It is an symbol");
}
}
}