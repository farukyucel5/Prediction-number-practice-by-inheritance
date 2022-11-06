package Predict_number;

import java.util.Random;

public class Guess_number {
    /*
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.
     */
    private  int pick;

    public int getPick() {
        Random object=new Random();
        pick=object.nextInt(11);
        return pick;
    }

    public int guess_number(int guess)
    {
        if (guess==pick)
            return 0;
        else if (guess<pick)
            return 1;
        else
            return -1;

    }


}
