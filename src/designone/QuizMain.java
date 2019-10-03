package designone;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *  This class is used to demonstrate a functional design
 *  involving Quizzes and Questions which can be updated and displayed
 *
 */
public class QuizMain {

    HashMap<Integer, Quiz> quizMap;
    HashMap<Integer, Question> questionMap;
    //TODO add instance variables here

    public QuizMain() {
        // TODO In order to demonstrate functionality, please follow the TODOs below
        // You will have to create questions and quizzes when a QuizMain is created

        // TODO 1 Create five questions (can be silly/basic questions) use id 1,2,3,4,5 ...
        Question one = new Question(1, "What is the capital of Russia?");
        Question two = new Question(2, "What is the capital of China?");
        Question three = new Question(3, "What is the capital of Colombia?");
        Question four = new Question(4, "What is the capital of Iran?");
        Question five = new Question(5, "What is the capital of Estonia?");

        questionMap = new HashMap<Integer, Question>();
        questionMap.put(1, one);
        questionMap.put(2, two);
        questionMap.put(3, three);
        questionMap.put(4, four);
        questionMap.put(5, five);
/*
        ArrayList<Question> setOne = new ArrayList<>();
        setOne.add(questionMap.get(1));
        setOne.add(questionMap.get(2));
        setOne.add(questionMap.get(3));


        ArrayList<Question> setTwo = new ArrayList<>();
        setTwo.add(questionMap.get(5));
        setTwo.add(questionMap.get(5));
        setTwo.add(questionMap.get(5));



        ArrayList<Question> setThree = new ArrayList<>();
        setThree.add(questionMap.get(2));
        setThree.add(questionMap.get(3));
        setThree.add(questionMap.get(4));
*/


        //TODO 2 Create three or more quizzes  use id 1,2,3...
        //      (One quiz should share at least one question with another )
        Quiz firstQuiz = new Quiz(1);
        Quiz secondQuiz = new Quiz(2);
        Quiz thirdQuiz = new Quiz(3);

        //Use hashmaps to store questions in a quiz, id is the key, string data is the value
        quizMap = new HashMap<Integer, Quiz>();
        quizMap.put(1, firstQuiz);
        quizMap.get(1).addQuestion(questionMap.get(1));
        quizMap.get(1).addQuestion(questionMap.get(2));
        quizMap.get(1).addQuestion(questionMap.get(3));

        quizMap.put(2, secondQuiz);
        quizMap.get(2).addQuestion(questionMap.get(4));
        quizMap.get(2).addQuestion(questionMap.get(4));
        quizMap.get(2).addQuestion(questionMap.get(4));

        quizMap.put(3, thirdQuiz);
        quizMap.get(3).addQuestion(questionMap.get(2));
        quizMap.get(3).addQuestion(questionMap.get(4));
        quizMap.get(3).addQuestion(questionMap.get(5));

    }



    public static void main(String[] args) {
        //We want to use instance variables of the QuizMain class so we need to construct a QuizMain object
        QuizMain myQuizSimulator = new QuizMain();

        // TODO 3 Display three or more different quizzes
        System.out.println("--------------------------------------------------");
        System.out.println("Showing three or more original quizzes:");
        System.out.println("--------------------------------------------------");
        myQuizSimulator.handleDisplayQuiz(1);
        myQuizSimulator.handleDisplayQuiz(2);
        myQuizSimulator.handleDisplayQuiz(3);



        // TODO 4 Change two quiz questions
        // A. (One should be shared with two or more quizzes)
        // B. (One should be unique to one quiz)
        myQuizSimulator.handleUpdateQuizQuestion(1,"Question 1 changed right!!!?");
        myQuizSimulator.handleUpdateQuizQuestion(2,"And so did question 2 Right!!!??");


        // TODO 5 Display the same three (or more) quizzes
        //	   A. One that has a unique question which changed
        //	   B. Two which share a question that has been changed
        System.out.println("--------------------------------------------------");
        System.out.println("Showing three or more changed quizzes:");
        System.out.println("--------------------------------------------------");
        myQuizSimulator.handleDisplayQuiz(1);
        myQuizSimulator.handleDisplayQuiz(2);
        myQuizSimulator.handleDisplayQuiz(3);

    }

    /**
     *  This method should display a quiz in a very similar fashion to the output provided
     *  in example_output.txt, which is located in your repository
     *
     *
     * @param quizId
     */
    public void handleDisplayQuiz(int quizId) {
        //TODO complete this method
        System.out.println("Quiz: " + quizId);
        ArrayList<Question> quizQuestions = quizMap.get(quizId).getQuestionsList();

        for(Question thisProblem : quizQuestions){
            //System.out.println("Question: " + thisProblem.getId());
            System.out.println("Question[" + thisProblem.getId() + "]: " + thisProblem.getData());
            System.out.println();
        }

    }

    /**
     *
     * This method should replace the data in the question with id=questionId with the new questionData
     *
     * @param questionId
     * @param questionData
     */
    public void handleUpdateQuizQuestion(int questionId, String questionData) {
        //TODO complete this method
        questionMap.get(questionId).updateQuestion(questionData);
    }

}
