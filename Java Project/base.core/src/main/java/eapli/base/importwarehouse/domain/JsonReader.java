package eapli.base.importwarehouse.domain;

public interface JsonReader<T>{

    T parse(String filePath);

}
