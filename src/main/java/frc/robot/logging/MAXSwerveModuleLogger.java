// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.logging;

import frc.robot.subsystems.MAXSwerveModule;
import edu.wpi.first.epilogue.CustomLoggerFor;
import edu.wpi.first.epilogue.logging.ClassSpecificLogger;
import edu.wpi.first.epilogue.logging.DataLogger;
import edu.wpi.first.math.kinematics.SwerveModuleState;

/** Add your docs here. */
@CustomLoggerFor(MAXSwerveModule.class)
public class MAXSwerveModuleLogger extends ClassSpecificLogger<MAXSwerveModule> {
    public MAXSwerveModuleLogger() {
        super(MAXSwerveModule.class);
    }
    @Override
    protected void update(DataLogger dataLogger, MAXSwerveModule object) {
        dataLogger.log("mod/state",object.getState(),SwerveModuleState.struct);
    }
}
