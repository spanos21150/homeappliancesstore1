public class homeappliancesstore{
    //
    static String on;
    static String dief;
    static int up;
    public static String getOn() {
        return on;
    }
    public static void setOn(String on) {
        homeappliancesstore.on = on;
    }
    public static String getDief() {
        return dief;
    }
    public static void setDief(String dief) {
        homeappliancesstore.dief = dief;
    }
    public static int getUp() {
        return up;
    }
    public static void setUp(int up) {
        homeappliancesstore.up = up;
    }
    public static void main(String[]args){
        try{
            //companyname=args[0]
            homeappliancesstore.setOn(args[0]);
            //address=args[1]
            homeappliancesstore.setDief(args[1]);
            try {
                //employees=Integer.parseInt(args[2])
                homeappliancesstore.setUp(Integer.parseInt(args[2]));
                if(on == null ||dief == null) {
                    System.out.println("Error");
                }else{
                    System.out.println("to onoma einai: " + on);
                    System.out.println("h diefthinsh einai: " + dief);
                    System.out.println("oi ergazomenoi einai: " +up);
                }
            }catch(NumberFormatException e){
                System.out.println("not an int givens");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error not enough arguments givens");
        }}}
