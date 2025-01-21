package blankvarible;

public class Blankfinalvarible {
 final int varibl;	
	
Blankfinalvarible(int value){
	varibl =value;
}
void display() {
	System.out.println("output blankfinal varible"+varibl);
}
public static void main(String[] args) {
	Blankfinalvarible l=new Blankfinalvarible(90);
	Blankfinalvarible h=new Blankfinalvarible(78);
	l.display();
    h.display();

}
}
