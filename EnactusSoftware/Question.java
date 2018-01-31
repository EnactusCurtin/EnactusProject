import java.util.*;
/**
 * Write a description of class Question here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question
{
    // instance variables - replace the example below with your own
    private int questionID;
    private String questionDescription;
    private char correctAns;
    private String theQuestion;
    private ArrayList<String> prompt;
    private ArrayList<QuestionChoice> choices;
    private int numChoices;
    private int timer;
    
    public void Question()
    {
        prompt = new ArrayList<String>();
        choices = new ArrayList<QuestionChoice>();
        timer = 0;
    }
    
    public void Question(String text)
    {
        theQuestion = text;
        prompt = new ArrayList<String>();
        choices = new ArrayList<QuestionChoice>();
        timer = 0;
    }
    
    public void addQuestionChoice(QuestionChoice inChoice)
    {
        choices.add(inChoice);
    }
    
    public void removeQuestionChoice(QuestionChoice inChoice)
    {
        choices.remove(inChoice);
    }
    
    public void setQuestionId(int num)
    {
        questionID = num;
    }
    
    public void setDescription(String inText)
    {
        questionDescription = inText;
    }
    
    public void setCorrectAns(char ans)
    {
        correctAns = ans;
    }
    
    public void setTheQuestion(String inText)
    {
        theQuestion = inText;
    }
    
    public void setNumChoices(int num)
    {
        numChoices = num;
    }
    
    
    public int getQuestionId()
    {
        return questionID;
    }
    
    public String getDescription()
    {
        return questionDescription;
    }
    
    public char getCorrectAns()
    {
        return correctAns;
    }
    
    public String getTheQuestion()
    {
        return theQuestion;
    }
    
    public int getNumChoices()
    {
        return numChoices;
    }

    
    
    
    

    public boolean equals(Question inQuestion)
    {
        return false;//need to finish
    }
    
    public boolean equalsExhaustive(Question inQuestion)
    {
        return false;//need to finish
    }
    
    public String toString()
    {
        return "";//need to finish
    }
}
