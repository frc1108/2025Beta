// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.logging;

import com.revrobotics.spark.SparkMax;

import edu.wpi.first.epilogue.CustomLoggerFor;
import edu.wpi.first.epilogue.logging.ClassSpecificLogger;
import edu.wpi.first.epilogue.logging.DataLogger;

/** Add your docs here. */
@CustomLoggerFor(SparkMax.class)
public class SparkMaxLogger extends ClassSpecificLogger<SparkMax> {
    public SparkMaxLogger() {
        super(SparkMax.class);
    }
    @Override
    protected void update(DataLogger dataLogger, SparkMax object) {
        dataLogger.log("spark/position",object.getEncoder().getPosition());
        dataLogger.log("spark/velocity",object.getEncoder().getVelocity());
    }
}
