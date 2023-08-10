class name{
    public static void main(String[] args){
        //for loop
        //using for loop counting 1 to 10
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }

        //to find odd number
        int n=100;
        for(int i=1;i<=n;i++){
            System.out.println(i);
            i=i+1;
        }


        //to find out even number
        int n=10;
        for(int i=1;i<=n;i++){
            if(i%2==0){
            System.out.println(i);
            }
            
        }
        
---------------------------------------
       //while loop
       //to find summation from 1 to 10
       int x=1;
       int sum=0;
       while(x<=10){
        sum=sum+x;
        x++;
       }
       System.out.println("summation: " + sum);


   // reverse of counting from 10 to 1
    int i=10;
    while(i>=1){
        System.out.println(i);
        i--;
    }


   // mulplication of 2 
     int num=2, i=1;
    while(i<=10)
    {
        System.out.printf("%d * %d = %d\n",num,i,num*i);
        i++;   
         }

    
    }
}
 difference between printf , println and print
*println is used for simply print a line of text.
*printf is used when u have to fromat ur string .
 *print does not insert a new line at the end of the output: