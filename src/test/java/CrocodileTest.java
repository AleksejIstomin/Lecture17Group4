import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CrocodileTest {
    Crocodile crocodileMainigais = new Crocodile();

    @Before
    public void setUp() {
        crocodileMainigais.setName("Crocodile");
        crocodileMainigais.setLenght(1000);
        crocodileMainigais.setWeight(756.13);
        crocodileMainigais.setHungry(true);
    }

    @Test
    public void CrocodileTest() {
        assertThat(crocodileMainigais.getName()).isEqualTo("Crocodile");
        assertThat(crocodileMainigais.getLenght()).isEqualTo(1000);
        assertThat(crocodileMainigais.getWeight()).isEqualTo(756.13);
        assertThat(crocodileMainigais.isHungry()).isTrue();
    }

    @After
    public void tearDown() {
        crocodileMainigais = null;
    }

}
