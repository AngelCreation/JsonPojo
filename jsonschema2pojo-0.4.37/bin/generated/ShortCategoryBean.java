import java.util.HashMap;
import java.util.Map;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "categoryName",
    "newEventsCount"
})
public class ShortCategoryBean implements Parcelable
{

    @JsonProperty("categoryName")
    private String categoryName;
    @JsonProperty("newEventsCount")
    private Integer newEventsCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<ShortCategoryBean> CREATOR = new Creator<ShortCategoryBean>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ShortCategoryBean createFromParcel(Parcel in) {
            return new ShortCategoryBean(in);
        }

        public ShortCategoryBean[] newArray(int size) {
            return (new ShortCategoryBean[size]);
        }

    }
    ;

    protected ShortCategoryBean(Parcel in) {
        this.categoryName = ((String) in.readValue((String.class.getClassLoader())));
        this.newEventsCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    public ShortCategoryBean() {
    }

    @JsonProperty("categoryName")
    public String getCategoryName() {
        return categoryName;
    }

    @JsonProperty("categoryName")
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @JsonProperty("newEventsCount")
    public Integer getNewEventsCount() {
        return newEventsCount;
    }

    @JsonProperty("newEventsCount")
    public void setNewEventsCount(Integer newEventsCount) {
        this.newEventsCount = newEventsCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(categoryName);
        dest.writeValue(newEventsCount);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
