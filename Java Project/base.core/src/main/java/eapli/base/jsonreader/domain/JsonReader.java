package eapli.base.jsonreader.domain;

public interface JsonReader<T>{

    T parse(String filePath);

}
