package pl.pja.s28201.tpo_07.repository;

import org.springframework.stereotype.Repository;
import pl.pja.s28201.tpo_07.exception.CodeIdAlreadyExistsException;
import pl.pja.s28201.tpo_07.model.CodeFormat;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryCodeFormatRepository {

    private final Map<String, CodeFormat> codeFormats = new HashMap<>();

    public void add(CodeFormat code) throws CodeIdAlreadyExistsException {
        if (codeFormats.containsKey(code.getId()))
            throw new CodeIdAlreadyExistsException("The code with given id already exists.");
        System.out.printf("Info:: Successfully added [%s] to in memory db. %n", code);
        codeFormats.put(code.getId(), code);
    }

    public void addAll(Collection<CodeFormat> formats) {
        for (CodeFormat f : formats) {
            try {
                add(f);
            } catch (CodeIdAlreadyExistsException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void delete(String id) {
        codeFormats.remove(id);
        System.out.printf("Info::InMemoryDB:: Record with index [%s] has expired and was deleted.%n", id);
    }

    public List<CodeFormat> findAllAsList() {
        return codeFormats.values().stream().toList();
    }
}
