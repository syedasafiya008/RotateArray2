# RotateArray2//
  import java.util.Array;
public static RotateArray
  {
  public static void main(String args[])
    {
    int[] nums={-1, -100, 3, 99);
    int j=2;
    rotate(nums,j);
    System.out.println("Rotated Array:" +Arrays.toString(nums));
  }
  public static void rotate/(int[] nums, int j)
    {
    int=nums.length;
    j=j%n;
    int [] t=new int[n];
    int i;
    for(i=0i<n;i++)
      {
        t[i] = nums[n - j + i];
      }
    int i;
    for(i=n-1;i>=j;i--)
      {
        nums[i] = nums[i-j]
          }
    
    int i;
    for(i=0;i<n;i++)
      {
        nums[i]=t[i];
      }
  }
}
  
