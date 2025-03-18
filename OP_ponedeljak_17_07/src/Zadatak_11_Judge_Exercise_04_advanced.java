public class Zadatak_11_Judge_Exercise_04_advanced {

    public static String moveForOnePlaceRight(char s){

        if(!Character.isLowerCase(s)) return s+"";

        if(s=='z') return "a";
        else return (char)((int)s+1)+"";

    }

    public static String moveForXPlacesRight(char s, int movingPlaces){

        if(!Character.isLowerCase(s)) return s+"";

        int valueForMoved=(int)s+movingPlaces;

        int valueForZ=(int)'z';

        if(!Character.isLowerCase(s)) return s+"";

        if(valueForMoved>valueForZ) return (char)((int)'a'+valueForMoved-valueForZ-1)+"";
        else return (char)valueForMoved+"";
    }



    public static void main(String[] args) {

        System.out.println(moveForXPlacesRight('a', 3));
        System.out.println(moveForXPlacesRight('b', 3));
        System.out.println(moveForXPlacesRight('c', 3));
        System.out.println(moveForXPlacesRight('x', 3));
        System.out.println(moveForXPlacesRight('y', 3));
        System.out.println(moveForXPlacesRight('z', 3));
        System.out.println(moveForXPlacesRight('1', 3));


    }
}
