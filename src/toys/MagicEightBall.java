package toys;

import java.util.Random;

public class MagicEightBall
{
    private static final Random RANDOM = new Random();

    private String[] sides;
    private int messageIndex;

    public MagicEightBall(String[] sides, int messageIndex)
    {
        this.sides = sides;
        this.messageIndex = messageIndex;
    }
    
    public String changeMessage()
    {
        //pick a random message index
        messageIndex = RANDOM.nextInt(sides.length);

        //return the message
        return sides[messageIndex];
    }
    
    public String[] changeMessage(int times)
    {
        String[] results = new String[times];
        for (int i = 0; i < results.length; i++)
        {
            results[i] = changeMessage();
        }
        return results;
    }

    public String[] getSides()
    {
        return sides;
    }

    public void setSides(String[] sides)
    {
        this.sides = sides;
    }

    public int getMessageIndex()
    {
        return messageIndex;
    }

    public void setMessageIndex(int messageIndex)
    {
        this.messageIndex = messageIndex;
    }

    public String toString()
    {
        String message = sides[messageIndex];
        return "Magic Eight Ball - " + message;
    }
}
