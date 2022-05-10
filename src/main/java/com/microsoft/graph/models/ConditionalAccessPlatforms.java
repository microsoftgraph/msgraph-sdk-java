package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessPlatforms implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Possible values are: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue, linux. */
    private java.util.List<ConditionalAccessDevicePlatform> _excludePlatforms;
    /** Possible values are: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue,linux``. */
    private java.util.List<ConditionalAccessDevicePlatform> _includePlatforms;
    /**
     * Instantiates a new conditionalAccessPlatforms and sets the default values.
     * @return a void
     */
    public ConditionalAccessPlatforms() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessPlatforms
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessPlatforms createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessPlatforms();
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
     * Gets the excludePlatforms property value. Possible values are: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue, linux.
     * @return a conditionalAccessDevicePlatform
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessDevicePlatform> getExcludePlatforms() {
        return this._excludePlatforms;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessPlatforms currentObject = this;
        return new HashMap<>(2) {{
            this.put("excludePlatforms", (n) -> { currentObject.setExcludePlatforms(n.getCollectionOfEnumValues(ConditionalAccessDevicePlatform.class)); });
            this.put("includePlatforms", (n) -> { currentObject.setIncludePlatforms(n.getCollectionOfEnumValues(ConditionalAccessDevicePlatform.class)); });
        }};
    }
    /**
     * Gets the includePlatforms property value. Possible values are: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue,linux``.
     * @return a conditionalAccessDevicePlatform
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessDevicePlatform> getIncludePlatforms() {
        return this._includePlatforms;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("excludePlatforms", this.getExcludePlatforms());
        writer.writeCollectionOfEnumValues("includePlatforms", this.getIncludePlatforms());
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
     * Sets the excludePlatforms property value. Possible values are: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue, linux.
     * @param value Value to set for the excludePlatforms property.
     * @return a void
     */
    public void setExcludePlatforms(@javax.annotation.Nullable final java.util.List<ConditionalAccessDevicePlatform> value) {
        this._excludePlatforms = value;
    }
    /**
     * Sets the includePlatforms property value. Possible values are: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue,linux``.
     * @param value Value to set for the includePlatforms property.
     * @return a void
     */
    public void setIncludePlatforms(@javax.annotation.Nullable final java.util.List<ConditionalAccessDevicePlatform> value) {
        this._includePlatforms = value;
    }
}
