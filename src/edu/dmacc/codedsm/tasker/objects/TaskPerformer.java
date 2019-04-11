package edu.dmacc.codedsm.tasker.objects;

import java.util.List;

public class TaskPerformer {

    public void performTask (Task task, User user){
        System.out.println("in super class Task Performer Method Perform Task");
}
    public void performTask( Task task, List<User>users){
        System.out.println("in super class Task Performer Method Perform Task");
    }

}