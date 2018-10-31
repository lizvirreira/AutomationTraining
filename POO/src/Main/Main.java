package Main;

import java.util.ArrayList;
import Team.Coach;
import Team.TeamSoccer;

public class Main {

    // ArrayList of objects Soccer Selection. Regardless of the daughter class to which the object belongs
    public static ArrayList<TeamSoccer> members = new ArrayList<TeamSoccer>();

    public static void main(String[] args) {

        TeamSoccer delBosque = new Coach(1, "Vicente", "Del Bosque", 60, 28489);

        members.add(delBosque);

        // CONCENTRACION
        System.out.println("All the members begin a concentration. (Everyone executes the same method)");
        for (TeamSoccer members : members) {
            System.out.print(members.getName() + " " + members.getLastName() + " -> ");
            members.concentrate();
        }

        // Travel the executes the same method
        System.out.println("\nAll members travel to play a game. (Everyone executes the same method)");
        for (TeamSoccer members : members) {
            System.out.print(members.getName() + " " + members.getLastName() + " -> ");
            members.travel();
        }

        // Training the executes the same method
        System.out.println("\nTraining: All the members have their function in a training (Especialization)");
        for (TeamSoccer members : members) {
            System.out.print(members.getName() + " " + members.getLastName() + " with Age: " + delBosque.getAge() + " -> ");
            members.practice();
        }

        // Plan Training the executes the training
        System.out.println("\nPlan Training: Only the coach has the method to plan a workout:");
        System.out.print(delBosque.getName() + " " + delBosque.getLastName() + " -> ");
        ((Coach) delBosque).PlanTraining();

    }
}
