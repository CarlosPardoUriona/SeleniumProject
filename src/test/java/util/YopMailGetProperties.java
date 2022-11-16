package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class YopMailGetProperties {
    private static YopMailGetProperties getProperties= null;
    private String aliasEmail;
    private String browser;
    private String host;
    /*private String user;
    private String pwd;*/

    private YopMailGetProperties(){
        Properties properties = new Properties();
        String nameFile="yopmail.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if(inputStream!= null){
            try {
                properties.load(inputStream);
                browser=properties.getProperty("browser");
                aliasEmail=properties.getProperty("aliasEmail");
                host=properties.getProperty("host");
                /*user=properties.getProperty("user");
                pwd=properties.getProperty("pwd");
*/
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static YopMailGetProperties getInstance(){
        if (getProperties == null)
            getProperties=new YopMailGetProperties();
        return getProperties;
    }

    public String getAliasEmail() {
        return aliasEmail;
    }
    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

   /* public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }*/
}
