package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class aton2 extends CommandBase{
    
    public void execute() {
        if (RobotContainer.timer.get() < 1.0 & RobotContainer.stage == 0) {
            DriveTrain.arcadeDrive(0.0, 0.5);
          } else if (RobotContainer.timer.get() < 1.0 & RobotContainer.stage == 1) {
            DriveTrain.arcadeDrive(0.5, 0.0);
          } else if (RobotContainer.timer.get() < 1.0 & RobotContainer.stage == 2) {
            DriveTrain.arcadeDrive(0.0, 0.5);
          } else {
            DriveTrain.stop(); // stop robot
            RobotContainer.stage += 1;
            RobotContainer.timer.reset();
          }
    }

    public boolean isFinished() {
        return RobotContainer.stage == 3;
    }
}
