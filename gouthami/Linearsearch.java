class Linearsearch
{
   public static int Linearsearch(int[] array,int target)
   {
    for(int i=0; i<=array.length; i++)
     {
      if(array[i] == target)
      {
        return i;
      }
	
	
     }
       return -1;
   }
     public static void main(String[] args)
     {
       int[] array = {4,6,5,8,9,2,1,3,7};
       int target = 7;
       int index = Linearsearch(array,target);
	if(index!=-1){
		System.out.println("Element is at:"+ index);
	}
	else{
		System.out.println("Not Found");
	}
     }
}
