public class Q14 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<a.length;i++){
            System.out.println("Table of "+a[i]+" :");
            for(int j=1;j<=10;j++){
                int l = a[i]*j;
                System.out.println(a[i]+" X "+j+" = "+l);
            }
            System.out.println();
        }
    }
}
