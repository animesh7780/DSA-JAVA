import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];


        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char digit = board[i][j];

                if(digit == '.'){
                    continue;
                }

                int boxInd = (i / 3) * 3 + (j / 3); 

                if(rows[i].contains(digit)){
                    return false;
                }
                rows[i].add(digit);

                if(cols[j].contains(digit)){
                    return false;
                }
                cols[j].add(digit);

                if(boxes[boxInd].contains(digit)){
                    return false;
                }
                boxes[boxInd].add(digit);
            }
        }
        return true;
    }
}
