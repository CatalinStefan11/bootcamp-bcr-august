package ro.bcr.advanced._2_collections._5_set;

import java.util.Objects;

public class TravelDestination {
    private String location;
    private String description;

    public TravelDestination(String location, String description) {
        this.location = location;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelDestination that = (TravelDestination) o;
        return Objects.equals(location, that.location) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, description);
    }

    @Override
    public String toString() {
        return "TravelDestination{" +
                "location='" + location + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
