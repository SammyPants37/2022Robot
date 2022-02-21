package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BallMotors;

public class stopCollectorMotors extends CommandBase{
    
    public void execute() {
        BallMotors.stopCollector();
    }
}
