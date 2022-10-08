class AccountBalance{
public static void main(String args[]){
Balance current[]=new Balance[3];
current[0]=new Balance("manasa",123.23);
current[1]=new Balance("vamsi",157.02);
current[2]=new Balance("mani",-12.23);
for(int i=0;i<3;i++) current[i].show();
}
}
