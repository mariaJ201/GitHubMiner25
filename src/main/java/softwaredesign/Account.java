package softwaredesign;
import org.kohsuke.github.*;


public class Account {
    public String name;
    private String password;
    public String token;
    public Boolean login(String password){
        return true;
    }

    public int addRepo() {
        String repoName = UserConsole.getInput("Enter the repository name: ", null);
        String repoOwner = UserConsole.getInput("Enter the repository's owner: ",  null);

        // TODO: instantiate new Repo class
        return 0;
//        return (Repository.clone()) ? 1 : 0;
    }

    protected void setToken() {
        String newToken = UserConsole.getInput("Enter a token: ", null);

        if (!isTokenValid(newToken)) {
            // TODO: change output format
            System.out.println("Token " + newToken + " is invalid. Please try again.");
            return;
        }

        this.token = token;
    }

    protected boolean isTokenValid(String newToken) {
        boolean isValid = false;

        try {
            isValid = GitHub.connectUsingOAuth(newToken).isCredentialValid();
        } catch (Exception e) {
            // TODO: this seems like nonsense
            System.out.println("bleh.");
        }
        return isValid;
    }
}
