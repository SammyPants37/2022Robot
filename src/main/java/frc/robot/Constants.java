// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static int FLM = 3; //check
    public static int BLM = 2; //check
    public static int FRM = 1; //check
    public static int BRM = 0; //check

    public static int collector = 8;
    public static int shooter = 7;
    public static int conveyor = 6;

    public static double collectorSpeed = 0.7;
    public static double shooterSpeed = 1.0;

    public static double joyMin = 0.1;
    public static double speedMax = 0.9;
    public static int rotChannel = 4;
    public static int speedChannel = 1;

    public static boolean GyroInversed = false;
}