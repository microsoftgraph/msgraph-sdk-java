package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RequiredResourceAccess implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource. */
    private java.util.List<ResourceAccess> _resourceAccess;
    /** The unique identifier for the resource that the application requires access to. This should be equal to the appId declared on the target resource application. */
    private String _resourceAppId;
    /**
     * Instantiates a new requiredResourceAccess and sets the default values.
     * @return a void
     */
    public RequiredResourceAccess() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a requiredResourceAccess
     */
    @javax.annotation.Nonnull
    public static RequiredResourceAccess createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequiredResourceAccess();
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
        final RequiredResourceAccess currentObject = this;
        return new HashMap<>(2) {{
            this.put("resourceAccess", (n) -> { currentObject.setResourceAccess(n.getCollectionOfObjectValues(ResourceAccess::createFromDiscriminatorValue)); });
            this.put("resourceAppId", (n) -> { currentObject.setResourceAppId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the resourceAccess property value. The list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     * @return a resourceAccess
     */
    @javax.annotation.Nullable
    public java.util.List<ResourceAccess> getResourceAccess() {
        return this._resourceAccess;
    }
    /**
     * Gets the resourceAppId property value. The unique identifier for the resource that the application requires access to. This should be equal to the appId declared on the target resource application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceAppId() {
        return this._resourceAppId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("resourceAccess", this.getResourceAccess());
        writer.writeStringValue("resourceAppId", this.getResourceAppId());
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
     * Sets the resourceAccess property value. The list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     * @param value Value to set for the resourceAccess property.
     * @return a void
     */
    public void setResourceAccess(@javax.annotation.Nullable final java.util.List<ResourceAccess> value) {
        this._resourceAccess = value;
    }
    /**
     * Sets the resourceAppId property value. The unique identifier for the resource that the application requires access to. This should be equal to the appId declared on the target resource application.
     * @param value Value to set for the resourceAppId property.
     * @return a void
     */
    public void setResourceAppId(@javax.annotation.Nullable final String value) {
        this._resourceAppId = value;
    }
}
