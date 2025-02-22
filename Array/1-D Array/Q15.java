public class Q15 {
    public static void main(String[] args) {
        int sum=0;
        int a[] = {123,567,453,678 ,876};
        for(int i=0;i<a.length;i++){
            int num = a[i];
            
            while(num>0){
                int rem = num%10;
             sum = sum*10+rem;
             num = num/10;

             System.out.print(rem);
            }
            System.out.println();
        }
    }
}
