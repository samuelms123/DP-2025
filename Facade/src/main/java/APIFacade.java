import org.json.simple.parser.ParseException;

import java.io.IOException;

public class APIFacade {

    APIClient client;

    public APIFacade() {
        client = new APIClient();
    }

    public String getAttributeValueFromJson(String urlString, String attributeName) throws IOException, ParseException, IllegalArgumentException {
        String json = client.getJsonFromApi(urlString);
        return client.extractAttributeFromJson(json, attributeName);
    }
}
