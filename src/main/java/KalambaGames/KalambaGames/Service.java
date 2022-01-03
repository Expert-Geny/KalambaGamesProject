package KalambaGames.KalambaGames;

import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private  MainRepository repo;

    public void add(Modul modul){
        repo.save(modul);
    }

    public List<Modul> showAll(){
        return repo.findAll();
    }

}
