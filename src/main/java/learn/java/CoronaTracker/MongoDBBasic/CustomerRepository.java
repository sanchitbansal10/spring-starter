package learn.java.CoronaTracker.MongoDBBasic;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

//CustomerRepository extends the MongoRepository interface and plugs in the type of values and ID that it works with: Customer and String, respectively. This interface comes with many operations, including standard CRUD operations (create, read, update, and delete).
//You can define other queries by declaring their method signatures. In this case, add findByFirstName, which essentially seeks documents of type Customer and finds the documents that match on firstName.

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}