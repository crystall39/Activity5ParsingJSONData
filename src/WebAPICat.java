import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class WebAPICat {

    public static void main(String[] args)
    {
        String APIkey = "0a0c5481-e7f2-48b1-b396-99d440b325de";

        String urlCats = "https://api.thecatapi.com/v1/breeds";
        makeAPICall(urlCats);

        System.out.print("Which cat breed? ");
        Scanner s = new Scanner(System.in);
        String catBreed = s.nextLine();

        String catURL = "https://api.thecatapi.com/v1/breeds/search?q=" + catBreed;
        makeAPICall(catURL);
    }

    public static void makeAPICall(String url)
    {
        try {
            URI myUri = URI.create(url); // creates a URI object from the url string
            HttpRequest request = HttpRequest.newBuilder().uri(myUri).build();

            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // UNCOMMENT TO PRINT OTHER PARTS OF THE RESPONSE
            //System.out.println(response.statusCode());
            //System.out.println(response.headers());
            System.out.println(response.body());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}