package KalambaGames.KalambaGames;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class Controller {

    @Autowired
    private Service service;

    //post - add new data into database!

    @RequestMapping("/all")
    public void add(@RequestBody Modul modul){
        service.add(modul);
    }

    // you can show all posted values as list

    @GetMapping("/all")
    public List<Modul> listAll(){
        return service.showAll();
    }



}
