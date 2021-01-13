package LeetCode_Questions;

import java.util.*;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            int previousSize = result.get(i-1).size();
            System.out.println("previous size:"+previousSize);
            for(int j=1;j<previousSize;j++){
                int upperLeft = result.get(i-1).get(j-1);
                int upperRight = result.get(i-1).get(j);
                temp.add(upperLeft+upperRight);
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }

    public void mainPascalsTriangle(){

    }
}
