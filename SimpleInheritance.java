class SimpleInheritance{
public static void main(String args[]){
A superob=new A();
B subob=new B();
superob.i=10;
superob.j=20;
System.out.println("contents of superob:");
superob.showij();
System.out.println();
subob.i=7;
subob.j=8;
subob.k=9;
System.out.println("contents of subob:");
subob.showij();
subob.showk();
System.out.println();
System.out.println("sum of i,j and k in subob:");
subob.sum();
}
}
