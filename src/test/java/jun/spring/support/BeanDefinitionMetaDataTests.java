package jun.spring.support;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.LookupOverride;
import org.springframework.beans.factory.support.ReplaceOverride;

public class BeanDefinitionMetaDataTests {


    private void setBaseProperties(AbstractBeanDefinition definition) {
        definition.setAbstract(true);
        definition.setAttribute("foo", "bar");
        definition.setAutowireCandidate(false);
        definition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
        definition.setDependencyCheck(AbstractBeanDefinition.DEPENDENCY_CHECK_OBJECTS);
        definition.setDependsOn(new String[]{"foo", "bar"});
        definition.setDestroyMethodName("destroy");
        definition.setEnforceDestroyMethod(false);
        definition.setEnforceInitMethod(true);
        definition.setFactoryBeanName("factoryBean");
        definition.setFactoryMethodName("factoryMethod");
        definition.setInitMethodName("init");
        definition.setLazyInit(true);
        definition.getMethodOverrides().addOverride(new LookupOverride("foo", "bar"));
        definition.getMethodOverrides().addOverride(new ReplaceOverride("foo", "bar"));
        definition.getPropertyValues().add("foo", "bar");
        definition.setResourceDescription("desc");
        definition.setRole(BeanDefinition.ROLE_APPLICATION);
        definition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        definition.setSource("foo");
    }

}
