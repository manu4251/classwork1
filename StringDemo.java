class StringDemo{
public static void main(String args[]){
String strob1="first string";
String strob2="second string";
String strob3=strob1;
System.out.println("length of strob1:"+strob1.length());
System.out.println("char at index 3 in strob1:"+strob1.charAt(3));
if(strob1.equals(strob2))
System.out.println("strob1==strob2");
else
System.out.println("strob1!=strob2");
if(strob1.equals(strob3))
System.out.println("strob1==strob3");
else
System.out.println("strob1!=strob3");
}
}
