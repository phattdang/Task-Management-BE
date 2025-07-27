package phatdang.se.taskapi.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;

@Converter(autoApply = false)
public class JpaConverterJson implements AttributeConverter<String, String> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(String attribute) {
        try {
            return objectMapper.writeValueAsString(attribute);
        } catch (Exception e) {
            throw new IllegalArgumentException("Convert to JSON failed", e);
        }
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, String.class);
        } catch (Exception e) {
            throw new IllegalArgumentException("Convert from JSON failed", e);
        }
    }
}
