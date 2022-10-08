class Box3{
double width;
double height;
double depth;
Box3(){
System.out.println("constructing box");
width =10;
height=10;
depth=10;
}
double volume(){
return width*depth*height;
}
}

