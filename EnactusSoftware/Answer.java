import java.util.*;
/**
 * Write a description of class Answer here.
 * 
 * @author (your name) 
 * @version (a version number or a Date)
 */
public class Answer
{

    private int userID;
    private int questionID;
    private char userAnswer;
    private Date answerDate;
    private Date timeQuestionStarted;
    private Date timeQuestionAnswered;
    private int noOfAttempts;
    private int levelOfConfidence;
    
    public Answer()
    {
    }

    public int getUserID()
    {
        return userID;
    }

    public void setUserID(int inUserID)
    {
        this.userID = inUserID;
    }

    public int getQuestionID()
    {
        return questionID;
    }

    public void setQuestionID(int inQID)
    {
        questionID = inQID;
    }

    public char getUserAnswer()
    {
        return userAnswer;
    }

    public void setUserAnswer(char inUserAnswer)
    {
        userAnswer = inUserAnswer;
    }

    public Date getAnswerDate()
    {
        return answerDate;
    }

    public void setAnswerDate(Date inAnswerDate)
    {
        answerDate = inAnswerDate;
    }

    public Date getTimeQuestionStarted()
    {
        return timeQuestionStarted;
    }

    public void setTimeQuestionStarted(Date inTimeQuestionStarted)
    {
        timeQuestionStarted = inTimeQuestionStarted;
    }

    public Date getTimeQuestionAnswered()
    {
        return timeQuestionAnswered;
    }

    public void setTimeQuestionAnswered(Date inTimeQuestionAnswered)
    {
        timeQuestionAnswered = inTimeQuestionAnswered;
    }

    public int getNoOfAttempts()
    {
        return noOfAttempts;
    }

    public void setNoOfAttempts(int inAttempts)
    {
        noOfAttempts = inAttempts;
    }

    public int getLevelOfConfidence()
    {
        return levelOfConfidence;
    }

    public void setLevelOfConfidence(int inLevelOfConfidence)
    {
        levelOfConfidence = inLevelOfConfidence;
    }

    

}
