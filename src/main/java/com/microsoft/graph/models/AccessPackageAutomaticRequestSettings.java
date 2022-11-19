package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAutomaticRequestSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The gracePeriodBeforeAccessRemoval property */
    private Period _gracePeriodBeforeAccessRemoval;
    /** The OdataType property */
    private String _odataType;
    /** The removeAccessWhenTargetLeavesAllowedTargets property */
    private Boolean _removeAccessWhenTargetLeavesAllowedTargets;
    /** If set to true, automatic assignments will be created for targets in the allowed target scope. */
    private Boolean _requestAccessForAllowedTargets;
    /**
     * Instantiates a new accessPackageAutomaticRequestSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAutomaticRequestSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessPackageAutomaticRequestSettings");
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
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAutomaticRequestSettings currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("gracePeriodBeforeAccessRemoval", (n) -> { currentObject.setGracePeriodBeforeAccessRemoval(n.getPeriodValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("removeAccessWhenTargetLeavesAllowedTargets", (n) -> { currentObject.setRemoveAccessWhenTargetLeavesAllowedTargets(n.getBooleanValue()); });
        deserializerMap.put("requestAccessForAllowedTargets", (n) -> { currentObject.setRequestAccessForAllowedTargets(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodBeforeAccessRemoval property value. The gracePeriodBeforeAccessRemoval property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getGracePeriodBeforeAccessRemoval() {
        return this._gracePeriodBeforeAccessRemoval;
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
     * Gets the removeAccessWhenTargetLeavesAllowedTargets property value. The removeAccessWhenTargetLeavesAllowedTargets property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRemoveAccessWhenTargetLeavesAllowedTargets() {
        return this._removeAccessWhenTargetLeavesAllowedTargets;
    }
    /**
     * Gets the requestAccessForAllowedTargets property value. If set to true, automatic assignments will be created for targets in the allowed target scope.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequestAccessForAllowedTargets() {
        return this._requestAccessForAllowedTargets;
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
        this._additionalData = value;
    }
    /**
     * Sets the gracePeriodBeforeAccessRemoval property value. The gracePeriodBeforeAccessRemoval property
     * @param value Value to set for the gracePeriodBeforeAccessRemoval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGracePeriodBeforeAccessRemoval(@javax.annotation.Nullable final Period value) {
        this._gracePeriodBeforeAccessRemoval = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the removeAccessWhenTargetLeavesAllowedTargets property value. The removeAccessWhenTargetLeavesAllowedTargets property
     * @param value Value to set for the removeAccessWhenTargetLeavesAllowedTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoveAccessWhenTargetLeavesAllowedTargets(@javax.annotation.Nullable final Boolean value) {
        this._removeAccessWhenTargetLeavesAllowedTargets = value;
    }
    /**
     * Sets the requestAccessForAllowedTargets property value. If set to true, automatic assignments will be created for targets in the allowed target scope.
     * @param value Value to set for the requestAccessForAllowedTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestAccessForAllowedTargets(@javax.annotation.Nullable final Boolean value) {
        this._requestAccessForAllowedTargets = value;
    }
}
