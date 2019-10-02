package designone;

import java.util.ArrayList;

/**
 *
 * TODO This class should documented with a purpose!
 *
 *
 */
public class Quiz {

    private int id;
    private ArrayList<Question> questionsList;


    public Quiz(int id, ArrayList<Question> questionsList){

        this.id = id;
        this.questionsList = questionsList;

    }

    //Returns the ID of this quiz
    public Quiz getQuiz(int id){
        return null;
    }
}