package pl.pw.results.dsj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pw.results.dsj.controller.requestdata.Competition;

@RestController
@RequestMapping("/api/results")
@Slf4j
public class ResultsController {


    @PostMapping("/send")
    public void sendResult(@RequestBody Competition request) {

        log.info("przyjąłem");
    }
}
