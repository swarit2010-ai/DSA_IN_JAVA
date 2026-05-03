class Pro_07 {
    public static void main(String[] args) {
        int s1 = 7;
        int s2 = 11;
        int s3 = 15;
        int p = s1+s2+s3;
        double sp = p/2.0; 
        double ar = Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
        System.out.println("The perimeter is " + p + "cm");
        System.out.println("The area is " + ar + "cm\u00B2");
    }
}
