import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {

        public static void main(String[] args)
        {
            String input;     // To hold input
            int questions;    // Number of questions
            int missed;       // Number of questions missed
            
            while(true){
               try{
                  input = JOptionPane.showInputDialog("How many questions are on the exam?");
                  questions = Integer.parseInt(input);
   
                  if (questions <= 0) {
                     JOptionPane.showMessageDialog(null, "Number of questions must be greater than zero.");
                     continue;
                  }
   
                  break;//without this, it cant move on to the code after this. Used ai to help figure this part out because I couldn't find a way to stop the error.
               } catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null, "Please enter a valid number.");
               }
            
            }     
                   
            // Get the number of questions the student missed
            while(true){
               try{
                  input = JOptionPane.showInputDialog("How many questions did the student miss?");
                  missed = Integer.parseInt(input);

                  if(missed<0 || missed>questions){
                     JOptionPane.showMessageDialog(null, "Missed questions must be between 0 and " + questions + ".");
                     continue;
                  }

                  break;//same goes for this one
               } catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null, "Please enter a valid number.");
               }
            }
            // Create an Exam object
            Exam exam = new Exam(questions, missed);

            // Display the test results
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);
                        
            System.exit(0);
        }
    }


