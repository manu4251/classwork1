class Box4{
double width;
double height;
double depth;	
Box4(double w,double h,double d){
width=w;
height=h;
depth=d;
}
Box4(){
width=-1;
height=-1;
depth=-1;
}
Box4(double len){
width=height=depth=len;
}
double volume(){
return width*height*depth;
}
}