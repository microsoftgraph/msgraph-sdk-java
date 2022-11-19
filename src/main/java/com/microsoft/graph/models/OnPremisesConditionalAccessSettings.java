package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesConditionalAccessSettings extends Entity implements Parsable {
    /** Indicates if on premises conditional access is enabled for this organization */
    private Boolean _enabled;
    /** User groups that will be exempt by on premises conditional access. All users in these groups will be exempt from the conditional access policy. */
    private java.util.List<String> _excludedGroups;
    /** User groups that will be targeted by on premises conditional access. All users in these groups will be required to have mobile device managed and compliant for mail access. */
    private java.util.List<String> _includedGroups;
    /** Override the default access rule when allowing a device to ensure access is granted. */
    private Boolean _overrideDefaultRule;
    /**
     * Instantiates a new onPremisesConditionalAccessSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesConditionalAccessSettings() {
        super();
        this.setOdataType("#microsoft.graph.onPremisesConditionalAccessSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesConditionalAccessSettings
     */
    @javax.annotation.Nonnull
    public static OnPremisesConditionalAccessSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesConditionalAccessSettings();
    }
    /**
     * Gets the enabled property value. Indicates if on premises conditional access is enabled for this organization
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * Gets the excludedGroups property value. User groups that will be exempt by on premises conditional access. All users in these groups will be exempt from the conditional access policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludedGroups() {
        return this._excludedGroups;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesConditionalAccessSettings currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("excludedGroups", (n) -> { currentObject.setExcludedGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includedGroups", (n) -> { currentObject.setIncludedGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("overrideDefaultRule", (n) -> { currentObject.setOverrideDefaultRule(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includedGroups property value. User groups that will be targeted by on premises conditional access. All users in these groups will be required to have mobile device managed and compliant for mail access.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludedGroups() {
        return this._includedGroups;
    }
    /**
     * Gets the overrideDefaultRule property value. Override the default access rule when allowing a device to ensure access is granted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOverrideDefaultRule() {
        return this._overrideDefaultRule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeCollectionOfPrimitiveValues("excludedGroups", this.getExcludedGroups());
        writer.writeCollectionOfPrimitiveValues("includedGroups", this.getIncludedGroups());
        writer.writeBooleanValue("overrideDefaultRule", this.getOverrideDefaultRule());
    }
    /**
     * Sets the enabled property value. Indicates if on premises conditional access is enabled for this organization
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the excludedGroups property value. User groups that will be exempt by on premises conditional access. All users in these groups will be exempt from the conditional access policy.
     * @param value Value to set for the excludedGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludedGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludedGroups = value;
    }
    /**
     * Sets the includedGroups property value. User groups that will be targeted by on premises conditional access. All users in these groups will be required to have mobile device managed and compliant for mail access.
     * @param value Value to set for the includedGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludedGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includedGroups = value;
    }
    /**
     * Sets the overrideDefaultRule property value. Override the default access rule when allowing a device to ensure access is granted.
     * @param value Value to set for the overrideDefaultRule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOverrideDefaultRule(@javax.annotation.Nullable final Boolean value) {
        this._overrideDefaultRule = value;
    }
}
