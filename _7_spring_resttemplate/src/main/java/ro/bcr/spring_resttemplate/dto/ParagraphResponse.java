package ro.bcr.spring_resttemplate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParagraphResponse {
    private int totalLength;
    private String mostCommonWord;
}
