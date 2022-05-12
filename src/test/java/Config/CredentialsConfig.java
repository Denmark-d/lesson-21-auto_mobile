package Config;


import org.aeonbits.owner.Config;

@Config.Sources("classpath:Config/credentials.properties")
public interface CredentialsConfig extends Config {

    String user();

    String key();

    String app();

    String url();

}