class Rectangle extends Figure{
Rectangle(double a,double b){
super(a,b);
}
double area(){
System.out.println("inside area for rectangle");
return dim1*dim2;
}
}