/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessanumber;

/**
 *
 * @author uyen
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uyen
 */
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.lang.Character;
public class GuessANumber
{   
    public static void main(String[] args)
    {                   
        Scanner input = new Scanner(System.in);           
        Random rand = new Random();            
        int goodGuess=0;
        int badGuess=0;
        int totalNumber=1;
        float guessPercentage=0;
        float overallPercentage=0;
        int secretNumber; 
        String userNumber;              
        int guess;                 
        int i=0; 
        JOptionPane.showMessageDialog(null,"Welcome to Guess A Number game!"); // display a dialog with a message              
        do            
        {  
            secretNumber = rand.nextInt(100); 
            String compNumber= String.valueOf(secretNumber);  
            //String message1=String.format("Computer number is:%s",compNumber);  
            //JOptionPane.showMessageDialog(null,message1);  
            userNumber= JOptionPane.showInputDialog("Enter a guess number between 0 to 100:");  
            String message=String.format("Your guess number is:%s",userNumber); 
            JOptionPane.showMessageDialog(null,message);  
            guess=Integer.parseInt(userNumber);                                             
            if (guess < 0 || guess > 100)            
                JOptionPane.showMessageDialog(null,"Your guess number must be between 0-100");                                 
            else if (guess == secretNumber)
            {   
                JOptionPane.showMessageDialog(null,"You win!");
                goodGuess ++;
                guessPercentage=(goodGuess/totalNumber);
                JOptionPane.showMessageDialog(null,new JTextArea("Good Guess Percenatege for this game is:" + Math.round(guessPercentage*100)+"%") );
            }
            else             
            {                                
                    if(guess < secretNumber)
                    {
                        JOptionPane.showMessageDialog(null,"Your guess number is smaller than the secret number!");
                        badGuess++;
                        guessPercentage=(badGuess/totalNumber) ;
                        JOptionPane.showMessageDialog(null,new JTextArea("Bad Guess Percenatege for this game is:" + Math.round(guessPercentage*100)+"%") );
                    }    
                    else 
                    {
                        JOptionPane.showMessageDialog(null,"Your guess number is greater than the secret number!");
                        badGuess++;
                        guessPercentage=(badGuess/totalNumber) ;
                        JOptionPane.showMessageDialog(null,new JTextArea("Bad Guess Percenatege for this game is:" + Math.round(guessPercentage*100)+"%") );
                    }
            }
           // guessPercentage = 
            String answer= JOptionPane.showInputDialog("Would you like to play again? Y/N");  
            String upperCaseAnswer=answer.toUpperCase();
            
            if(upperCaseAnswer.equals("Y"))
            {
                i++;
                totalNumber++;
            }
            else 
            {    
                overallPercentage = goodGuess/totalNumber;
                JOptionPane.showMessageDialog(null,new JTextArea("Overall guess percentage is:" + Math.round(overallPercentage*100)+"%") );
                JOptionPane.showMessageDialog(null,"Goodbye!");
                i=0;
            }
}while(i!=0);
    
    
        
    }
}

// Is this for Week 5 or Week 6 homework, Uyen?
