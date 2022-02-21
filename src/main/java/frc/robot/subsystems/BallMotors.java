package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class BallMotors extends SubsystemBase{
    static Spark collector = new Spark(Constants.collector);
    static Spark conveyor = new Spark(Constants.conveyor);

    static Spark shooter = new Spark(Constants.shooter);

    public static void runCollecor(double speed) {
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
