package ro.bcr.spring_context._4_qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FormatService {

    private Formatter formatter;

    public FormatService(@Qualifier("simple") Formatter formatter) {
        this.formatter = formatter;
    }

    public void format(){
        this.formatter.format();
    }
}
