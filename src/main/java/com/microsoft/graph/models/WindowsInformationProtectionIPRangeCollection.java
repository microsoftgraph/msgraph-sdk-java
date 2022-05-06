package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows Information Protection IP Range Collection  */
public class WindowsInformationProtectionIPRangeCollection implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Display name  */
    private String _displayName;
    /** Collection of ip ranges  */
    private java.util.List<IpRange> _ranges;
    /**
     * Instantiates a new windowsInformationProtectionIPRangeCollection and sets the default values.
     * @return a void
     */
    public WindowsInformationProtectionIPRangeCollection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionIPRangeCollection
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionIPRangeCollection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionIPRangeCollection();
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
     * Gets the displayName property value. Display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsInformationProtectionIPRangeCollection currentObject = this;
        return new HashMap<>(2) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("ranges", (n) -> { currentObject.setRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the ranges property value. Collection of ip ranges
     * @return a ipRange
     */
    @javax.annotation.Nullable
    public java.util.List<IpRange> getRanges() {
        return this._ranges;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("ranges", this.getRanges());
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
     * Sets the displayName property value. Display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the ranges property value. Collection of ip ranges
     * @param value Value to set for the ranges property.
     * @return a void
     */
    public void setRanges(@javax.annotation.Nullable final java.util.List<IpRange> value) {
        this._ranges = value;
    }
}
