interface Worker{
    void work();
}

interface Manager{
    void manage();

    public static void meet(){
        System.out.println("Organises meeting..");
    }
}

class Developer implements Worker{

    public void work() {
       System.out.println("Developer is coding..."); 
    }
}

class TeamManager implements Worker, Manager{

    public void manage() {
        System.out.println("Manager is managing the team");
    }


    public void work() {
        System.out.println("Manager is working");
    }

    
}

public class InterfaceBasicExample {
    public static void main(String[] args) {
        Developer dev=new Developer();
        dev.work();

        TeamManager tm=new TeamManager();
        tm.work();
        tm.manage();

        Manager.meet();
    }
}
