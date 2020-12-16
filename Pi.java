public class Pi extends Thread {
	private static Object theMutex = new Object();//defining a mutex 
	static int C=0, N=0;
	static double pi;
	
	public void run() {
		 double x = Math.random();// picking x point at random
		 double y = Math.random();// picking y point at random
		 double result = x*x+y*y;// calculating the location of the point that was chosen 
		 synchronized(theMutex) {// allowing only one thread at a time to get inside the part
			 N ++;// increasing the number of trails
			 if(result < 1)// if the location of the point is less than on, the point is inside the circle
				 C ++; //increasing the numner of trails that the point is inside the circle
		 }
	}
	
	public static int getC() {
		return C;
	}
	
	public static int getN() {
		return N;
	}
	public static void calcPi()
	{
		double x,y;
		x=getC();
		y=getN();
		pi = x/y*4;// calculating pi
	}
	
	
	public static void print() {
		System.out.println("pi equals: " + Pi.pi);
	}
}
