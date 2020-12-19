package sample;

import sample.command.*;
import sample.view.*;

public class Injector {
    Protester protester = new Protester();
    Map map = new Map();
    Rally rally = new Rally();
    SpecialServices specialServices = new SpecialServices();
    Admin admin = new Admin();
    BasicInformation basicInformation = new BasicInformation();
    StartWindow startWindow = new StartWindow();
    AuthorizationAdminWindow authorizationAdminWindow = new AuthorizationAdminWindow();
    AuthorizationWindow authorizationWindow = new AuthorizationWindow();
    CreateRouteWindow createRouteWindow = new CreateRouteWindow();
    RegistrationWindow registrationWindow = new RegistrationWindow();
    PasswordRecoveryWindow passwordRecoveryWindow = new PasswordRecoveryWindow();
    ProtesterWindow protesterWindow = new ProtesterWindow();
    MapWindow mapWindow = new MapWindow();
    CreateRallyWindow createRallyWindow = new CreateRallyWindow();
    AddProtesterToOrganizerWindow addProtesterToOrganizerWindow = new AddProtesterToOrganizerWindow();

    AuthorizationOrganizerWindow authorizationOrganizerWindow = new AuthorizationOrganizerWindow();
    AdminWindow adminWindow = new AdminWindow();
    AddBasicInformationWindow addBasicInformationWindow = new AddBasicInformationWindow();
    MarkSpecialServicesWindow markSpecialServicesWindow = new MarkSpecialServicesWindow();
    ChangeRallyLocationWindow changeRallyLocationWindow = new ChangeRallyLocationWindow();
    CreateRallyCommand createRallyCommand = new CreateRallyCommand();
    ShowMapCommand showMapCommand = new ShowMapCommand();
    AuthorizationOrganizerCommand authorizationOrganizerCommand=new AuthorizationOrganizerCommand();
    CreateRouteCommand createRouteCommand = new CreateRouteCommand();
    AddBasicInformationCommand addBasicInformationCommand=new AddBasicInformationCommand();
    AddProtesterToOrganizerCommand addProtesterToOrganizerCommand=new AddProtesterToOrganizerCommand();
    ShowBasicInformationCommand showBasicInformationCommand = new ShowBasicInformationCommand();

    void createUI() {

    }
}
