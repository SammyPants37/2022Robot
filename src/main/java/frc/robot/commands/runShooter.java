package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.BallMotors;

public class runShooter extends CommandBase{
    
    public void execute() {
        BallMotors.runShooter(Constants.shooterSpeed);
    }
}
