import java.util.Scanner;

/**
 *
 * @author Wyn Mellett
 */

public class MazeTester {
    
    private static Scanner keyboard;
    private static Maze testMaze;
    
    public static void main(String[] args) { 
        keyboard = new Scanner(System.in);
        int w;
        int h;
        String answer;
        int sx;
        int sy;
        int ex;
        int ey;
        
        System.out.print("Enter the width of the maze: ");
        w = keyboard.nextInt();

        System.out.print("Enter the height of the maze: ");
        h = keyboard.nextInt();
        
        testMaze = new Maze(w, h);
        
        testMaze.showMaze();
        
        System.out.println("");
        System.out.print("Solve maze? (yes or no): ");
        answer = keyboard.next();
        
        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("");
            System.out.print("Enter the starting x-coordinate: ");
            sx = keyboard.nextInt();
            System.out.print("Enter the starting y-coordinate: ");
            sy = keyboard.nextInt();
            System.out.print("Enter the ending x-coordinate: ");
            ex = keyboard.nextInt();
            System.out.print("Enter the ending y-coordinate: ");
            ey = keyboard.nextInt();
            testMaze.solveMaze(sx * 2 + 1, sy * 2 + 1, ex * 2 + 1, ey * 2 + 1, -1, -1);
            testMaze.showMaze();
        }
        
    }    
}
