public class Exam extends Assessment{
   private int question, numMissed, pointsEach;
   
   public Exam(int questions, int missed){
      question = questions;
      numMissed = missed;
      pointsEach = 100/question;
      super.setScore(100-pointsEach*numMissed);
      }
   
   public int getNumMissed(){ return numMissed; }
   
   public int getPointsEach(){
      return pointsEach;
   }

}
