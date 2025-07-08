package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserDataSecurityAndGovernance extends DataSecurityAndGovernance implements Parsable {
    /**
     * Instantiates a new {@link UserDataSecurityAndGovernance} and sets the default values.
     */
    public UserDataSecurityAndGovernance() {
        super();
        this.setOdataType("#microsoft.graph.userDataSecurityAndGovernance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserDataSecurityAndGovernance}
     */
    @jakarta.annotation.Nonnull
    public static UserDataSecurityAndGovernance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserDataSecurityAndGovernance();
    }
    /**
     * Gets the activities property value. Container for activity logs (content processing and audit) related to this user. ContainsTarget: true.
     * @return a {@link ActivitiesContainer}
     */
    @jakarta.annotation.Nullable
    public ActivitiesContainer getActivities() {
        return this.backingStore.get("activities");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getObjectValue(ActivitiesContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("protectionScopes", (n) -> { this.setProtectionScopes(n.getObjectValue(UserProtectionScopeContainer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the protectionScopes property value. The protectionScopes property
     * @return a {@link UserProtectionScopeContainer}
     */
    @jakarta.annotation.Nullable
    public UserProtectionScopeContainer getProtectionScopes() {
        return this.backingStore.get("protectionScopes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("activities", this.getActivities());
        writer.writeObjectValue("protectionScopes", this.getProtectionScopes());
    }
    /**
     * Sets the activities property value. Container for activity logs (content processing and audit) related to this user. ContainsTarget: true.
     * @param value Value to set for the activities property.
     */
    public void setActivities(@jakarta.annotation.Nullable final ActivitiesContainer value) {
        this.backingStore.set("activities", value);
    }
    /**
     * Sets the protectionScopes property value. The protectionScopes property
     * @param value Value to set for the protectionScopes property.
     */
    public void setProtectionScopes(@jakarta.annotation.Nullable final UserProtectionScopeContainer value) {
        this.backingStore.set("protectionScopes", value);
    }
}
