package ch.azure.aurore.bookdb;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * https://openlibrary.org/dev/docs/api/search
 * https://mkyong.com/java/apache-httpclient-examples/
 */
public class OpenLibraryAccess {

//    //https://thepracticaldeveloper.com/java-and-json-jackson-serialization-with-objectmapper/#json-serialization-with-java
//    public static void main(String[] args) throws IOException {
//        HttpGet request = new HttpGet("http://httpbin.org/get");
//
//        request = new HttpGet("https://www.goodreads.com/search?utf8=%E2%9C%93&q=derric&search_type=books");
//        request = new HttpGet("http://openlibrary.org/search.json?title=the+fifth+elephant");
//
//        try (CloseableHttpClient httpClient = HttpClients.createDefault();
//             CloseableHttpResponse response = httpClient.execute(request)) {
//
//            // Get HttpResponse Status
//            System.out.println(response.getProtocolVersion());              // HTTP/1.1
//            System.out.println(response.getStatusLine().getStatusCode());   // 200
//            System.out.println(response.getStatusLine().getReasonPhrase()); // OK
//            System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK
//
//            HttpEntity entity = response.getEntity();
//            if (entity != null) {
//                // return it as a String
//                String result = EntityUtils.toString(entity);
//                System.out.println(result);
//            }
//        }
//    }

    /**
     * @param args
     * https://thepracticaldeveloper.com/java-and-json-jackson-serialization-with-objectmapper/#deserialize-to-a-simple-java-object
     */
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        try {
            var r =  mapper.readValue(BookQuery.jsonTxt, BookQuery.class);
            System.out.println(r.getNumFound());

            for (int n = 0; n < r.getDocs().length; n++) {
                System.out.println(r.getDocs()[n].getTitle());
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}

//URI baseURI = new URI("http://openlibrary.org/search.json?title=");
//uri.resolve(searchUri);

//    public static void main(String[] args) {
//        var request = "http://openlibrary.org/search.json?title=the+lord+of+the+rings";
//        try {
//            URL url = new URL(request);
//            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//            conn.setRequestMethod("GET");
//           //conn.connect();
//
//            if (conn.getResponseCode() != 200){
//                System.out.println("Error with openLibrary connection: " + conn.getResponseMessage());
//                return;
//            }
//            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//
//            StringBuilder str = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null){
//                str.append(line);
//                str.append("\r\n");
//            }
//            System.out.println(str.toString());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
