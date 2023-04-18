public class KukuChecker
{

    public boolean validate(int ai[][])
    {
        if(ai == null || ai.length != 9 || ai[0].length != 9)
            return false;
        for(int i = 1; i <= 9; i++)
        {
            for(int j = 1; j <= 9; j++)
                if(ai[i - 1][j - 1] != i * j)
                    return false;
        }
        return true;
    }
}
