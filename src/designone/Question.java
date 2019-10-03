package designone;
/**
 *
 * This class creates the question object via an int id and string data that forms the question
 * Provides getter methods to return certain data of the question object
 *
 *
 */
public class Question {

    private int id;
    private String data;

    /***
     * this is the constructor for the question object
     * takes in String data to form the question
     * takes in an int ID to serve as the question ID
     * @param id
     * @param data
     */
    public Question(int id, String data){
        this.id = id;
        this.data = data;
    }

    /***
     * updates the question data in a question
     * @param newQuestionData
     */
    public void updateQuestion(String newQuestionData){
        this.data = newQuestionData;
    }

    /***
     * returns the question id
     * @return id
     */
    public int getId(){
        return this.id;
    }

    /***
     * returns the string question data
     * @return data
     */
    public String getData(){
        return this.data;
    }



}