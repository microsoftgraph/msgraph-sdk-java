package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyInboundTrust implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Specifies whether compliant devices from external Azure AD organizations are trusted. */
    private Boolean _isCompliantDeviceAccepted;
    /** Specifies whether hybrid Azure AD joined devices from external Azure AD organizations are trusted. */
    private Boolean _isHybridAzureADJoinedDeviceAccepted;
    /** Specifies whether MFA from external Azure AD organizations is trusted. */
    private Boolean _isMfaAccepted;
    /**
     * Instantiates a new crossTenantAccessPolicyInboundTrust and sets the default values.
     * @return a void
     */
    public CrossTenantAccessPolicyInboundTrust() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantAccessPolicyInboundTrust
     */
    @javax.annotation.Nonnull
    public static CrossTenantAccessPolicyInboundTrust createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyInboundTrust();
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
        final CrossTenantAccessPolicyInboundTrust currentObject = this;
        return new HashMap<>(3) {{
            this.put("isCompliantDeviceAccepted", (n) -> { currentObject.setIsCompliantDeviceAccepted(n.getBooleanValue()); });
            this.put("isHybridAzureADJoinedDeviceAccepted", (n) -> { currentObject.setIsHybridAzureADJoinedDeviceAccepted(n.getBooleanValue()); });
            this.put("isMfaAccepted", (n) -> { currentObject.setIsMfaAccepted(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isCompliantDeviceAccepted property value. Specifies whether compliant devices from external Azure AD organizations are trusted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCompliantDeviceAccepted() {
        return this._isCompliantDeviceAccepted;
    }
    /**
     * Gets the isHybridAzureADJoinedDeviceAccepted property value. Specifies whether hybrid Azure AD joined devices from external Azure AD organizations are trusted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHybridAzureADJoinedDeviceAccepted() {
        return this._isHybridAzureADJoinedDeviceAccepted;
    }
    /**
     * Gets the isMfaAccepted property value. Specifies whether MFA from external Azure AD organizations is trusted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMfaAccepted() {
        return this._isMfaAccepted;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isCompliantDeviceAccepted", this.getIsCompliantDeviceAccepted());
        writer.writeBooleanValue("isHybridAzureADJoinedDeviceAccepted", this.getIsHybridAzureADJoinedDeviceAccepted());
        writer.writeBooleanValue("isMfaAccepted", this.getIsMfaAccepted());
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
     * Sets the isCompliantDeviceAccepted property value. Specifies whether compliant devices from external Azure AD organizations are trusted.
     * @param value Value to set for the isCompliantDeviceAccepted property.
     * @return a void
     */
    public void setIsCompliantDeviceAccepted(@javax.annotation.Nullable final Boolean value) {
        this._isCompliantDeviceAccepted = value;
    }
    /**
     * Sets the isHybridAzureADJoinedDeviceAccepted property value. Specifies whether hybrid Azure AD joined devices from external Azure AD organizations are trusted.
     * @param value Value to set for the isHybridAzureADJoinedDeviceAccepted property.
     * @return a void
     */
    public void setIsHybridAzureADJoinedDeviceAccepted(@javax.annotation.Nullable final Boolean value) {
        this._isHybridAzureADJoinedDeviceAccepted = value;
    }
    /**
     * Sets the isMfaAccepted property value. Specifies whether MFA from external Azure AD organizations is trusted.
     * @param value Value to set for the isMfaAccepted property.
     * @return a void
     */
    public void setIsMfaAccepted(@javax.annotation.Nullable final Boolean value) {
        this._isMfaAccepted = value;
    }
}
