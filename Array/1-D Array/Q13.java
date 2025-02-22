public class Q13 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i=a.length-1;i>=0;i--){
            if(a[i] == 9 || a[i] == 7 || a[i] == 4 || a[i] == 2){
                System.out.print(a[i]+" ");
            }
        }
    }
}
