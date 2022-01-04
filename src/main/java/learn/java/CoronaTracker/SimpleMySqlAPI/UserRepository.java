package learn.java.CoronaTracker.SimpleMySqlAPI;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
// The repository connects to db and do CRUD operations
// Any custom action can be added

public interface UserRepository extends CrudRepository<User, Integer> {

}