package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AverageComparativeScore implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Average score within specified basis. */
    private Double _averageScore;
    /** Scope type. The possible values are: AllTenants, TotalSeats, IndustryTypes. */
    private String _basis;
    /**
     * Instantiates a new averageComparativeScore and sets the default values.
     * @return a void
     */
    public AverageComparativeScore() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a averageComparativeScore
     */
    @javax.annotation.Nonnull
    public static AverageComparativeScore createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AverageComparativeScore();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the averageScore property value. Average score within specified basis.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAverageScore() {
        return this._averageScore;
    }
    /**
     * Gets the basis property value. Scope type. The possible values are: AllTenants, TotalSeats, IndustryTypes.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBasis() {
        return this._basis;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AverageComparativeScore currentObject = this;
        return new HashMap<>(2) {{
            this.put("averageScore", (n) -> { currentObject.setAverageScore(n.getDoubleValue()); });
            this.put("basis", (n) -> { currentObject.setBasis(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("averageScore", this.getAverageScore());
        writer.writeStringValue("basis", this.getBasis());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the averageScore property value. Average score within specified basis.
     * @param value Value to set for the averageScore property.
     * @return a void
     */
    public void setAverageScore(@javax.annotation.Nullable final Double value) {
        this._averageScore = value;
    }
    /**
     * Sets the basis property value. Scope type. The possible values are: AllTenants, TotalSeats, IndustryTypes.
     * @param value Value to set for the basis property.
     * @return a void
     */
    public void setBasis(@javax.annotation.Nullable final String value) {
        this._basis = value;
    }
}
