import java.util.*;
/**
 * Write a description of class Module here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Module
{
    private ArrayList<Question> questions;
    private int numQuestions;
    //private int numAnswersPerQuestion;
    private int moduleID;
    private String moduleDescription;
    
    public Module(int inNQ)
    {
        numQuestions = inNQ;
        questions = new ArrayList<Question>();
    }
    
    public void addQuestion(Question inQuestion)
    {
        questions.add(inQuestion);
    }
    
    public void removeQuestions(Question inQuestion)
    {
        questions.remove(inQuestion);
    }
    
    public void setNumQuestions(int num)
    {
        numQuestions = num;
    }
    
    public void setModuleID(int num)
    {
        moduleID = num;
    }
    
    public void setModuleDescription(String inText)
    {
        moduleDescription = inText;
    }
    
    public int getNumQuestions()
    {
        return numQuestions;
    }
    
    public int getID()
    {
        return moduleID;
    }
    
    public String getDescription()
    {
        return moduleDescription;
    }
    
    
    
    public boolean equals(Module inModule)
    {
        boolean answer = false;
        if (inModule.getID() == this.moduleID)
        {
            answer = true;
        }
        return true;
    }
    
    public boolean equalsExhaustive(Module inModule)
    {
        return false;//need to finish
    }
    
    public String toString()
    {
        String text = "";
        text += moduleID + " ";
        return text;
    }
    
}
