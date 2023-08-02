package ro.bcr.spring_context._2_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {

    @Autowired
    private SpellChecker spellChecker;

    private TextFormatter textFormatter;

    private ImageConverter imageConverter;

    public TextEditor(ImageConverter imageConverter) {
        this.imageConverter = imageConverter;
    }

    @Autowired
    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }

    public void format(){
        textFormatter.format();
    }

    public void convertImage(){
        imageConverter.convert();
    }

}
