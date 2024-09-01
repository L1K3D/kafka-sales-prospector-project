package deserializer;

import org.apache.kafka.common.serialization.Deserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Venda;

public class VendaDeserializer implements Deserializer<Venda> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Venda deserialize(String topic, byte[] data) {
    	
        try {
        	
            return objectMapper.readValue(data, Venda.class);
            
        } 
        
        catch (Exception e) {
        	
            e.printStackTrace();
            
        }
        
        return null;
        
    }

}
