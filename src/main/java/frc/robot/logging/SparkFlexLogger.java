// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.logging;

import com.revrobotics.spark.SparkFlex;
import edu.wpi.first.epilogue.CustomLoggerFor;
import edu.wpi.first.epilogue.logging.ClassSpecificLogger;
import edu.wpi.first.epilogue.logging.DataLogger;

/** Add your docs here. */
@CustomLoggerFor(SparkFlex.class)
public class SparkFlexLogger extends ClassSpecificLogger<SparkFlex> {
    public SparkFlexLogger() {
        super(SparkFlex.class);
    }
    @Override
    protected void update(DataLogger dataLogger, SparkFlex object) {
        dataLogger.log("spark/position",object.getEncoder().getPosition());
        dataLogger.log("spark/velocity",object.getEncoder().getVelocity());
    }
}
