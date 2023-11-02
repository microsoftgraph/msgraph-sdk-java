package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppManagementPolicy extends PolicyBase implements Parsable {
    /**
     * Instantiates a new AppManagementPolicy and sets the default values.
     */
    public AppManagementPolicy() {
        super();
        this.setOdataType("#microsoft.graph.appManagementPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppManagementPolicy
     */
    @jakarta.annotation.Nonnull
    public static AppManagementPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppManagementPolicy();
    }
    /**
     * Gets the appliesTo property value. Collection of applications and service principals to which the policy is applied.
     * @return a java.util.List<DirectoryObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getAppliesTo() {
        return this.getBackingStore().get("appliesTo");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("restrictions", (n) -> { this.setRestrictions(n.getObjectValue(AppManagementConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Denotes whether the policy is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.getBackingStore().get("isEnabled");
    }
    /**
     * Gets the restrictions property value. Restrictions that apply to an application or service principal object.
     * @return a AppManagementConfiguration
     */
    @jakarta.annotation.Nullable
    public AppManagementConfiguration getRestrictions() {
        return this.getBackingStore().get("restrictions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appliesTo", this.getAppliesTo());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeObjectValue("restrictions", this.getRestrictions());
    }
    /**
     * Sets the appliesTo property value. Collection of applications and service principals to which the policy is applied.
     * @param value Value to set for the appliesTo property.
     */
    public void setAppliesTo(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.getBackingStore().set("appliesTo", value);
    }
    /**
     * Sets the isEnabled property value. Denotes whether the policy is enabled.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("isEnabled", value);
    }
    /**
     * Sets the restrictions property value. Restrictions that apply to an application or service principal object.
     * @param value Value to set for the restrictions property.
     */
    public void setRestrictions(@jakarta.annotation.Nullable final AppManagementConfiguration value) {
        this.getBackingStore().set("restrictions", value);
    }
}
