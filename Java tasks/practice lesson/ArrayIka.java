        public class ArrayIka {

        public static void main (String [] args) {
        
//      char [][] scores = {{'F', 'O', 'Y'}, {'G', 'R', 'E'}, {'D', 'B', 'L'}};
        
     //  int [][] scores = {{1, 2, 3}, {4, 5, 7}, {8, 9, 10}};
        
//       
//        System.out.println(scores[2][1]);
//        
//        }
//        
//        }
    
        char [][] scores = new char [3][3];
        
        
        scores [0][0] = 'X';
        scores [0][1] = 'O';
        scores [0][2] = 'X';
        
        scores [1][0] = 'O';
        scores [1][1] = 'O';
        scores [1][2] = 'O';
        
        scores [2][0] = 'X';
        scores [2][1] = 'X';
        scores [2][2] = 'O';  
        
        for(int row = 0; row < scores.length; row++) {
        for (int secondRow = 0; secondRow < scores.length; secondRow++) {
            System.out.print(scores[row][secondRow] + "  ");
        }
            System.out.println();
        }    
   
        for(int row = 0; row < scores.length; row++) {
        for (int secondRow = 0; secondRow < scores.length; secondRow++) {
           if (scores [row][secondRow] == 'X') {
            System.out.print(1 + "  ");          
            }
            else {
           System.out.print(2 + "  "); 
             }
        
                     
        }
        System.out.println();
        
        }
        
        
        }
        
        }
        
       
