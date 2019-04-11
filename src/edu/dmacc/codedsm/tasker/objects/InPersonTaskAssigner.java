package edu.dmacc.codedsm.tasker.objects;

public class InPersonTaskAssigner implements TaskAssigner {
    @Override
    public void TaskAssigner( User assignee, Integer priority ) {
        System.out.println("in InPersonTaskAssigner");
    }
}
