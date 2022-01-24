package corejava.Chapter6_Methods.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    int[][] board;
    TicTacToe()
    {
        board=new int[3][3];
        for(int i=0;i< board.length;i++)
        {
            for(int j=0;j< board.length;j++)
            {
                board[i][j]=-1;
            }
        }
    }
    void runGame()
    {
        Scanner sc=new Scanner(System.in);
        int chance=0;
        for(int i=0;i<9;i++)
        {
            String player;
            if(chance==0)
            {
                player="A";
            }
            else
                player="B";
            displayBoard();
            System.out.println("Enter the move of Player "+player);
            while(true)
            {
                System.out.println("Enter x");
                int x=sc.nextInt();
                System.out.println("Enter y");
                int y=sc.nextInt();
                if(board[x][y]!=-1)
                    System.out.println("Enter a valid position: ");
                else {
                    board[x][y]=chance;
                    if(checkWinner(chance))
                    {
                        System.out.println(player +" won the match, congratulations! ");
                        return;
                    }
                    break;
                }
            }

            chance=1-chance;

        }

        System.out.println("No Winner");
    }
   void  displayBoard()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
   boolean checkWinner(int chance)
    {
        //checkDiagonal
        int i,j;
        for(i=0;i<3;i++)
        {
            if(!(board[i][i]==chance))
                break;
        }
        if(i==3)
            return true;
        for(i=0,j=2;i<3&&j>=0;i++,j--)
        {
            if(!(board[i][j]==chance))
                break;
        }
        if(i==3 && j==-1)
            return true;

        //check rows
        for(i=0;i<3;i++)
        {
             j=0;
            for(;j<3;j++)
            {
                if(!(board[i][j]==chance))
                    break;
            }
            if(j==3)
                return true;
        }

        //checkColumns
        for( i=0;i<3;i++)
        {
             j=0;
            for(;j<3;j++)
            {
                if(!(board[j][i]==chance))
                    break;
            }
            if(j==3)
                return true;
        }

        return false;
    }
}
