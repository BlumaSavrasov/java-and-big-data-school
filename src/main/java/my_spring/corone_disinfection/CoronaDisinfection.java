package my_spring.corone_disinfection;

import my_spring.InjectByType;


public class CoronaDisinfection {
    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room){
        announcer.announce("The disinfection starts, please clear the room!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("You can come back,the room was successfully disinfected");
    }
    private void disinfect(Room room) {
        System.out.println("Evaluates the disinfection");
    }
}
