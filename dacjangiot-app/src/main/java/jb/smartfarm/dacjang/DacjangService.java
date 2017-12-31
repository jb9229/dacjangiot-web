package jb.smartfarm.dacjang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by test on 2017-10-15.
 */
@Service
public class DacjangService {

    @Autowired
    private DacjangRepository repository;

    public DacjangInfo get(Long id){
        return repository.findById(id).get();
    }

    public DacjangInfo update(DacjangInfo dacjangInfo){
        return repository.saveAndFlush(dacjangInfo);
    }
}
