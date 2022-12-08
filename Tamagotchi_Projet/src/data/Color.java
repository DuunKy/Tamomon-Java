package data;

public class Color {

    public static void DynamicColorUp(int critique, int normal, int good, int target) {
        // 0 is Critique

        if (target <= critique) {
            System.out.println(ColorBase.RED + target + ColorBase.RESET);
        } else if (target <= normal && target > critique) {
            System.out.println(ColorBase.YELLOW + target + ColorBase.RESET);
        } else if (target <= good && target > normal) {
            System.out.println(ColorBase.GREEN + target + ColorBase.RESET);
        } else {
            System.out.println(ColorBase.RESET + target + ColorBase.RESET);
        }
    }

    public static void DynamicColorDown(int critique, int normal, int good, int target) {
        // 0 is Good

        if (target >= critique) {
            System.out.println(ColorBase.RED + target + ColorBase.RESET);
        } else if (target >= normal && target < critique) {
            System.out.println(ColorBase.YELLOW + target + ColorBase.RESET);
        } else if (target <= good) {
            System.out.println(ColorBase.GREEN + target + ColorBase.RESET);
        } else {
            System.out.println(ColorBase.RESET + target + ColorBase.RESET);
        }
    }

}
