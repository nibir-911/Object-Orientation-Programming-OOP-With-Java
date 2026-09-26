public class VariablesInjava {
    
    /*
      There are 4 types of variables in java:
      1. Local Variables: Works inside method
      2. Instance Variables: Works int both object and class
      3. Static Variables : Decler with static keyword work among class and object
      4. Final Variables
    */

      int instanceVariable= 10;
      static String name= "Raihan Chowdhury";

      public void showVariable() {

         int localVariable= 20;

         System.out.println("Instance = " +instanceVariable);
         System.out.println("Local Variable = " +localVariable);
         System.out.println("Static Var: "+ name);

      }

      public static void main(String[] args) {
          
        VariablesInjava obj= new VariablesInjava();
        obj.showVariable();
        System.out.println("Accessing trough Class: " + VariablesInjava.name);
      }
}
