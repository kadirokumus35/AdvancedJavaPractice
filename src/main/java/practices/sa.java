package practices;

public class sa {
    public static void main(String[] args) {

        //2) Create 3 String variables for people's names. Print the sum of the number of characters in
        //   all the 3 names except space characters.
        //   Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console
        String name1=" Be@yz a";
        String name2=" Se12 na  ";
        String name3=" Ab@ el ";
        int n1=name1.trim().replaceAll("[^a-zA-Z ]", "").replaceAll("\\W","").length();
        System.out.println(n1);
        int n2=name2.trim().replaceAll("[^a-zA-Z ]", "").replaceAll("\\W","").length();
        System.out.println(n2);
        int n3=name3.trim().replaceAll("[^a-zA-Z ]", "").replaceAll("\\W","").length();
        System.out.println(n3);
        System.out.println(n1+n2+n3);



        String city="   @ mi 1A mi1 23 ";
        String updatedCity=city.trim().toLowerCase().replaceAll("[^a-zA-Z]","");
        System.out.println(updatedCity.substring(0, 1).toUpperCase()+updatedCity.substring(1).toLowerCase());
    }
}
