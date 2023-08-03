package ro.bcr.spring_resttemplate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.bcr.spring_resttemplate.dto.ParagraphResponse;
import ro.bcr.spring_resttemplate.service.RestTemplateService;

@RestController
@RequestMapping("/bcr-api")
public class ParagraphController {

    private RestTemplateService service;

    public ParagraphController(RestTemplateService service) {
        this.service = service;
    }

    @GetMapping("/paragraph")
    public ResponseEntity<ParagraphResponse> getParagraphResp(@RequestParam int paragraphs){
        ParagraphResponse response = service.getParagraphResponse(paragraphs);
        return ResponseEntity.ok(response);
    }
}
