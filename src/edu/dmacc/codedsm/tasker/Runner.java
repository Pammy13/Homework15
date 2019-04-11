package edu.dmacc.codedsm.tasker;

import edu.dmacc.codedsm.tasker.objects.*;

public class Runner {

    public static void main( String[] args ) {
        System.out.println("Starting runner...");
        TaskAssigner emailTaskAssigner = new EmailTaskAssigner();
        TaskAssigner inPersonTaskAssigner = new InPersonTaskAssigner();
        TaskAssigner onThePhoneTaskAssigner = new OnThePhoneTaskAssigner();

        User user = new User("Greg", "Hudgens", "555");

        emailTaskAssigner.TaskAssigner(user, 1);
        inPersonTaskAssigner.TaskAssigner(user, 2);
        onThePhoneTaskAssigner.TaskAssigner(user, 3);

        Task task = new Task("A", 1,user,user);


        TaskPerformer performDeligationTask = new PerformDeligationTask();
        TaskPerformer performTaskAtOffice = new PerformTaskAtOffice();
        TaskPerformer performTaskInPerson = new PerformTaskInPerson();

        performDeligationTask.performTask(task,user);
        performTaskAtOffice.performTask(task,user);
        performTaskInPerson.performTask(task,user);





    }


}
