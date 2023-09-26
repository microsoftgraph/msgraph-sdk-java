package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents policy deployment summary per app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedAppPolicyDeploymentSummaryPerApp implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of users the policy is applied.
     */
    private Integer configurationAppliedUserCount;
    /**
     * Deployment of an app.
     */
    private MobileAppIdentifier mobileAppIdentifier;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new ManagedAppPolicyDeploymentSummaryPerApp and sets the default values.
     */
    public ManagedAppPolicyDeploymentSummaryPerApp() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedAppPolicyDeploymentSummaryPerApp
     */
    @jakarta.annotation.Nonnull
    public static ManagedAppPolicyDeploymentSummaryPerApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppPolicyDeploymentSummaryPerApp();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the configurationAppliedUserCount property value. Number of users the policy is applied.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfigurationAppliedUserCount() {
        return this.configurationAppliedUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("configurationAppliedUserCount", (n) -> { this.setConfigurationAppliedUserCount(n.getIntegerValue()); });
        deserializerMap.put("mobileAppIdentifier", (n) -> { this.setMobileAppIdentifier(n.getObjectValue(MobileAppIdentifier::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mobileAppIdentifier property value. Deployment of an app.
     * @return a MobileAppIdentifier
     */
    @jakarta.annotation.Nullable
    public MobileAppIdentifier getMobileAppIdentifier() {
        return this.mobileAppIdentifier;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("configurationAppliedUserCount", this.getConfigurationAppliedUserCount());
        writer.writeObjectValue("mobileAppIdentifier", this.getMobileAppIdentifier());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the configurationAppliedUserCount property value. Number of users the policy is applied.
     * @param value Value to set for the configurationAppliedUserCount property.
     */
    public void setConfigurationAppliedUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.configurationAppliedUserCount = value;
    }
    /**
     * Sets the mobileAppIdentifier property value. Deployment of an app.
     * @param value Value to set for the mobileAppIdentifier property.
     */
    public void setMobileAppIdentifier(@jakarta.annotation.Nullable final MobileAppIdentifier value) {
        this.mobileAppIdentifier = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
