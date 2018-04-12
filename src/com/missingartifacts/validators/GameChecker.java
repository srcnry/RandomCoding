package com.missingartifacts.validators;

import java.util.HashSet;
import java.util.Set;

public class GameChecker {

    public static void main  (String args[]){
        int sudokuArr[][] = {{2,9,5,7,4,3,8,6,1},
                             {4,3,1,8,6,5,9,2,7},
                             {8,7,6,1,9,2,5,4,3},
                             {3,8,7,4,5,9,2,1,6},
                             {6,1,2,3,8,7,4,9,5},
                             {5,4,9,2,1,6,7,3,8},
                             {7,6,3,5,2,4,1,8,9},
                             {9,2,8,6,7,1,3,5,4},
                             {1,5,4,9,3,8,6,7,2}};

        System.out.println(isValid(sudokuArr) ? "Solution is valid" : "Solution is invalid");
    }

    private static boolean isValid(int[][] sudokuArr) {
        Set<Integer> rowCheck = new HashSet<>();
        Set<Integer> columnCheck = new HashSet<>();
        Set<Integer> squareCheck = new HashSet<>();


        for(int i = 0; i < sudokuArr.length; i++) {
            rowCheck.clear();
            for(int j = 0;  j< sudokuArr[i].length; j++) {
                if (seriesCheck(sudokuArr[i][j], rowCheck, i, j)) return false;
                columnCheck.clear();
                for(int k = 0; k < sudokuArr.length; k++) {
                    if(seriesCheck(sudokuArr[k][j],columnCheck, k,j)) return false;
                }
                squareCheck.clear();
                for(int row =(i/3)*3; row < (i/3)*3 + 3; row++) {
                    for(int column =(j/3)*3; column < (j/3)*3 + 3; column++) {
                        if(seriesCheck(sudokuArr[row][column], squareCheck, row,column)) return false;
                    }
                }

            }

        }
       return true;
    }

    public static boolean seriesCheck(int o, Set<Integer> checkSet, int i, int j) {
        if(!(o >=1 && o <=9)) {
            System.out.println("Violation at point [" + i + "][" + j + "]");
            return true;
        }

        if(!checkSet.contains(o)) {
            checkSet.add(o);
        } else {
            System.out.println("Violation at point [" + i + "][" + j + "]");
            return true;
        }
        return false;
    }
}


