class Solution {
    public boolean isValidSudoku(char[][] board) {
      

      HashSet<Character>[] row = new HashSet[9];
      HashSet<Character>[] col = new HashSet[9];
      HashSet<Character>[] box = new HashSet[9];


      for(int i=0;i<9;i++){
          row[i] = new HashSet<>();
          col[i] = new HashSet<>();
          box[i] = new HashSet<>();
      }

      for(int r=0;r<board.length;r++){

         for(int c=0;c<board[0].length;c++){
            
            char digit = board[r][c];

             if(board[r][c] == '.'){
                continue;
             }

             int boxIndex = (r/3) * 3 + (c/3);

             if(row[r].contains(digit) || col[c].contains(digit) || box[boxIndex].contains(digit)){
                
                 return false;
             }

             row[r].add(digit);
             col[c].add(digit);
             box[boxIndex].add(digit);
         }
      }

      return true;
        
    }
}
