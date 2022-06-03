import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) { //1
        if (list.size() <= 0) { //1
            throw new IllegalArgumentException("List length should be greater than 0"); //2
        }
        int n = list.size(); //3
        int rootOfN = (int) Math.sqrt(n); //3
        if (rootOfN * rootOfN  != n) { //3
            throw new IllegalArgumentException("List length should be a perfect square"); //4
        }
        List<String> numMines = new ArrayList<>(); //5
        for (int i = 0; i < n; i++) { //6 (6.1, 6.2, 6.3)
            if (!list.get(i).equals("#")) { //7
                int num = 0; //8
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { //8
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ //9
                        num += 2;  //10
                    }
                    else {  //11
                        num  += 1; //12
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //13
                    num++; //14
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ //15
                    num++; //16
                }
                numMines.add(String.valueOf(num)); //17
            }
            else { //18
                numMines.add(list.get(i)); //19
            }
        }
        return numMines; //20
    } //21


}