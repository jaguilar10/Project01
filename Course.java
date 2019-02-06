package Project00;

import java.util.ArrayList;
import Project00.TeamCool;
import Project00.Member;
import Project00.TeamGoat;

public class Course
{
    ArrayList<Team> teams = new ArrayList<>();

    public Course()
    {

    }


    public void printCourseMembers()
    {
        for(int i = 0; i < teams.size(); i++)
        {
            System.out.println(teams.get(i).getTeamName());
            teams.get(i).printTeamMembers();
            System.out.println("\n");
        }
    }


    public void createTeams()
    {
       teams.add(new TeamGoat("Team Goat"));
        // create each new team and add to team list;
        // Repository owner will do this.
    }

}

