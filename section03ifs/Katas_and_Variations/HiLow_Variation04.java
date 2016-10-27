package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_Variation04
{
  public static void main(String[] args)
  {
    int Answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + Answer);
    int numGuesses = MessageBox.askForNumericalInput("How many guesses would you like?");
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess an integer between 1 and 100");
      if (guess < 1 || guess > 100)
      {
       MessageBox.showMessage("You cannot guess values less than 1 or greater than 100!");
        System.exit(0);
      }
      if (guess == Answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You win!");
        System.exit(0);
      }
      else if (guess > Answer)
      {
        MessageBox.showMessage("Too High!");
      }
      else
      {
        MessageBox.showMessage("Too low!");
      }
    
    MessageBox.showMessage("You Lost!");
  if(guess<Answer-10||guess > Answer+10)
  {
    MessageBox.showMessage("Close");
  }
 }
}
