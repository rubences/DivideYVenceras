public class Main extends Mergesort{
  public static void main(String[]args){
	   int[]a={49,38,65,92,76,13,27};   
	    System.out.println ("La matriz antes de ordenar es:");
	   for(int i=0;i<a.length;i++){    
		System.out.print(a[i]+" "); 
	   }   
	   
	   mergesort(a,0,a.length-1);   
	    System.out.println ("\nLa matriz después de ordenar es:");
	   for(int i=0;i<a.length;i++){    
		System.out.print(a[i]+" ");
	   }   
	} 
}