package serializer;

import org.apache.kafka.common.serialization.Serializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import model.Venda;

public class VendaSerializer implements Serializer<Venda>{
	
	public byte[] serialize(String topic, Venda venda) {
		
		try {
			
			return new ObjectMapper().writeValueAsBytes(venda);
			
		}
		
		catch (JsonProcessingException e){
			
			e.printStackTrace();
			
		}
		
		return null;
		
		
	}
}
