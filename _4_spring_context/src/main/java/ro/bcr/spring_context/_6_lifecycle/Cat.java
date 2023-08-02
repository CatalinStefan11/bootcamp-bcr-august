package ro.bcr.spring_context._6_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat  {

    public Cat(){
        System.out.println("Cat is creating!");
    }

    // this is executed after the bean is created
    // after constructor is called
    // alternative to this is to implement interface InitializingBean
    @PostConstruct
    public void init(){
        System.out.println("Cat was created...");
    }

    // this method is executed as a consequence of closing the context
    // (context implements autocloseable which triggers this shutdown hooks)
    // alternative to this is to implement interface DisposableBean
    @PreDestroy
    public void destroy(){
        System.out.println("Cat is destroying");
    }

    public void sawMeow(){
        System.out.println("Meow!");
    }

}
