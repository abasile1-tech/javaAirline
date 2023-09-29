import org.example.Pilot;
import org.example.Rank;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class PilotTest {
    private Pilot pilot;
    @Before
    public void before() {
        pilot = new Pilot("Jenna", Rank.CAPTAIN, "2005467");
    }

    @Test
    public void canFlyThePlane() {
        assertEquals("I am flying the plane", pilot.flyThePlane());
    }

    @Test
    public void canGetName() {
        assertEquals("Jenna", pilot.getName());
    }
}
