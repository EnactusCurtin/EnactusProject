import java.util.*;
import java.lang.*;
import java.sql.Time;
/**
 * Write a description of class DatabaseController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DatabaseController implements DatabaseObserver
{

    public void DBvalidateLogin();

    public int DBgetUID(String fName, String email, int YOB) {
        String sqlQuery = "SELECT userID FROM User WHERE uFirstName = " + fname + ", uEmail = "+email+", uYearOfBirth = "+YOB+";";
        return executeQueryForInt(sqlQuery);
    }

    public void DBsetUID(int inID) {
        String sqlQuery = ""++";";
        executeInsert(sqlQuery);
    }

    public String DBgetFName(int uID) {
        String sqlQuery = "SELECT uFirstName FROM User WHERE userID = "+uID+";";
        return executeQueryForString(sqlQuery);
    }

    public void DBsetFName(int uID, String inFName) {
        String sqlQuery = "INSERT INTO User VALUE "+inFName+" WHERE userID = "+uID+";";
        executeInsert(sqlQuery);
    }

    public String DBgetLName(int uID) {
        String sqlQuery = "SELECT uLastName FROM User WHERE userID = "+uID+";";
        return executeQueryForString(sqlQuery);
    }

    public void DBsetLName(String inLName) {
        String sqlQuery = ""++";";
        executeInsert(sqlQuery);
    }

    public String DBgetSecurityQuestion(int uID) {
        String sqlQuery = "SELECT uSecurityQuestion FROM User WHERE userID = "+uID+";";
        return executeQueryForString(sqlQuery);
    }

    public void DBsetSecurityQuestion(String inQuestion) {
        String sqlQuery = ""++";";
        executeInsert(sqlQuery);
    }

    public String DBgetSecurityAnswer(int uID) {
        String sqlQuery = "SELECT uSecurityAnswer FROM User WHERE userID = "+uID+";";
        return executeQueryForString(sqlQuery);
    }

    public void DBsetSecurityAnswer(String inAnswer) {
        String sqlQuery = ""++";";
        executeInsert(sqlQuery);
    }

    public String DBgetPassword(int uID) {
        String sqlQuery = "SELECT uPassword FROM User WHERE userID = "+uID+";";
        return executeQueryForString(sqlQuery);
    }

    public void DBsetPassword(String inPassword) {
        
    }

    public int DBgetDOB(int uID) {
        String sqlQuery = "SELECT uDateOfBirth FROM User WHERE userID = "+uID+";";
        return executeQueryForString(sqlQuery);
    }

    public void DBsetDOB(int inDOB) {
        
    }

    public int DBgetMOB() {
        
    }

    public void DBsetMOB(int inMOB) {
        
    }

    public int DBgetYOB() {
        
    }

    public void DBsetYOB(int inYOB) {
        
    }

    public String DBgetEmail() {
        
    }

    public void DBsetEmail(String inEmail) {
        
    }

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

    public void DBsetQuestionContentE(String inQuestion){
        
    }

    public Date DBgetAnswerDate()
    {
        
    }

    public void DBsetAnswerDate(Date inDate)
    {
        
    }

    public Time DBgetTimeQStart()
    {
        
    }

    public void DBsetTimeQStart(Time inTime)
    {

    }

    public Time DBgetTimeQAnswered()
    {

    }

    public void DBsetTimeQAnswered(Time inTime)
    {

    }

    public int DBgetLevelOfConfidence()
    {

    }

    public void DBsetLevelOfConfidence(int inLOC)
    {
        
    }

    public double DBgetScore()
    {
        double Result = -1;
        String sqlQuery = "SELECT score FROM Result;";
        try { 
            Class.forName(DbStrings.JDBC_DRIVER);
            conn = (Connection) DriverManager.getConnection(DB_URL, DbStrings.USERNAME, DbStrings.PASSWORD);

            stmt = (Statement) conn.createStatement();
            Result = stmt.executeQuery(sqlQuery);

        }

        catch(ClassNotFoundException e) { 
            System.out.println("No"); 
            e.printStackTrace(); 
        } 
        catch(SQLException e) { 
            e.printStackTrace(); 
        } 
        return Result;
    }

    public void DBsetScore(int inScore)
    {
        String sqlQuery = "INSERT into SCORE 2 WHERE blahabbal";
        DBInsert(sqlQuery);
    }

    public String executeQueryForString(String sqlQuery)
    {
        try { 
            Class.forName(DbStrings.JDBC_DRIVER);
            conn = (Connection) DriverManager.getConnection(DB_URL, DbStrings.USERNAME, DbStrings.PASSWORD);

            stmt = (Statement) conn.createStatement();
            String Result = stmt.executeQuery(sqlQuery);
            return Result;
        }

        catch(ClassNotFoundException e) { 
            System.out.println("No"); 
            e.printStackTrace(); 
        } 
        catch(SQLException e) { 
            System.out.println("SQL Exception: " + sqlQuery);
            e.printStackTrace(); 
        } 
        //catch(
    }

     public Int executeQueryForInt(String sqlQuery)
    {
        try { 
            Class.forName(DbStrings.JDBC_DRIVER);
            conn = (Connection) DriverManager.getConnection(DB_URL, DbStrings.USERNAME, DbStrings.PASSWORD);

            stmt = (Statement) conn.createStatement();
            Int Result = stmt.executeQuery(sqlQuery);
            return Result;
        }

        catch(ClassNotFoundException e) { 
            System.out.println("No"); 
            e.printStackTrace(); 
        } 
        catch(SQLException e) { 
            System.out.println("SQL Exception: " + sqlQuery);
            e.printStackTrace(); 
        } 
        //catch(
    }
    
     public char executeQueryForChar(String sqlQuery)
    {
        try { 
            Class.forName(DbStrings.JDBC_DRIVER);
            conn = (Connection) DriverManager.getConnection(DB_URL, DbStrings.USERNAME, DbStrings.PASSWORD);

            stmt = (Statement) conn.createStatement();
            char Result = stmt.executeQuery(sqlQuery);
            return Result;
        }

        catch(ClassNotFoundException e) { 
            System.out.println("No"); 
            e.printStackTrace(); 
        } 
        catch(SQLException e) { 
            System.out.println("SQL Exception: " + sqlQuery);
            e.printStackTrace(); 
        } 
        //catch(
    }
    
    public void executeInsert(String sqlQuery)
    {
        try { 
            Class.forName(DbStrings.JDBC_DRIVER);
            conn = (Connection) DriverManager.getConnection(DB_URL, DbStrings.USERNAME, DbStrings.PASSWORD);
            stmt = (Statement) conn.createStatement();
            stmt.executeQuery(sqlQuery);
        }

        catch(ClassNotFoundException e) { 
            System.out.println("No"); 
            e.printStackTrace(); 
        } 
        catch(SQLException e) { 
            System.out.println("SQL Exception: " + sqlQuery);
            e.printStackTrace(); 
        } 
    }
    
}
