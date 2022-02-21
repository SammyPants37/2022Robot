package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.BallMotors;

public class collectorMotors extends CommandBase{
    
    public void execute() {
        BallMotors.runCollecor(Constants.collectorSpeed);
    }
}
