package ch.zhaw.pm3.helpy.model.location;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Model which holds information for location data in Helpy
 */
@Data
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int plz;
    private String canton;
    private String geolocation;
}
