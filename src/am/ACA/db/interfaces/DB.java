package am.ACA.db.interfaces;

import java.util.List;


public interface DB<T> {
    void fileWriter(String path, T t);
    void removeFileArgument(String path, T t);
    void editFileArgument(String path, T t);
    List<T> fileReader(String path);
    void clearingFile(String path);

}
