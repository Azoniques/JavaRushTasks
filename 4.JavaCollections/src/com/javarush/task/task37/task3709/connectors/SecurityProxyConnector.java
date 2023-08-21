package com.javarush.task.task37.task3709.connectors;

import com.javarush.task.task37.task3709.security.SecurityChecker;
import com.javarush.task.task37.task3709.security.SecurityCheckerImpl;

public class SecurityProxyConnector implements Connector{
    SimpleConnector simpleConnector;
    SecurityChecker securityChecker = new SecurityCheckerImpl();
    @Override
    public void connect() {
        System.out.println("Performing security check...");

        if(securityChecker.performSecurityCheck()){
            simpleConnector.connect();
        }else{
            System.out.println("FAILED Security check, won't connect.");
        }

    }

    public SecurityProxyConnector(String s) {
        this.simpleConnector = new SimpleConnector(s);
    }
}
