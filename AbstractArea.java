class AbstractArea{
public static void main(String args[]){
Figure f=new Figure(10,10);
Rectangle r=new Rectangle(9,5);
Figure figref;
figref =r;
System.out.println("Area is:"+figref.area());
}
}