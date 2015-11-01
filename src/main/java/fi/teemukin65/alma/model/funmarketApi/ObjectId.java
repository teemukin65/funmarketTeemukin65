package fi.teemukin65.alma.model.funmarketApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

/**
 * Created by teemu on 27.10.2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class ObjectId {
    String timestamp;
    Long machineIdentifier;
    Long processIdentifier;
    Long counter;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Long getMachineIdentifier() {
        return machineIdentifier;
    }

    public void setMachineIdentifier(Long machineIdentifier) {
        this.machineIdentifier = machineIdentifier;
    }

    public Long getProcessIdentifier() {
        return processIdentifier;
    }

    public void setProcessIdentifier(Long processIdentifier) {
        this.processIdentifier = processIdentifier;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "ObjectId{" +
                "timestamp='" + timestamp + '\'' +
                ", machineIdentifier=" + machineIdentifier +
                ", processIdentifier=" + processIdentifier +
                ", counter=" + counter +
                '}';
    }
}
