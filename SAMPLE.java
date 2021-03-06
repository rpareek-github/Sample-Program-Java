//Taking Sample I and O Program for string wala output data
 
import java.io.BufferedReader;
  import java.io.InputStreamReader;
  import java.math.BigInteger;
  import java.util.ArrayList;
  import java.util.List;

  class SAMPLE {
      public static void main(String args[]) throws Exception {
    	  System.out.print("Please input something");
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String line = br.readLine();
          int N = Integer.parseInt(line);
          
          ArrayList<String> inputs = new ArrayList<String>();
          for (int i = 0; i < N; i++) {
              inputs.add(String.valueOf(br.readLine()));
          }
          ArrayList<String> outputs = new ArrayList<String>();
          for(String input : inputs){
              outputs.add(factorial(input));
          }
          for(String result: outputs){
              System.out.println(result);
          }
      }

      private static String factorial(String input) {
    	  String[] arr=input.split(" ");
    	  int[] intarr=new int[arr.length];

    	  for(int i=0;i<arr.length;i++)
    	   intarr[i]=Integer.parseInt(arr[i]);
    	  
    	  for (int i=0;i<intarr.length;i++)
          System.out.print(arr[i]);  
    	  
        return input;
      }
  }