public class LoopInjava {
    
    public static void main(String[] args) {
        
        /*
           4 types of loops:
             1. For Loop
             2. While loop
             3. Do-while loop
             4. for each
        */
       
    //For loop
    System.out.println("For Loop:");
    for(int i=0;i<5;i++)
    {
       System.out.println("i= "+ i);
    }

  //While loop
  System.out.println("While Loop:");
  int j=0;
  while (j<5) {
    System.out.println("j= "+ j);
    j++;
  }

//do while loop
System.out.println("do while Loop:");
  int k=0;
 do{
    
     System.out.println("k= "+ k);
    k++;
 }
 while(k<5);

 //for each
 System.out.println("For each:");
 int arr[]={10,20,30,40,50};
 for(int num : arr)
 {
    System.out.println("num = " + num);
 }

    }
}
