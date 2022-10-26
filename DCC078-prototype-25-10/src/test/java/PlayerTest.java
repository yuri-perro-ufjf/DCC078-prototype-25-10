import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void shouldBeCompareClone() throws CloneNotSupportedException{
        Player player = new Player("ultraPower", 100, 50);

        Player playerClone = player.clone();
        playerClone.setName("cloneUltraPower");
        playerClone.setDamage(200);

        assertEquals("Player{ Name: ultraPower / HP: 100.0 / Damage: 50 }", player.toString());
        assertEquals("Player{ Name: cloneUltraPower / HP: 100.0 / Damage: 200 }", playerClone.toString());
    }
}