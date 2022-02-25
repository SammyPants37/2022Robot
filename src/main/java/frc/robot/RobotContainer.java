// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import frc.robot.commands.atonGroup;
import frc.robot.subsystems.BallMotors;
import frc.robot.subsystems.DriveTrain;

// import com.kauailabs.navx.frc.AHRS; // no gyro on protobot

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  public static Timer timer = new Timer();
  public static int stage = 0;
  public XboxController controller = new XboxController(0);

  private final BallMotors Balls = new BallMotors();

  final JoystickButton shooterSwich = new JoystickButton(controller, Constants.shooterChannel);
  // final JoystickButton collecterSwich = new JoystickButton(controller, Constants.collectorChannel);

  // public static AHRS gyro;

  //////////////
  // COMMANDS //
  //////////////

  // StartEndCommand collectRun = new StartEndCommand(
  //   () -> BallMotors.runCollecor(Constants.collectorSpeed),
  //   () -> BallMotors.stopCollector(),
  //   Balls);
  StartEndCommand shootRun = new StartEndCommand(
    () -> BallMotors.runShooter(Constants.shooterSpeed),
    () -> BallMotors.stopShooter(),
    Balls);

  //////////////////////
  // no more commands //
  //////////////////////

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    // collecterSwich.whileHeld(collectRun);
    shooterSwich.whileHeld(shootRun);
  }
  
  // public void zeroGyro() {
  //   gyro.reset();
  // }

  // public double getHeading() {
  //   return Math.IEEEremainder(gyro.getAngle(), 360) * (Constants.GyroInversed ? -1.0 : 1.0);
  // }

  public void doAton() {
    if (timer.get() < 1.0 & stage == 0) {
      DriveTrain.arcadeDrive(0.7, 0.0);
    } else if (timer.get() < 1.0 & stage == 1) {
      DriveTrain.arcadeDrive(0.0, 0.7);
    } else if (timer.get() < 1.0 & stage == 2) {
      DriveTrain.arcadeDrive(0.7, 0.0);
    } else {
      DriveTrain.stop(); // stop robot
      stage += 1;
      timer.reset();
    }
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return new atonGroup();
  }
}
