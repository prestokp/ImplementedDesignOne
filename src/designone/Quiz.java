package designone;

import java.util.ArrayList;

/**
 *
 * This class creates the quiz object which will store the an id and questions
 *
 *
 */
public class Quiz {

    private int id;
    private ArrayList<Question> questionsList;


    /**
     * This constructs the quiz objects and passes in a specific ID
     * @param
     */
    public Quiz(int id){

        this.id = id;
        this.questionsList = new ArrayList<Question>();

    }

    /***
     * returns the ID of this quiz
     * @return
     */
    public int getQuizID(){
        return this.id;
    }

    /***
     * adds a questions to an array list of type question
     * @param addQuestion
     */
    public void addQuestion(Question addQuestion){
        questionsList.add(addQuestion);
    }

    /***
     * returns this array list of questions
     * @return
     */
    public ArrayList<Question> getQuestionsList(){
        return this.questionsList;
    }
}