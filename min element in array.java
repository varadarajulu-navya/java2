class Main {
    
    public static void main(String[] args) {
        int[] a= {10,20,30,40,50};
        
        int m=a[0];
        for(int i=0;i<a.length;i++){
            if (a[i]<m){
            m=a[i];
            
        }
        }
        
        System.out.print("min= " +m);
    }
}    