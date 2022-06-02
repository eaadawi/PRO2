import bryghus.Produkt;
import bryghus.Salg;
import cannibal.CircularCannibalMeal;
import cannibal.Person;
import deque.CircularArrayDeque;
import deque.DequeI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class CannibalTest
{
    private CircularCannibalMeal ccm;

    private Person p1;
    private Person p2;
    private Person p3;
    private Person p4;
    private Person p5;

    @BeforeEach
    void setUp() throws Exception {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        ccm = new CircularCannibalMeal();

        p1 = new Person("1");
        p2 = new Person("2");
        p3 = new Person("3");
        p4 = new Person("4");
        p5 = new Person("5");
    }

    @Test
    @Order(1)
    void test_ccm_canEatRandomPerson() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        ccm.addPerson(p1);
        ccm.addPerson(p2);
        ccm.addPerson(p3);

        ccm.eatRandomPerson();
        ccm.eatRandomPerson();
        ccm.eatRandomPerson();

        assertThrows(NoSuchElementException.class, () -> {
            ccm.eatRandomPerson();
        });
    }

    @Test
    @Order(2)
    void test_ccm_canEatNextPerson() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        ccm.addPerson(p1);
        ccm.addPerson(p2);
        ccm.addPerson(p3);
        ccm.addPerson(p4);
        ccm.addPerson(p5);

        Person person1 = ccm.eatNextPerson(1);
        assertEquals(p5, person1);
        Person person2 = ccm.eatNextPerson(2);
        assertEquals(p3, person2);
        Person person3 = ccm.eatNextPerson(4);
        Person person4 = ccm.eatNextPerson(4);
        Person person5 = ccm.eatNextPerson(4);

        assertThrows(NoSuchElementException.class, () -> {
            ccm.eatNextPerson(1);
        });
    }

    @Test
    @Order(3)
    void test_ccm_canPrintPersons() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        ccm.printPersons();
        ccm.addPerson(p1);
        ccm.printPersons();
        ccm.addPerson(p2);
        ccm.printPersons();
    }

}
