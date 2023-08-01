package ro.bcr.advanced;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class Junit5LifecycleTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("@BeforeAll is executed only at the beginning.");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("@AfterAll is executed at the of all tests");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("@BeforeEach is executed before every test.");
    }

    @AfterEach
    void afterEach(){
        System.out.println("@AfterEach is executed after every test");
    }

    @Test
    void testOne(){
        System.out.println("TEST ONE EXECUTED");
        assertThat(true).isTrue();
    }

    @Test
    void testTwo(){
        System.out.println("TEST TWO EXECUTED");
        assertThat(true).isTrue();
    }

    @Test
    @Disabled
    void testThree(){
        System.out.println("TEST THREE EXECUTED");
        assertThat(true).isTrue();
    }
}
