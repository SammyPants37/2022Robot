package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class aton1 extends CommandBase{
    
    private boolean finished = false;
    

    public void execute() {
        RobotContainer.timer.reset();
        RobotContainer.timer.start();
        RobotContainer.stage = 0;
        finished = true;
        System.out.println("started");
    }

    public boolean isFinished() {
        return finished;
    }
}
