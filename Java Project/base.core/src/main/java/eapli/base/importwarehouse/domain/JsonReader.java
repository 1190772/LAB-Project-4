package eapli.base.importwarehouse.domain;

import java.io.IOException;

public interface JsonReader<T>{

    T parse(String filePath) throws IOException;

}
