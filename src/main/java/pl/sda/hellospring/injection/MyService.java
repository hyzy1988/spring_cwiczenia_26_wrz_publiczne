package pl.sda.hellospring.injection;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyService {
    public final MyRepo myRepo;
    public MyService(MyRepo myRepo) {
        this.myRepo = myRepo;
        log.info("pl.sda.hellospring.injection.MyService");
    }
}
