class Geometry {
    public static void main(String[] args){
        int sides = 7;
        int radius = 5;

        final double pi = 3.14159265359;
        int c;
        int a = 50;
        int b = 6;
        double x = 40.0;
        double y = 6.0;


        System.out.println("A Heptagon has "+sides+" sides.");
        System.out.println("A Decagon has "+(sides + 3)+" sides.");
        System.out.println("A Dodecagon has "+ (sides + 5)+ " sides.");
        System.out.println("The circumference of a circle with a radius of " +
            radius + " is " + (2*pi*radius) + ".");
    }
}
