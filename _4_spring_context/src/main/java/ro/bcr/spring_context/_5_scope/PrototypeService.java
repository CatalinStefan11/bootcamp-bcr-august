package ro.bcr.spring_context._5_scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Service
public class PrototypeService {

    public PrototypeService() {
        System.out.println("PrototypeService created");
    }
}
