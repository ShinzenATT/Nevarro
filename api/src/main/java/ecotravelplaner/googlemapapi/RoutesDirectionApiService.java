package ecotravelplaner.googlemapapi;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class RoutesDirectionApiService {

    @GetMapping
    public String routesDirectionCon(String destination, String origin,
                                     String mean, String apiKey){
        return new RoutesDirectionApi(destination, origin, mean, apiKey).getInfo();
    }
}

