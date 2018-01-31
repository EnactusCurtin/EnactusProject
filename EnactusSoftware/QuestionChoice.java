
/**
 * Write a description of class QuestionChoice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuestionChoice
{
    private char identifier;
    private String text;
    private String feedback;
    
    public void QuestionChoice(char inID)
    {
        identifier = inID;
    }
    public char getID()
    {
        return identifier;
    }
    public void setText(String inText)
    {
        text = inText;
    }
    public void setFeedback(String inFeedback)
    {
        feedback = inFeedback;
    }
    public String getText()
    {
        return text;
    }
    public String getFeedback()
    {
        return feedback;
    }
}
