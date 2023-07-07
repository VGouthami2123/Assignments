class BinarySearch
{
   public static int Binarysearch(int[] array,int target)
   {
    int left=0;
    int right=array.length-1;
    while(left<=right){
         int mid=left+(right-left)/2;
    if(array[mid]==target){
         return mid;
    }
    if(array[mid]<target){
         left=mid+1;
    }
    else{
         right=mid-1;

         }
	
     }
       return -1;
   }
     public static void main(String[] args)
     {
       int[] array = {1,2,3,4,5,6,7,8,9};
       int target = 6;
       int index = Binarysearch(array,target);
	if(index!=-1){
		System.out.println("Element is at:"+ index);
	}
	else{
		System.out.println("Not Found");
	}
     }
}