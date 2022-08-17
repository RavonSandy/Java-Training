abstract class Shape{
  abstract void rect();
  abstract void tri();
}

class Rect_Tri extends Shape {

  public void rect() {
	  int l=5;
	  int w=6;
	  int r= l*w;
    System.out.println("Rectangle: "+r);
  }


  public void tri() {
	  int l=5;
	  int h=6;
	  int b=7;
	  int T= b*l*h;
    System.out.println("Triangle: "+T);
  }
}
