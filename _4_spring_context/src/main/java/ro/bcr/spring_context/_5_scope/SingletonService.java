package ro.bcr.spring_context._5_scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

// by default the scope of every bean/component etc is SINGLETON
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Service
public class SingletonService {

    public SingletonService() {
        System.out.println("SingletonService created.");
    }
}
