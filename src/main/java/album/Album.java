package album;

import java.util.List;

import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;

import jakarta.xml.bind.annotation.*;
import movie.YearAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"artist","title","year","tracks"})
@Data
public class Album {


    private String artist;
    private String title;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private int year;

    @XmlElementWrapper(name = "tracks")
    @XmlElement(name = "track")
    private List<Track> tracks;

}