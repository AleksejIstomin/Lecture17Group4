import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CrocodileTestLombok {

    CrocodileLombok crocodileMainigais = new CrocodileLombok();

    @Before
    public void setUp() {
        crocodileMainigais.setName("Crocodile");
        crocodileMainigais.setLength(1000);
        crocodileMainigais.setWeight(756.13);
        crocodileMainigais.setHungry(true);
    }

    @Test
    public void crocodileTest1() {
        assertThat(crocodileMainigais.getName()).isEqualTo("Crocodile");
        assertThat(crocodileMainigais.getLength()).isEqualTo(1000);
        assertThat(crocodileMainigais.getWeight()).isEqualTo(756.13);
        assertThat(crocodileMainigais.isHungry()).isTrue();
    }

    @After
    public void tearDown() {
        crocodileMainigais = null;
    }
}
