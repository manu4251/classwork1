class BoxDemo1{
public static void main(String args[]){
Box mybox1=new Box();
   Box mybox2=new Box();
   double vol;
   

   mybox1.w=10;
   mybox1.h=20;
   mybox1.d=15;
   mybox2.w=3;
   mybox2.h=6;
   mybox2.d=9;
   vol=mybox1.volume();
   System.out.println("volume is" + vol);
   vol=mybox2.volume();
   System.out.println("volume is:" + vol);
 }
}