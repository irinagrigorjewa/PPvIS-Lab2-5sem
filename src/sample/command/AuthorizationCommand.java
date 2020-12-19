package sample.command;

public class AuthorizationCommand implements Command {
    private String email;
    private String password;

    AuthorizationCommand(String email, String password) {
        this.email = email;
        this.password = password;

    }

    ;

    @Override
    public void run() {


    }

    ;
}
