public class maximum_number_between_three_number {
    public static void main(String[] var0) {
        byte var1 = 1;
        byte var2 = 2;
        byte var3 = 3;
        if (var1 > var2 && var1 > var3) {
           System.out.println("" + var1 + "is the maximum between" + var1 + "," + var2 + ",and" + var3);
        } else if (var2 > var1 && var2 > var3) {
           System.out.println("" + var2 + "is the maximum between" + var1 + "," + var2 + ",and" + var3);
        } else if (var3 > var1 && var3 > var2) {
           System.out.println("" + var3 + "is the maximum between" + var1 + "," + var2 + ",and" + var3);
        }
  
     }
}
