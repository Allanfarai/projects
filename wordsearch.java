package wordgame;
public class assignment2wordsearch {
	
	static int R, C;
	 
   
    static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
 
   
    static boolean search2D(char[][] grid, int row,
                            int col, String word)
    {
       
        if (grid[row][col] != word.charAt(0))
        	
        
            return false;
 
     int length = word.length();
 
       
        for (int pos = 0; pos < 8; pos++) {
           
            int i, rpos = row + x[pos], cpos = col + y[pos];
 
            for (i = 1; i < length; i++) {
               
                if (rpos >= R || rpos < 0 || cpos >= C || cpos < 0)

                    break;
            
                
                if (grid[rpos][cpos] != word.charAt(i))
       
                	break;
    

                
                rpos += x[pos];
                cpos += y[pos];
            }
 
            
            if (i == length)
                return true;

        }
        return false;
        
    }
 

    static void Searcher(
        char[][] grid,
        String word)
    
    
    {


        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {

                if (search2D(grid, row, col, word))
                    System.out.println(
                        "pattern found at " + row + ", " + col + ", " + word);

                }


            }
        }
    
    
        
    
    
 
 
    public static void main(String args[])
    {
        R = 14;
        C = 14;

        char[][] grid = {
                {'S', 'L', 'E', 'F', 'F', 'E', 'D', 'E', 'R', 'A', 'L', 'F', 'D', 'E'},
                {'C', 'U', 'Y', 'A', 'O', 'E', 'T', 'L', 'P', 'M', 'M', 'R', 'O', 'L'},
                {'A', 'F', 'D', 'G', 'T', 'E', 'I', 'R', 'O', 'T', 'I', 'E', 'T', 'U'},
                {'T', 'H', 'E', 'I', 'D', 'H', 'A', 'S', 'I', 'N', 'D', 'Q', 'T', 'F'},
                {'T', 'T', 'N', 'E', 'E', 'I', 'R', 'D', 'S', 'A', 'S', 'U', 'M', 'R'},
                {'E', 'U', 'E', 'I', 'I', 'A', 'A', 'L', 'E', 'T', 'A', 'E', 'D', 'E'},
                {'R', 'O', 'Y', 'C', 'R', 'O', 'D', 'E', 'D', 'R', 'G', 'N', 'M', 'D'},
                {'E', 'Y', 'R', 'E', 'R', 'I', 'E', 'P', 'A', 'O', 'R', 'T', 'E', 'N'},
                {'D', 'P', 'R', 'B', 'A', 'C', 'F', 'R', 'T', 'P', 'U', 'N', 'E', 'O'},
                {'E', 'E', 'A', 'I', 'M', 'R', 'I', 'L', 'N', 'M', 'E', 'R', 'T', 'W'},
                {'D', 'O', 'F', 'D', 'I', 'E', 'N', 'H', 'E', 'I', 'S', 'O', 'A', 'A'},
                {'E', 'T', 'E', 'E', 'U', 'D', 'I', 'T', 'I', 'S', 'O', 'S', 'E', 'I'},
                {'N', 'D', 'I', 'S', 'T', 'I', 'N', 'C', 'T', 'E', 'M', 'A', 'D', 'I'},
                {'T', 'U', 'T', 'R', 'T', 'E', 'W', 'D', 'H', 'A', 'E', 'I', 'R', 'T'},
        };
        Searcher(grid, "GRUESOME");
        Searcher(grid, "MARRIED");
        Searcher(grid, "SCATTERED");
        Searcher(grid,"YOUTHFUL");
        Searcher(grid,"FEDERAL");
        Searcher(grid,"POISED");
        Searcher(grid,"WONDERFUL");
        Searcher(grid,"DISTINCT");
        Searcher(grid,"ABROAD");
        Searcher(grid,"IMPORTANT");
        Searcher(grid,"FREQUENT");
        Searcher(grid,"WOLVES");
        Searcher(grid,"POCKETSL");
        Searcher(grid,"ADVANCED");
        System.out.println();


		};
		

}
