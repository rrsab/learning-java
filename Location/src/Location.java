public class Location {
    public static int row;
    public static int column;
    public static double maxValue;

    public static Location locateLargest(double[][] a) {
        Location tmpLocation = new Location();
        maxValue = a[0][0];
        row = 0;
        column = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return tmpLocation;
    }
}
