import java.util.Date;
import java.sql.Time;
/**
 * Write a description of class DatabaseObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface DatabaseObserver
{
    public void DBvalidateLogin();
    
    public int DBgetUID();
    public void DBsetUID(int inID);
    
    public String DBgetFName();
    public void DBsetFName(String inFName);
    
    public String DBgetLName();
    public void DBsetLName(String inLName);
    
    public String DBgetSecurityQuestion();
    public void DBsetSecurityQuestion(String inQuestion);
    
    public String DBgetSecurityAnswer();
    public void DBsetSecurityAnswer(String inAnswer);
    
    public String DBgetPassword();
    public void DBsetPassword(String inPassword);
    
    public int DBgetDOB();
    public void DBsetDOB(int inDOB);
    
    public int DBgetMOB();
    public void DBsetMOB(int inMOB);
    
    public int DBgetYOB();
    public void DBsetYOB(int inYOB);
    
    public String DBgetEmail();
    public void DBsetEmail(String inEmail);
    
    public int DBgetPrivileges();
    public void DBsetPrivileges(int inPrivileges);
    
    public int DBgetMID();
    public void DBsetMID(int inMID);
    
    public String DBgetMDescription();
    public void DBsetMDescription(String inDescription);
    
    public int DBgetQID();
    public void DBsetQID(int inQID);
    
    public String DBgetQDescription();
    public void DBsetQDescription(String inQDescription);
    
    public char DBgetCorrectAnswer();
    public void DBsetCorrectAnswer(char inAnswer);
    
    public char DBgetUserAnswer();
    public void DBsetUserAnswer(char inAnswer);
    
    public String DBgetFeedbackA();
    public void DBsetFeedbackA(String inFeedback);
    
    public String DBgetFeedbackB();
    public void DBsetFeedbackB(String inFeedback);
    
    public String DBgetFeedbackC();
    public void DBsetFeedbackC(String inFeedback);
    
    public String DBgetFeedbackD();
    public void DBsetFeedbackD(String inFeedback);
    
    public String DBgetFeedbackE();
    public void DBsetFeedbackE(String inFeedback);
    
    public String DBgetQuestionContentA();
    public void DBsetQuestionContentA(String inQuestion);
    
    public String DBgetQuestionContentB();
    public void DBsetQuestionContentB(String inQuestion);
    
    public String DBgetQuestionContentC();
    public void DBsetQuestionContentC(String inQuestion);
    
    public String DBgetQuestionContentD();
    public void DBsetQuestionContentD(String inQuestion);
    
    public String DBgetQuestionContentE();
    public void DBsetQuestionContentE(String inQuestion);
    
    public Date DBgetAnswerDate();
    public void DBsetAnswerDate(Date inDate);
    
    public Time DBgetTimeQStart();
    public void DBsetTimeQStart(Time inTime);
    
    public Time DBgetTimeQAnswered();
    public void DBsetTimeQAnswered(Time inTime);
    
    public int DBgetLevelOfConfidence();
    public void DBsetLevelOfConfidence(int inLOC);
    
    public int DBgetScore();
    public void DBsetScore(int inScore);
    
}
