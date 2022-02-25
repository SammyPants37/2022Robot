package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class BallMotors extends SubsystemBase{
    static Spark collector = new Spark(Constants.collector);
    static Spark conveyor = new Spark(Constants.conveyor);

    static Spark shooter = new Spark(Constants.shooter);

    static double speed = 0;

    static XboxController controller = new XboxController(0);

    public static void runCollecor() {
    // speed setting
        if (controller.getRawAxis(Constants.collectorSwich) >= Constants.joyMin |
            controller.getRawAxis(Constants.collectorSwich) <= -Constants.joyMin) {
            speed = controller.getRawAxis(Constants.collectorSwich);
        } else {
            speed = 0;
        }
        // speed maxing
    if (speed >= Constants.speedMax) {
      speed = Constants.speedMax;
    } else if (controller.getRightBumper()) {
        speed = -speed;
    }
    collector.set(speed);
    conveyor.set(speed);
    }

    public static void stopCollector() {
        collector.stopMotor();
        conveyor.stopMotor();
    }

    public static void runShooter(double speed) {
        shooter.set(speed);
    }

    public static void stopShooter() {
        shooter.stopMotor();
    }
}
