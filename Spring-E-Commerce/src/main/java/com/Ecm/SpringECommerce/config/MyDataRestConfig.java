package com.Ecm.SpringECommerce.config;

import com.Ecm.SpringECommerce.entity.Product;
import com.Ecm.SpringECommerce.entity.ProductCatagory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);

        HttpMethod[] theUnsopportAction={HttpMethod.DELETE,HttpMethod.PUT,HttpMethod.POST};
        //disable http method for product
                 config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsopportAction))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsopportAction));


                 //disable http method for productCatagory
                 config.getExposureConfiguration()
                .forDomainType(ProductCatagory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsopportAction))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsopportAction));
    }
}
