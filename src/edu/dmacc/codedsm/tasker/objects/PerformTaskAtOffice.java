package edu.dmacc.codedsm.tasker.objects;

import java.util.List;

public class PerformTaskAtOffice extends TaskPerformer{

    @Override
    public void performTask( Task task, User user ) {
        //super.performTask(task, user);
        System.out.println("performTaskAtOffice, performTask");
    }

//    @Override
//    public void performTask( Task task, List<User> users ) {
//        super.performTask(task, users);
//    }
//
//    public PerformTaskAtOffice() {
//        super();
//    }
}
