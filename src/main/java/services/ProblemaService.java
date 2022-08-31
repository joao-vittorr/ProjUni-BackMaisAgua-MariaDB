package services;

import models.ProblemaModel;
import org.springframework.stereotype.Service;
import repositories.ProblemaRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProblemaService {

    final ProblemaRepository problemaRepository;

    public ProblemaService(ProblemaRepository problemaRepository) {
        this.problemaRepository = problemaRepository;
    }

    @Transactional
    public ProblemaModel save(ProblemaModel problemaModel) {
        return problemaRepository.save(problemaModel);
    }

    @Transactional
    public Optional<ProblemaModel> findById(Long id) {
        return problemaRepository.findById(id);
    }

    @Transactional
    public void delete(ProblemaModel problemaModel) {
        problemaRepository.delete(problemaModel);
    }
    @Transactional
    //public Page<ProblemaModel> findAll(Pageable pageable) { return problemaRepository.findAll(pageable); }

    public List<ProblemaModel> findAll( ) {
        return problemaRepository.findAll();
    }

}
