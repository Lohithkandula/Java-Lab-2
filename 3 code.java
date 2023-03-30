public class Main {
public static void main (String[] args){
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
String op = args[2];
switch (op){
case "+" :
System.out.println(args[0] + "+" + args[1] + "=" + (a+b));
break;
case "-" :
System.out.println(args[0] + "-" + args[1] + "=" + (a-b));
break;
case "*" :
System.out.println(args[0] + "*" + args[1] + "=" + (a*b));
break;
case "/" :
System.out.println(args[0] + "+" + args[1] + "=" + ((float)a / (float)b));
break;
default:
System.out.println("INVALID OPERATOR");
}
}
}
