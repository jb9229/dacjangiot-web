package jb.smartfarm.dacjang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * Created by test on 2017-10-14.
 */

@RestController
public class DacjangController {

    @Autowired DacjangService service;

    @GetMapping("dj")
    Mono<DacjangInfo> get() {

        DacjangInfo dj  =   service.get((long)0);

        return Mono.just(dj);
    }


    @PutMapping("dj/update/{ip}")
    Mono<DacjangInfo> updateIP(@PathVariable String ip) {

        DacjangInfo dj  =   service.get((long)0);

        if(ip == null || ip.isEmpty()){return Mono.just(dj);}

        dj.setPublicIp(ip);

        service.update(dj);

        return Mono.just(dj);
    }
}
