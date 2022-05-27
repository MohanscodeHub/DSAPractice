package dsamaths;

public class PrimeOrNot {

    public static boolean isprime(int n){

        boolean ans =false;

        if(n<=1){

          return ans;
        }
       else

            for(int i =2;i<n;i++){
                if(n%i==0){
                    return ans;

                 }
               else{
                    ans =true;
            }

        }

        return ans;
    }




    }

