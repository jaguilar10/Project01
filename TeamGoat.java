package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.AguilarMember;


public class TeamGoat extends Team {

        public TeamGoat(String name)
        {
            super(name);
            createTeamMembers();
        }

        public void createTeamMembers()
        {
            members.add(new AguilarMember("Jorge Aguilar"));

            // create a new member class for each team member
            // and add it to the team members list
        }
    }

