public class qsort {
    public int part(int[] a,int low,int high)
    {
      int piv=a[low];
      int i=low;
      int j=high;
      int temp;
      if(i<j)
      {
          while (a[i]<=piv)
          {
              i++;
          }
          while (a[j]>=piv)
          {
              j--;
          }
          if(i<j)
          {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
          }
         // i++;
      }
      temp=a[low];
      a[low]=a[j];
      a[j]=temp;
      return j;

    }
    qsort(int[] a,int low,int high){
        if(low<high)
        {
            int pivInd=part(a,low,high);
            new qsort(a,low,pivInd-1);
            new qsort(a,pivInd+1,high);

        }
    }
}
