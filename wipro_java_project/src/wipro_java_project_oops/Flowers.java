/**
 * 
 */
package wipro_java_project_oops;

/**
 * 
 */
public class Flowers{
String nameValue;
int petalValue;


Flowers(String name,int petal) {
	
this.nameValue=name;
this.petalValue=petal;

 
}
void display() {
	System.out.println("Flower name:"+nameValue+"Flower petal:"+petalValue);
}
 
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Flowers flowerobject1=new Flowers("rose",12);
	Flowers flowerobject2=new Flowers("sunflower",15);
	flowerobject1.display();
	flowerobject2.display();

}
}
