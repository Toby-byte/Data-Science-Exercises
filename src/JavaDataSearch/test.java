package JavaDataSearch;

import Java_working_with_files.Movies;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static boolean findUser(ArrayList<User> ArrayListWithUsers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what name would like to search for");
        String userAnswer = scanner.nextLine();
        for (int i = 0; i <ArrayListWithUsers.size() ; i++) {
            if (ArrayListWithUsers.get(i).getUsername().equalsIgnoreCase(userAnswer)) {
                System.out.println(ArrayListWithUsers.get(i));
                System.out.println("user found!");
                return true;
            }
        }
        System.out.println("user could not be found");
        return false;
    }

    public static void main(String[] args) {
        ArrayList<User> ArrayOfUsers = new ArrayList<>();
        User firstUser = new User("Tobias","password");
        User secoundUser = new User("Nikolaj","password");
        User thirdUser = new User("fredrik","password");
        User fourthUser = new User("elvis","password");
        User fithUser = new User("simon","password");
        User sixUser = new User("benjamin","password");
        User sevenUser = new User("blakie","password");
        User eightUser = new User("maiken","password");
        User nineUser = new User("frank","password");
        User tenUser = new User("nicolas","password");

        ArrayOfUsers.add(firstUser);
        ArrayOfUsers.add(secoundUser);
        ArrayOfUsers.add(thirdUser);
        ArrayOfUsers.add(fourthUser);
        ArrayOfUsers.add(fithUser);
        ArrayOfUsers.add(sixUser);
        ArrayOfUsers.add(sevenUser);
        ArrayOfUsers.add(eightUser);
        ArrayOfUsers.add(nineUser);
        ArrayOfUsers.add(tenUser);

        findUser(ArrayOfUsers);
    }


}
