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
     * @desc Big O: O(n²)
     * 
     * n * n = n²
     * O(n²)
     */
    public static void example004(int n)
    {
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < n; ++j)
            {
                System.out.println(i + " " + j);
            }
        }
    }
    
    /**
     * @desc Big O: Drop Non-Dominants
     * 
     * O(n²) + O(n) = O(n² + n)
     */
    public static void example005(int n)
    {
        // O(n²)
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < n; ++j)
            {
                System.out.println(i + " " + j);
            }
        }

        // O(n)
        for (int k = 0; k < 0; ++k)
        {
            System.out.println(k);
        }
    }

    /**
     * @desc Big O: O(1)
     */
    public static int addItems(int n)
    {
        return n + n;
    }
}
