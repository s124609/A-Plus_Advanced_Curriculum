import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main
{
    static int goalRow = 7, goalCol = 7;

    private static void printArray(int[][] arr, int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException
    {
        long start_time = System.nanoTime();

        Scanner input = new Scanner(new File("lab19_Graphs/test.dat"));

        int size = input.nextInt();

        int[][] maze = new int[size][size];
        int[][] newMaze = new int[size][size];

        for (int x = 0; x < size; ++x)
            for (int y = 0; y < size; ++y) {
                if (input.nextBoolean())
                    maze[x][y] = 1;
                else
                    maze[x][y] = 0;
            }


        printArray(maze, size, size);
        Pair pair = new Pair(0,0);
        PathFinder finder = new PathFinder(maze);
        Pair finish = finder.dfs(pair);

        if(finish.getRow() == goalRow && finish.getCol() == goalCol) {
            while( pair != null){
                newMaze[pair.getRow()][pair.getCol()] = 1;
                pair = pair.getNext();
            }
        } else {
            System.out.println("no path found");
        }

        System.out.println("//newMaze 1");
        printArray(newMaze, size, size);

        for (int i = 2; i < 5; i++)
        {
            Pair newPair = new Pair(0,0);
            PathFinder newFinder = new PathFinder(newMaze);
            Pair newFinish = newFinder.dfs(newPair);

            if(newFinish.getRow() == goalRow && newFinish.getCol() == goalCol) {
                while( newPair != null){
                    newMaze[newPair.getRow()][newPair.getCol()] = 1;
                    newPair = newPair.getNext();
                }
            } else {
                System.out.println("no path found");
            }

            if (i == 4) {
                System.out.println("//Final Maze ");
                newMaze[newFinish.getRow()][newFinish.getCol()] = 5;
                printArray(newMaze, size, size);
            }
            else {
                System.out.println("//newMaze " + i);
                printArray(newMaze, size, size);
            }

        }


        long end_time = System.nanoTime();
        double difference = (end_time - start_time) / 1e6;
        System.out.println(difference + "ms");
    }
}

class Pair
{
    private int row;
    private int col;
    private Pair next;

    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }

    int getRow(){
        return row;
    }
    int getCol(){
        return col;
    }

    Pair getNext() {
        return next;
    }

    void setNext(Pair next) {
        this.next = next;
    }

}

class PathFinder
{

    private int[][] arr;
    private int rowCount;
    private int colCount;
    private Stack<Pair> junctions = new Stack<>();

    PathFinder(int[][] arr){
        this.arr = arr;
        this.rowCount = arr.length;
        if(rowCount > 0) {
            this.colCount = arr[0].length;
        }
    }

    Pair dfs(Pair sp){

        int actualRow = sp.getRow();
        int actualCol = sp.getCol();

        arr[actualRow][actualCol] = 2;

        //OBJECTIVE
        if(actualRow == Main.goalRow && actualCol == Main.goalCol) {
            return sp;
        }

        boolean deeper = actualRow +1 < rowCount && arr[actualRow +1][actualCol] == 1;
        boolean left = actualCol -1 >= 0 && arr[actualRow][actualCol -1] == 1;
        boolean right = actualCol +1 < colCount && arr[actualRow][actualCol +1] == 1;
        boolean up = actualRow -1 >= 0 && arr[actualRow-1][actualCol] == 1;

        //test for junctions
        int possibilities = 0;
        if(left){
            possibilities++;
        }
        if(right) {
            possibilities++;
        }
        if(deeper){
            possibilities++;
        }
        if(up){
            possibilities++;
        }
        if(possibilities > 1) {
            this.junctions.push(sp);
        }

        Pair nextPair;
        if(deeper){
            nextPair = new Pair(actualRow + 1, actualCol);
        } else if(left) {
            nextPair = new Pair(actualRow, actualCol-1);
        } else if(right) {
            nextPair = new Pair(actualRow, actualCol+1);
        } else if(up) {
            nextPair = new Pair(actualRow-1, actualCol);
        }  else {
            if(!this.junctions.empty()) {
                Pair lastJunction = this.junctions.pop();
                lastJunction.setNext(null);
                return dfs(lastJunction);
            }
            return sp;
        }
        sp.setNext(nextPair);
        return dfs(nextPair);
    }
}