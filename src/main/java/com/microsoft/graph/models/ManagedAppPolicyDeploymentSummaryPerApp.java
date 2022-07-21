package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents policy deployment summary per app. */
public class ManagedAppPolicyDeploymentSummaryPerApp implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Number of users the policy is applied. */
    private Integer _configurationAppliedUserCount;
    /** Deployment of an app. */
    private MobileAppIdentifier _mobileAppIdentifier;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new managedAppPolicyDeploymentSummaryPerApp and sets the default values.
     * @return a void
     */
    public ManagedAppPolicyDeploymentSummaryPerApp() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.managedAppPolicyDeploymentSummaryPerApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedAppPolicyDeploymentSummaryPerApp
     */
    @javax.annotation.Nonnull
    public static ManagedAppPolicyDeploymentSummaryPerApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppPolicyDeploymentSummaryPerApp();
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
     * Gets the configurationAppliedUserCount property value. Number of users the policy is applied.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfigurationAppliedUserCount() {
        return this._configurationAppliedUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedAppPolicyDeploymentSummaryPerApp currentObject = this;
        return new HashMap<>(3) {{
            this.put("configurationAppliedUserCount", (n) -> { currentObject.setConfigurationAppliedUserCount(n.getIntegerValue()); });
            this.put("mobileAppIdentifier", (n) -> { currentObject.setMobileAppIdentifier(n.getObjectValue(MobileAppIdentifier::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the mobileAppIdentifier property value. Deployment of an app.
     * @return a mobileAppIdentifier
     */
    @javax.annotation.Nullable
    public MobileAppIdentifier getMobileAppIdentifier() {
        return this._mobileAppIdentifier;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("configurationAppliedUserCount", this.getConfigurationAppliedUserCount());
        writer.writeObjectValue("mobileAppIdentifier", this.getMobileAppIdentifier());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the configurationAppliedUserCount property value. Number of users the policy is applied.
     * @param value Value to set for the configurationAppliedUserCount property.
     * @return a void
     */
    public void setConfigurationAppliedUserCount(@javax.annotation.Nullable final Integer value) {
        this._configurationAppliedUserCount = value;
    }
    /**
     * Sets the mobileAppIdentifier property value. Deployment of an app.
     * @param value Value to set for the mobileAppIdentifier property.
     * @return a void
     */
    public void setMobileAppIdentifier(@javax.annotation.Nullable final MobileAppIdentifier value) {
        this._mobileAppIdentifier = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
