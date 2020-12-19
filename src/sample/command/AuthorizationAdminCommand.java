package sample.command;

public class AuthorizationAdminCommand implements Command {
    private String login;
    private String password;
    AuthorizationAdminCommand(String login,String password){
        this.login=login;
        this.password=password;
    }
    public void handleEvent(){

    }

    public void onConfirmAdminButton(){}

    @Override
    public void run() {

    }
}
