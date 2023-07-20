package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience work from anywhere Cloud management devices summary.
 */
public class UserExperienceAnalyticsCloudManagementDevicesSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Total number of  co-managed devices. Read-only.
     */
    private Integer coManagedDeviceCount;
    /**
     * The count of intune devices that are not autopilot registerd. Read-only.
     */
    private Integer intuneDeviceCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Total count of tenant attach devices. Read-only.
     */
    private Integer tenantAttachDeviceCount;
    /**
     * Instantiates a new userExperienceAnalyticsCloudManagementDevicesSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCloudManagementDevicesSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsCloudManagementDevicesSummary
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsCloudManagementDevicesSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsCloudManagementDevicesSummary();
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
     * Gets the coManagedDeviceCount property value. Total number of  co-managed devices. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCoManagedDeviceCount() {
        return this.coManagedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("coManagedDeviceCount", (n) -> { this.setCoManagedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("intuneDeviceCount", (n) -> { this.setIntuneDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantAttachDeviceCount", (n) -> { this.setTenantAttachDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intuneDeviceCount property value. The count of intune devices that are not autopilot registerd. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIntuneDeviceCount() {
        return this.intuneDeviceCount;
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
     * Gets the tenantAttachDeviceCount property value. Total count of tenant attach devices. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTenantAttachDeviceCount() {
        return this.tenantAttachDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("coManagedDeviceCount", this.getCoManagedDeviceCount());
        writer.writeIntegerValue("intuneDeviceCount", this.getIntuneDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("tenantAttachDeviceCount", this.getTenantAttachDeviceCount());
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
     * Sets the coManagedDeviceCount property value. Total number of  co-managed devices. Read-only.
     * @param value Value to set for the coManagedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCoManagedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.coManagedDeviceCount = value;
    }
    /**
     * Sets the intuneDeviceCount property value. The count of intune devices that are not autopilot registerd. Read-only.
     * @param value Value to set for the intuneDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntuneDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.intuneDeviceCount = value;
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
    /**
     * Sets the tenantAttachDeviceCount property value. Total count of tenant attach devices. Read-only.
     * @param value Value to set for the tenantAttachDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantAttachDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.tenantAttachDeviceCount = value;
    }
}
