package edu.dmacc.codedsm.tasker.objects;

public class EmailTaskAssigner implements TaskAssigner {
    @Override
    public void TaskAssigner( User assignee, Integer priority ) {
        System.out.println("in EmailTaskAssigner");
    }
}
