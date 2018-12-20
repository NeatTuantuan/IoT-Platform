package org.sselab.iot.platform.configuration.database;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Data
@Entity
public class device {
  @Id
  @GeneratedValue
  private String ID;
  private String objectID;
  private String objectInstanceID;

  public device(){}

}
