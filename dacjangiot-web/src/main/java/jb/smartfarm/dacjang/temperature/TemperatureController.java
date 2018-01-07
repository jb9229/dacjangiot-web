package jb.smartfarm.dacjang.temperature;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by test on 2017-07-11.
 */
@RestController
public class TemperatureController {
    @RequestMapping("tmp")
    String hello(){
        return "hello jinbeom";
    }
}
