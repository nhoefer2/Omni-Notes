package it.feio.android.utils;

import android.location.Location;
import android.test.InstrumentationTestCase;

import org.junit.Test;

import java.io.IOException;

import it.feio.android.omninotes.OmniNotes;
import it.feio.android.omninotes.utils.ConnectionManager;
import it.feio.android.omninotes.utils.GeocodeHelper;

public class GeocodeHelperTest extends InstrumentationTestCase {

    private final Double LAT = 43.799328;
    private final Double LON = 11.171552;

    @Test
    public void testGetAddressFromCoordinates() throws IOException {
        if (ConnectionManager.internetAvailable(OmniNotes.getAppContext())) {
            String address = GeocodeHelper.getAddressFromCoordinates(OmniNotes.getAppContext(), LAT, LON);
            assertTrue(address.length() > 0);
        }
    }
}