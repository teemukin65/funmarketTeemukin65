package fi.teemukin65.alma.model.funmarketApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.net.URL;


/**
 * Created by teemu on 27.10.2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Component("fun")
public class Images {
    ObjectId id;
    String url;
    String contentType;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String toString() {
        return "Images{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }
}
