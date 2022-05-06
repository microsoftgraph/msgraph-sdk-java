package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkforceIntegration extends ChangeTrackedEntity implements Parsable {
    /** API version for the call back URL. Start with 1.  */
    private Integer _apiVersion;
    /** Name of the workforce integration.  */
    private String _displayName;
    /** The workforce integration encryption resource.  */
    private WorkforceIntegrationEncryption _encryption;
    /** Indicates whether this workforce integration is currently active and available.  */
    private Boolean _isActive;
    /** This property has replaced supports in v1.0. We recommend that you use this property instead of supports. The supports property is still supported in beta for the time being. The possible values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard, timeOffReason, timeOff, timeOffRequest. If selecting more than one value, all values must start with the first letter in uppercase.  */
    private WorkforceIntegrationSupportedEntities _supportedEntities;
    /** Workforce Integration URL for callbacks from the Shifts service.  */
    private String _url;
    /**
     * Instantiates a new workforceIntegration and sets the default values.
     * @return a void
     */
    public WorkforceIntegration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workforceIntegration
     */
    @javax.annotation.Nonnull
    public static WorkforceIntegration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkforceIntegration();
    }
    /**
     * Gets the apiVersion property value. API version for the call back URL. Start with 1.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getApiVersion() {
        return this._apiVersion;
    }
    /**
     * Gets the displayName property value. Name of the workforce integration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the encryption property value. The workforce integration encryption resource.
     * @return a workforceIntegrationEncryption
     */
    @javax.annotation.Nullable
    public WorkforceIntegrationEncryption getEncryption() {
        return this._encryption;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkforceIntegration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("apiVersion", (n) -> { currentObject.setApiVersion(n.getIntegerValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("encryption", (n) -> { currentObject.setEncryption(n.getObjectValue(WorkforceIntegrationEncryption::createFromDiscriminatorValue)); });
            this.put("isActive", (n) -> { currentObject.setIsActive(n.getBooleanValue()); });
            this.put("supportedEntities", (n) -> { currentObject.setSupportedEntities(n.getEnumValue(WorkforceIntegrationSupportedEntities.class)); });
            this.put("url", (n) -> { currentObject.setUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isActive property value. Indicates whether this workforce integration is currently active and available.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsActive() {
        return this._isActive;
    }
    /**
     * Gets the supportedEntities property value. This property has replaced supports in v1.0. We recommend that you use this property instead of supports. The supports property is still supported in beta for the time being. The possible values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard, timeOffReason, timeOff, timeOffRequest. If selecting more than one value, all values must start with the first letter in uppercase.
     * @return a workforceIntegrationSupportedEntities
     */
    @javax.annotation.Nullable
    public WorkforceIntegrationSupportedEntities getSupportedEntities() {
        return this._supportedEntities;
    }
    /**
     * Gets the url property value. Workforce Integration URL for callbacks from the Shifts service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this._url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("apiVersion", this.getApiVersion());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("encryption", this.getEncryption());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeEnumValue("supportedEntities", this.getSupportedEntities());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the apiVersion property value. API version for the call back URL. Start with 1.
     * @param value Value to set for the apiVersion property.
     * @return a void
     */
    public void setApiVersion(@javax.annotation.Nullable final Integer value) {
        this._apiVersion = value;
    }
    /**
     * Sets the displayName property value. Name of the workforce integration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the encryption property value. The workforce integration encryption resource.
     * @param value Value to set for the encryption property.
     * @return a void
     */
    public void setEncryption(@javax.annotation.Nullable final WorkforceIntegrationEncryption value) {
        this._encryption = value;
    }
    /**
     * Sets the isActive property value. Indicates whether this workforce integration is currently active and available.
     * @param value Value to set for the isActive property.
     * @return a void
     */
    public void setIsActive(@javax.annotation.Nullable final Boolean value) {
        this._isActive = value;
    }
    /**
     * Sets the supportedEntities property value. This property has replaced supports in v1.0. We recommend that you use this property instead of supports. The supports property is still supported in beta for the time being. The possible values are: none, shift, swapRequest, openshift, openShiftRequest, userShiftPreferences, offerShiftRequest, unknownFutureValue, timeCard, timeOffReason, timeOff, timeOffRequest. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: timeCard, timeOffReason, timeOff, timeOffRequest. If selecting more than one value, all values must start with the first letter in uppercase.
     * @param value Value to set for the supportedEntities property.
     * @return a void
     */
    public void setSupportedEntities(@javax.annotation.Nullable final WorkforceIntegrationSupportedEntities value) {
        this._supportedEntities = value;
    }
    /**
     * Sets the url property value. Workforce Integration URL for callbacks from the Shifts service.
     * @param value Value to set for the url property.
     * @return a void
     */
    public void setUrl(@javax.annotation.Nullable final String value) {
        this._url = value;
    }
}
