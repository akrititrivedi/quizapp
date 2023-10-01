import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        // Create a quiz instance and add questions
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("What is the capital of France?", "Paris"));
        quiz.addQuestion(new Question("What is 2 + 2?", "4"));
        quiz.addQuestion(new Question("What is java", "computer language"));
        quiz.addQuestion(new Question("What is capital of india", "new delhi"));
        quiz.addQuestion(new Question("2*3?", "6"));
        quiz.addQuestion(new Question("Who is primeminister of india?", "narendra modi"));
        quiz.addQuestion(new Question("how many days are in a week?", "7"));
        quiz.addQuestion(new Question("What is national fruit of india", "mango"));
        quiz.addQuestion(new Question("What is colour of sky", "blue"));
        quiz.addQuestion(new Question("What is moon?", "natural sattelite"));

        // Add more questions here...

        // Start the quiz
        quiz.start();
    }
}
