package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//---------------Kata Question--------------//
//How would you make sure the guess is NOT zero
//    and end the game if the guess is zero?
//Write out the steps in English
//Then translate the steps into code
//Make sure to run after each line
public class HiLowNoZeroNoNegativeAndPlayOn_02
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 2; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      //if the guess is zero, tell them "DO NOT GUESS ZERO!" and then end the game
      if (guess < 1)
      {
        MessageBox.showMessage("Guess is an invalid answer.");
        for (i = 0; i < 2; i++)
        {
          int guess == MessageBox.askForNumericalInput("Guess a number");
        }
        if (guess == answer)
        {
          Sound.playBeep();
          MessageBox.showMessage("You won!");
          System.exit(0);
        }
        else if (guess > answer)
        {
          MessageBox.showMessage("Too high");
        }
        else
        {
          MessageBox.showMessage("Too low");
        }
      }
      MessageBox.showMessage("You lost");
    }
  }
}