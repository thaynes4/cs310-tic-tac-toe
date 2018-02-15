package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
 
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
 
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
      for(int i = 0; i < 3; ++i){
        for(int j = 0; j < 3; ++j){
          System.out.print(model.getMark(i,j).toString());
        }
        System.out.println("");
      }

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
      System.out.println("It's your move now");
      

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
      System.out.println("Invalid input");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
 
}