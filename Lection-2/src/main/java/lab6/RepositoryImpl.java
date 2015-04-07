package lab6;

/**
 * Created by Ольга on 07.04.2015.
 */
@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {

    @Override
    public void persistMessage(String message) {
        throw  new DatabaseException("Failed to save");
    }
}
