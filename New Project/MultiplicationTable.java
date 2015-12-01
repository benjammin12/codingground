public class HelloWorld{

     public static void main(String []args){
       int x = 1;
       int column = 1;
       
     
        
       while (x <= 10) {
        
         
      
        
        while (column <= x) {
           
            System.out.print(x * column + " ");
            column++;
            
        }
        
          System.out.println();
          column = 1;
          x++;
       
    }
    
     }
}
