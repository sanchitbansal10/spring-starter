package learn.java.CoronaTracker.springBatchSample;

import org.springframework.batch.item.ItemProcessor;

// processor transforming the firstname lastname simply to upper case
public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(final Person person) {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName);

        return transformedPerson;
    }
}
