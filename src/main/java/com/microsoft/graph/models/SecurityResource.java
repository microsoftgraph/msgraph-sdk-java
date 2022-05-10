package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SecurityResource implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of the resource that is related to current alert. Required. */
    private String _resource;
    /** Represents type of security resources related to an alert. Possible values are: attacked, related. */
    private SecurityResourceType _resourceType;
    /**
     * Instantiates a new securityResource and sets the default values.
     * @return a void
     */
    public SecurityResource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityResource
     */
    @javax.annotation.Nonnull
    public static SecurityResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityResource();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecurityResource currentObject = this;
        return new HashMap<>(2) {{
            this.put("resource", (n) -> { currentObject.setResource(n.getStringValue()); });
            this.put("resourceType", (n) -> { currentObject.setResourceType(n.getEnumValue(SecurityResourceType.class)); });
        }};
    }
    /**
     * Gets the resource property value. Name of the resource that is related to current alert. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResource() {
        return this._resource;
    }
    /**
     * Gets the resourceType property value. Represents type of security resources related to an alert. Possible values are: attacked, related.
     * @return a securityResourceType
     */
    @javax.annotation.Nullable
    public SecurityResourceType getResourceType() {
        return this._resourceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("resource", this.getResource());
        writer.writeEnumValue("resourceType", this.getResourceType());
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
     * Sets the resource property value. Name of the resource that is related to current alert. Required.
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final String value) {
        this._resource = value;
    }
    /**
     * Sets the resourceType property value. Represents type of security resources related to an alert. Possible values are: attacked, related.
     * @param value Value to set for the resourceType property.
     * @return a void
     */
    public void setResourceType(@javax.annotation.Nullable final SecurityResourceType value) {
        this._resourceType = value;
    }
}
