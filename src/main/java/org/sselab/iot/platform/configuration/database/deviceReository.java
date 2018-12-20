package org.sselab.iot.platform.configuration.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface deviceReository extends JpaRepository<device,String> {
}
