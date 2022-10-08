class OverloadCons{
public static void main(String args[]){
Box4 mybox1=new Box4(10,20,30);
Box4 mybox2=new Box4();
Box4 mycube=new Box4(7);
double vol;
vol=mybox1.volume();
System.out.println("volume of mybox1 is:"+ vol);
vol=mybox2.volume();
System.out.println("volume of mybox2 is:"+ vol);
vol=mycube.volume();
System.out.println("volume of mycube is:"+ vol);
}
}
