package _01_BigO;

public class BigO 
{
    /**
     * @desc Big O: Worst Case
     * 
     * Array arr [1, 2, 3, 4, 5, 6, 7]
     * 
     * Best Case (Omega): 1
     * Average Case (Theta): 4,
     * Worst Case (Big O): 7,
     */
    public static void example001()
    {

    }

    /**
     * @desc O(n)
     */
    public static void example002(int n)
    {
        for (int i = 0; i <= n; ++i)
        {
            System.out.println(i);
        }
    }

    /**
     * @desc Big O: Drop Constants
     * 
     * n + n = 2n
     * O(2n)
     */
    public static void example003(int n)
    {
        for (int i = 0; i <= n; ++i)
        {
            System.out.println(i);
        }

        for (int j = 0; j <= n; ++j)
        {
            System.out.println(j);
        }
    }

    /**
     * @desc Big O: O(n2)
     */
    public static void example004()
    {

    }
}
