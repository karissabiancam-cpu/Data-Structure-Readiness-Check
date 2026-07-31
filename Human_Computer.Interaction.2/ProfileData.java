public class ProfileData {

    // function to store all the details in variables
    public static String[] getProfileData() {
        String[] data = new String[6];

        data[0] = "Karissa Bianca Mallo / Ris";
        data[1] = "02/14/2007";
        data[2] = "Brgy. Guinobatan, New Lucena";
        data[3] = "Same Ground / Kitchie Nadal";
        data[4] = "My family and to become successful";
        data[5] = "friends, teachers, study materials, quiet space, encouragement";

        return data;
    }

    // function to print the formatted layout
    public static void displayProfile(String[] info) {
        System.out.println("both 🐶🐶🐶 and 🐱🐱🐱");

        // precise manual spacing for flawless alignment
        System.out.println("Name       : " + info[0]);
        System.out.println("Birthday   : " + info[1]);
        System.out.println("Address    : " + info[2]);
        System.out.println("Fav Song   : " + info[3]);
        System.out.println("Motivation : " + info[4]);
        System.out.println("Support    : " + info[5]);
    }

    public static void main(String[] args) {
        // get the data from the first function
        String[] profileDetails = getProfileData();

        // pass the data to the second function to print it
        displayProfile(profileDetails);
    }
}