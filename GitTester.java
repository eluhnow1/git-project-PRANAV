import java.io.File;

public class GitTester {
    public static void main (String [] args){
        Git repo = new Git();

        //change if statement to delete or not to delete repository after code runs
        if (true)
            repo.deleteRepository();
    }
}
