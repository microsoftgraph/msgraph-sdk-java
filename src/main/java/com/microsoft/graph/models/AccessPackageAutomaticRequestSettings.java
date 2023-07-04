package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAutomaticRequestSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The duration for which access must be retained before the target's access is revoked once they leave the allowed target scope.
     */
    private Period gracePeriodBeforeAccessRemoval;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates whether automatic assignment must be removed for targets who move out of the allowed target scope.
     */
    private Boolean removeAccessWhenTargetLeavesAllowedTargets;
    /**
     * If set to true, automatic assignments will be created for targets in the allowed target scope.
     */
    private Boolean requestAccessForAllowedTargets;
    /**
     * Instantiates a new accessPackageAutomaticRequestSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAutomaticRequestSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAutomaticRequestSettings
     */
    @javax.annotation.Nonnull
    public static AccessPackageAutomaticRequestSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAutomaticRequestSettings();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("gracePeriodBeforeAccessRemoval", (n) -> { this.setGracePeriodBeforeAccessRemoval(n.getPeriodValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("removeAccessWhenTargetLeavesAllowedTargets", (n) -> { this.setRemoveAccessWhenTargetLeavesAllowedTargets(n.getBooleanValue()); });
        deserializerMap.put("requestAccessForAllowedTargets", (n) -> { this.setRequestAccessForAllowedTargets(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodBeforeAccessRemoval property value. The duration for which access must be retained before the target's access is revoked once they leave the allowed target scope.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getGracePeriodBeforeAccessRemoval() {
        return this.gracePeriodBeforeAccessRemoval;
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
     * Gets the removeAccessWhenTargetLeavesAllowedTargets property value. Indicates whether automatic assignment must be removed for targets who move out of the allowed target scope.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRemoveAccessWhenTargetLeavesAllowedTargets() {
        return this.removeAccessWhenTargetLeavesAllowedTargets;
    }
    /**
     * Gets the requestAccessForAllowedTargets property value. If set to true, automatic assignments will be created for targets in the allowed target scope.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequestAccessForAllowedTargets() {
        return this.requestAccessForAllowedTargets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writePeriodValue("gracePeriodBeforeAccessRemoval", this.getGracePeriodBeforeAccessRemoval());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("removeAccessWhenTargetLeavesAllowedTargets", this.getRemoveAccessWhenTargetLeavesAllowedTargets());
        writer.writeBooleanValue("requestAccessForAllowedTargets", this.getRequestAccessForAllowedTargets());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the gracePeriodBeforeAccessRemoval property value. The duration for which access must be retained before the target's access is revoked once they leave the allowed target scope.
     * @param value Value to set for the gracePeriodBeforeAccessRemoval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGracePeriodBeforeAccessRemoval(@javax.annotation.Nullable final Period value) {
        this.gracePeriodBeforeAccessRemoval = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the removeAccessWhenTargetLeavesAllowedTargets property value. Indicates whether automatic assignment must be removed for targets who move out of the allowed target scope.
     * @param value Value to set for the removeAccessWhenTargetLeavesAllowedTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoveAccessWhenTargetLeavesAllowedTargets(@javax.annotation.Nullable final Boolean value) {
        this.removeAccessWhenTargetLeavesAllowedTargets = value;
    }
    /**
     * Sets the requestAccessForAllowedTargets property value. If set to true, automatic assignments will be created for targets in the allowed target scope.
     * @param value Value to set for the requestAccessForAllowedTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestAccessForAllowedTargets(@javax.annotation.Nullable final Boolean value) {
        this.requestAccessForAllowedTargets = value;
    }
}
