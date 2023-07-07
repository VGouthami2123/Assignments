class Linearsearchsorted
{
   public static int Linearsearchsorted(int[] array,int target)
   {
    int n=array.length;
    for(int i=0; i<n; i++)
     {
      if(array[i] == target)
      {
        return i;
      }
	if(array[i]>target){
          break;
         }
	
     }
       return -1;
   }
     public static void main(String[] args)
     {
       int[] array = {1,2,3,4,5,6,7,8,9};
       int target = 6;
       int index = Linearsearchsorted(array,target);
	if(index!=-1){
		System.out.println("Element is at:"+ index);
	}
	else{
		System.out.println("Not Found");
	}
     }
}