public class Pro_23 {
    public static void main(String[] args) {
        int total_dist = 5350;
        int bus_dis = total_dist-1070;
        int km = bus_dis/1000;
        int m = bus_dis%1000;
        System.out.println("The distance travelled in bus is " + km + " km and " + m + " m");
    }
}