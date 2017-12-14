package backend.Controllers;

import backend.Entities.Band;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/first")
    public Band testRun(){
        Band band = new Band();
        band.setId(1);
        band.setMembers("Andriy");
        return band;
    }
}
