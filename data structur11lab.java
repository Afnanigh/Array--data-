package hayakel2.pkg3;

public class Hayakel23 {

    public static void main(String[] args) {
        int []arr={4,46,24,17,18,50,26,31,10};
        System.out.println("The max element is: "+maxuse(arr,arr.length-1));
        
    }
    public static int maxuse(int[]a,int i){
        if(i==0){
            return a[0];
        }
        int max=maxuse(a,i-1);
        if(a[i]>max){
            max=a[i];
        }
        return max;
    }
}
