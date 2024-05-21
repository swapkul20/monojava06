package com.techlabs.springannot;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "com.techlabs.springannot")
public class ApplicationConfig {

}
