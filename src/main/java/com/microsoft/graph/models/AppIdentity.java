package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppIdentity implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Refers to the unique identifier representing Application Id in the Azure Active Directory.  */
    private String _appId;
    /** Refers to the Application Name displayed in the Azure Portal.  */
    private String _displayName;
    /** Refers to the unique identifier indicating Service Principal Id in Azure Active Directory for the corresponding App.  */
    private String _servicePrincipalId;
    /** Refers to the Service Principal Name is the Application name in the tenant.  */
    private String _servicePrincipalName;
    /**
     * Instantiates a new appIdentity and sets the default values.
     * @return a void
     */
    public AppIdentity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appIdentity
     */
    @javax.annotation.Nonnull
    public static AppIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppIdentity();
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
     * Gets the appId property value. Refers to the unique identifier representing Application Id in the Azure Active Directory.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the displayName property value. Refers to the Application Name displayed in the Azure Portal.
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
        final AppIdentity currentObject = this;
        return new HashMap<>(4) {{
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("servicePrincipalId", (n) -> { currentObject.setServicePrincipalId(n.getStringValue()); });
            this.put("servicePrincipalName", (n) -> { currentObject.setServicePrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the servicePrincipalId property value. Refers to the unique identifier indicating Service Principal Id in Azure Active Directory for the corresponding App.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalId() {
        return this._servicePrincipalId;
    }
    /**
     * Gets the servicePrincipalName property value. Refers to the Service Principal Name is the Application name in the tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalName() {
        return this._servicePrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("servicePrincipalId", this.getServicePrincipalId());
        writer.writeStringValue("servicePrincipalName", this.getServicePrincipalName());
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
     * Sets the appId property value. Refers to the unique identifier representing Application Id in the Azure Active Directory.
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the displayName property value. Refers to the Application Name displayed in the Azure Portal.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the servicePrincipalId property value. Refers to the unique identifier indicating Service Principal Id in Azure Active Directory for the corresponding App.
     * @param value Value to set for the servicePrincipalId property.
     * @return a void
     */
    public void setServicePrincipalId(@javax.annotation.Nullable final String value) {
        this._servicePrincipalId = value;
    }
    /**
     * Sets the servicePrincipalName property value. Refers to the Service Principal Name is the Application name in the tenant.
     * @param value Value to set for the servicePrincipalName property.
     * @return a void
     */
    public void setServicePrincipalName(@javax.annotation.Nullable final String value) {
        this._servicePrincipalName = value;
    }
}
