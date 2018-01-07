package jb.smartfarm.dacjang;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by test on 2017-10-14.
 */

@Entity(name="info")
@Data
public class DacjangInfo {
    @Id
    @GeneratedValue
    private Long id;

    private String publicIp;

    private String location;
}
