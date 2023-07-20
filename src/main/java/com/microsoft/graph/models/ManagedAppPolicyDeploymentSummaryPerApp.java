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
     * Instantiates a new managedAppPolicyDeploymentSummaryPerApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedAppPolicyDeploymentSummaryPerApp() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the configurationAppliedUserCount property value. Number of users the policy is applied.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfigurationAppliedUserCount() {
        return this.configurationAppliedUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("configurationAppliedUserCount", (n) -> { this.setConfigurationAppliedUserCount(n.getIntegerValue()); });
        deserializerMap.put("mobileAppIdentifier", (n) -> { this.setMobileAppIdentifier(n.getObjectValue(MobileAppIdentifier::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mobileAppIdentifier property value. Deployment of an app.
     * @return a mobileAppIdentifier
     */
    @javax.annotation.Nullable
    public MobileAppIdentifier getMobileAppIdentifier() {
        return this.mobileAppIdentifier;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("configurationAppliedUserCount", this.getConfigurationAppliedUserCount());
        writer.writeObjectValue("mobileAppIdentifier", this.getMobileAppIdentifier());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the configurationAppliedUserCount property value. Number of users the policy is applied.
     * @param value Value to set for the configurationAppliedUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationAppliedUserCount(@javax.annotation.Nullable final Integer value) {
        this.configurationAppliedUserCount = value;
    }
    /**
     * Sets the mobileAppIdentifier property value. Deployment of an app.
     * @param value Value to set for the mobileAppIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppIdentifier(@javax.annotation.Nullable final MobileAppIdentifier value) {
        this.mobileAppIdentifier = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
