
/**
 * Write a description of class Magpie2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magpie2
{
  

    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0
                || statement.indexOf("bird") >= 0
                || statement.indexOf("hamster") >= 0)
        {
                response = "Tell me more about your pets.";
        }
        else
        {
            response = getRandomResponse();
        } 
        if (statement.indexOf("Mr.") >=0) {
            response = "He sounds like a good teacher";
        }
        else if (statement.indexOf("Mrs.") >=0) {
            response = "She sounds like a good teacher";
        }
        else 
        {
            response = getRandomResponse();
        }
        if (statement.indexOf("sure") >=0) {
            response = "Are you sure?";
        }
        if (statement.indexOf("good") >=0) {
         response = "Glad everything's good";   
        }
        if (statement.indexOf("family") >=0) {
         response = "Tell me more about your family";   
        }
       
        String strtrim = statement.trim();
        if (strtrim.length() == 0) {
         response = "Please say something";   
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "What?";
        }
        else if (whichResponse == 5)
        {
            response = "Please repeat that";
        }

        return response;
    }
}




