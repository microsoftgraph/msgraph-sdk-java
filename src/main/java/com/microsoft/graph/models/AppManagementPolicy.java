package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppManagementPolicy extends PolicyBase implements Parsable {
    /** The appliesTo property */
    private java.util.List<DirectoryObject> appliesTo;
    /** The isEnabled property */
    private Boolean isEnabled;
    /** The restrictions property */
    private AppManagementConfiguration restrictions;
    /**
     * Instantiates a new AppManagementPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppManagementPolicy() {
        super();
        this.setOdataType("#microsoft.graph.appManagementPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppManagementPolicy
     */
    @javax.annotation.Nonnull
    public static AppManagementPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppManagementPolicy();
    }
    /**
     * Gets the appliesTo property value. The appliesTo property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getAppliesTo() {
        return this.appliesTo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("restrictions", (n) -> { this.setRestrictions(n.getObjectValue(AppManagementConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. The isEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the restrictions property value. The restrictions property
     * @return a appManagementConfiguration
     */
    @javax.annotation.Nullable
    public AppManagementConfiguration getRestrictions() {
        return this.restrictions;
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
        writer.writeCollectionOfObjectValues("appliesTo", this.getAppliesTo());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeObjectValue("restrictions", this.getRestrictions());
    }
    /**
     * Sets the appliesTo property value. The appliesTo property
     * @param value Value to set for the appliesTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliesTo(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.appliesTo = value;
    }
    /**
     * Sets the isEnabled property value. The isEnabled property
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the restrictions property value. The restrictions property
     * @param value Value to set for the restrictions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestrictions(@javax.annotation.Nullable final AppManagementConfiguration value) {
        this.restrictions = value;
    }
}
