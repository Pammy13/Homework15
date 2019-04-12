package edu.dmacc.codedsm.tasker.objects;

import java.util.List;

public class PerformTaskAtOffice extends TaskPerformer {

    @Override
    public void performTask( Task task, User user ) {
        //super.performTask(task, user);
        System.out.println("performTaskAtOffice, performTask");
    }

}