package ro.bcr.spring_resttemplate.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import ro.bcr.spring_resttemplate.dto.ParagraphApiResponse;
import ro.bcr.spring_resttemplate.dto.ParagraphResponse;
import ro.bcr.spring_resttemplate.util.AppConstants;

import java.util.HashMap;
import java.util.Map;

@Service
public class RestTemplateService {

    private RestTemplate restTemplate;

    public RestTemplateService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ParagraphResponse getParagraphResponse(int numberOfParagraphs){
        UriComponentsBuilder builder =
                UriComponentsBuilder.fromHttpUrl(AppConstants.API_PARAGRAPH_URL)
                .queryParam("paragraphs", numberOfParagraphs);

        ResponseEntity<ParagraphApiResponse> response =
                restTemplate.getForEntity(builder.toUriString(), ParagraphApiResponse.class);

        return processRequestFromApi(response.getBody());
    }

    public ParagraphResponse processRequestFromApi(ParagraphApiResponse response){
        String text = response.getText();

        // this regular expression represents one or more whitespace characters
        String[] words = text.split("\\s+");

        Map<String, Integer> wordFreqMap = new HashMap<>();

        String mostCommonWord = "";
        int maxFrequency = 0;
        int totalLength = 0;

        for (var w : words){

            // we want to sanitize the text to eliminate the dots, punctuation marks etc.
            w = w.toLowerCase().replaceAll("[^a-zA-Z]", "");
            if(!w.isEmpty()){
                wordFreqMap.put(w, wordFreqMap.getOrDefault(w, 0) + 1);
                totalLength++;
            }
        }

        for(var pair : wordFreqMap.entrySet()){
            if(pair.getValue() > maxFrequency){
                maxFrequency = pair.getValue();
                mostCommonWord = pair.getKey();
            }
        }

        return new ParagraphResponse(totalLength, mostCommonWord);
    }

}
