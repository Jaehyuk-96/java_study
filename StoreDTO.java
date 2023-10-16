package oct16;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class StoreDTO {
    private String name;

    private double lat, lng;

    private String menu;

    private double score;


}
