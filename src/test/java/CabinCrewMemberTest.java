import org.example.CabinCrewMember;
import org.example.Rank;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    private CabinCrewMember cabinCrewMember;
    private String message;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Holly", Rank.FIRSTOFFICER);
    }

    @Test
    public void canRelayMessageToPassenger() {
        message = "Please fasten your seatbelts";
        assertEquals(message, cabinCrewMember.relayMessageToPassenger(message));
    }
}
