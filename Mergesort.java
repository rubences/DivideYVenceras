
public class Mergesort {  
	public static void merge(int[]a,int low,int mid,int high){
		// Combina dos matrices ordenadas
		int[]b=new int[high-low+1];   
		int s=low;   
		int t=mid+1;   
		int k=0;   
		while(s<=mid&&t<=high){
		    if(a[s]<=a[t])     
		       b[k++]=a[s++];    
		     else     
			b[k++]=a[t++];   
		}   
		
		while(s<=mid)    
			b[k++]=a[s++];   
			
		while(t<=high)       
			b[k++]=a[t++];   
			
		for(int i=0;i<b.length;i++){
		    a[low+i]=b[i];   
		}  
	}  
	
	public static void mergesort(int a[],int low,int high){
		 // Ordenar recursivamente la matriz
		if(low<high){
		    mergesort(a,low,(low+high)/2);    
		    mergesort(a,(low+high)/2+1,high);    
		    merge(a,low,(high+low)/2,high);   
		}  
	}  
}	
