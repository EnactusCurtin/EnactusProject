
/**
 * Write a description of class UserProfile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User {
    private int userID;
    private String uFirstName;
    private String uLastName;
    private String securityAnswer;
    private String securityQuestion;
    private String password;
    private int uDayOfBirth;
    private int uMonthOfBirth;
    private int uYearOfBirth;
    private String uEmail;
    private int privileges;

    public User()
    {
    }

    public User(String uFN, String uLN, String uEmail )
    {
        setUFirstName(uFN);
        setULastName(uLN);
        setUEmail(uEmail);
    }

    /*
    public User(String uFN, String uLN, String secAns, String secQues, String password
    int uDOB, int uMOB, int uYOB, String uEmail, int privileges)
    {	
    uFirstName = setUFirstName(uFN);
    this.uLastName = setULastName(uLN);
    }
     */

    public int getUserID()
    {
        return userID;
    }

    public void setUserID(int inUserID)
    {
        userID = inUserID;
        //this.userID = userID;
    }

    public String getUFirstName()
    {
        return uFirstName;
    }

    public void setUFirstName(String inFN)
    {
        this.uFirstName = inFN;
    }

    public String getULastName()
    {
        return uLastName;
    }

    public void setULastName(String inLN)
    {
        this.uLastName = inLN;
    }

    public String getSecurityQuestion()
    {
        return securityQuestion;
    }

    public void setSecurityQuestion(String inSecQ)
    {
        this.securityQuestion = inSecQ;
    }

    public String getSecurityAnswer()
    {
        return securityAnswer;
    }

    public void setSecurityAnswer(String inAnsQ)
    {
        this.securityAnswer = inAnsQ;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String inPassword)
    {
        this.password = inPassword;
    }

    public int getUDayOfBirth()
    {
        return uDayOfBirth;
    }

    public void setUDayOfBirth(int inDOB)
    {
        this.uDayOfBirth = inDOB;
    }

    public int getUYearOfBirth()
    {
        return uYearOfBirth;
    }

    public void setUYearfBirth(int inYOB)
    {
        this.uYearOfBirth = inYOB;
    }

    public String getEmail()
    {
        return uEmail;
    }

    public void setUEmail(String inEmail)
    {
        this.uEmail = inEmail;
    }

    public int getPrivileges()
    {
        return privileges;
    }

    public void setPrivileges(int inPrivileges)
    {
        this.privileges = inPrivileges;
    }
}

