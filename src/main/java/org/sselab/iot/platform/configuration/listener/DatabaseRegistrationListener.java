package org.sselab.iot.platform.configuration.listener;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.eclipse.leshan.core.observation.Observation;
import org.eclipse.leshan.server.registration.Registration;
import org.eclipse.leshan.server.registration.RegistrationListener;
import org.eclipse.leshan.server.registration.RegistrationUpdate;
import org.sselab.iot.platform.configuration.database.device;
import org.sselab.iot.platform.configuration.database.deviceReository;

import java.util.Collection;

@Slf4j
public class DatabaseRegistrationListener implements RegistrationListener {
  device registrationDevice = new device();
  deviceReository deviceReository;

  @Override
  public void registered(
    Registration registration,
    Registration previousRegistration,
    Collection<Observation> previousObservations
  ) {
    logger.trace("registration = {}", registration);
    logger.trace("previousRegistration = {}", previousRegistration);
    logger.trace("previousObservations = {}", previousObservations);
    registrationDevice.setID(registration.getId());
    deviceReository.save(registrationDevice);

    // TODO
  }

  @Override
  public void updated(
    RegistrationUpdate update,
    Registration updatedRegistration,
    Registration previousRegistration
  ) {
    logger.trace("update = {}", update);
    logger.trace("updatedRegistration = {}", updatedRegistration);
    logger.trace("previousRegistration = {}", previousRegistration);
    // TODO
  }

  @Override
  public void unregistered(
    Registration registration,
    Collection<Observation> observations,
    boolean expired, Registration newRegistration
  ) {
    logger.trace("registration = {}", registration);
    logger.trace("observations = {}", observations);
    logger.trace("newRegistration = {}", newRegistration);
    // TODO
  }

}
