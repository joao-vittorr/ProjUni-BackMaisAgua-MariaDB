package services;

import models.FotosModel;
import org.springframework.stereotype.Service;
import repositories.FotosRepository;

@Service
public class FotosService {


    public FotosModel savePhoto(FotosModel fotosModel, String nome_foto) {
        return FotosRepository.save(fotosModel,nome_foto);
    }
}
