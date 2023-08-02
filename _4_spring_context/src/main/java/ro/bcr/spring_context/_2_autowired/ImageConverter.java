package ro.bcr.spring_context._2_autowired;

import org.springframework.stereotype.Component;

@Component
public class ImageConverter {

    public ImageConverter() {
        System.out.println("ImageConverter created");
    }

    public void convert(){
        System.out.println("convert...");
    }
}
