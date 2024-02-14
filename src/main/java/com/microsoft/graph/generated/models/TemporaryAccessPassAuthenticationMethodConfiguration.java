package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TemporaryAccessPassAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /**
     * Instantiates a new {@link TemporaryAccessPassAuthenticationMethodConfiguration} and sets the default values.
     */
    public TemporaryAccessPassAuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.temporaryAccessPassAuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TemporaryAccessPassAuthenticationMethodConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static TemporaryAccessPassAuthenticationMethodConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TemporaryAccessPassAuthenticationMethodConfiguration();
    }
    /**
     * Gets the defaultLength property value. Default length in characters of a Temporary Access Pass object. Must be between 8 and 48 characters.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDefaultLength() {
        return this.backingStore.get("defaultLength");
    }
    /**
     * Gets the defaultLifetimeInMinutes property value. Default lifetime in minutes for a Temporary Access Pass. Value can be any integer between the minimumLifetimeInMinutes and maximumLifetimeInMinutes.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDefaultLifetimeInMinutes() {
        return this.backingStore.get("defaultLifetimeInMinutes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultLength", (n) -> { this.setDefaultLength(n.getIntegerValue()); });
        deserializerMap.put("defaultLifetimeInMinutes", (n) -> { this.setDefaultLifetimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("isUsableOnce", (n) -> { this.setIsUsableOnce(n.getBooleanValue()); });
        deserializerMap.put("maximumLifetimeInMinutes", (n) -> { this.setMaximumLifetimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("minimumLifetimeInMinutes", (n) -> { this.setMinimumLifetimeInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. A collection of groups that are enabled to use the authentication method.
     * @return a {@link java.util.List<AuthenticationMethodTarget>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodTarget> getIncludeTargets() {
        return this.backingStore.get("includeTargets");
    }
    /**
     * Gets the isUsableOnce property value. If true, all the passes in the tenant will be restricted to one-time use. If false, passes in the tenant can be created to be either one-time use or reusable.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUsableOnce() {
        return this.backingStore.get("isUsableOnce");
    }
    /**
     * Gets the maximumLifetimeInMinutes property value. Maximum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200 minutes (equivalent to 30 days).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumLifetimeInMinutes() {
        return this.backingStore.get("maximumLifetimeInMinutes");
    }
    /**
     * Gets the minimumLifetimeInMinutes property value. Minimum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200 minutes (equivalent to 30 days).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumLifetimeInMinutes() {
        return this.backingStore.get("minimumLifetimeInMinutes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("defaultLength", this.getDefaultLength());
        writer.writeIntegerValue("defaultLifetimeInMinutes", this.getDefaultLifetimeInMinutes());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeBooleanValue("isUsableOnce", this.getIsUsableOnce());
        writer.writeIntegerValue("maximumLifetimeInMinutes", this.getMaximumLifetimeInMinutes());
        writer.writeIntegerValue("minimumLifetimeInMinutes", this.getMinimumLifetimeInMinutes());
    }
    /**
     * Sets the defaultLength property value. Default length in characters of a Temporary Access Pass object. Must be between 8 and 48 characters.
     * @param value Value to set for the defaultLength property.
     */
    public void setDefaultLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defaultLength", value);
    }
    /**
     * Sets the defaultLifetimeInMinutes property value. Default lifetime in minutes for a Temporary Access Pass. Value can be any integer between the minimumLifetimeInMinutes and maximumLifetimeInMinutes.
     * @param value Value to set for the defaultLifetimeInMinutes property.
     */
    public void setDefaultLifetimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defaultLifetimeInMinutes", value);
    }
    /**
     * Sets the includeTargets property value. A collection of groups that are enabled to use the authentication method.
     * @param value Value to set for the includeTargets property.
     */
    public void setIncludeTargets(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this.backingStore.set("includeTargets", value);
    }
    /**
     * Sets the isUsableOnce property value. If true, all the passes in the tenant will be restricted to one-time use. If false, passes in the tenant can be created to be either one-time use or reusable.
     * @param value Value to set for the isUsableOnce property.
     */
    public void setIsUsableOnce(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isUsableOnce", value);
    }
    /**
     * Sets the maximumLifetimeInMinutes property value. Maximum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200 minutes (equivalent to 30 days).
     * @param value Value to set for the maximumLifetimeInMinutes property.
     */
    public void setMaximumLifetimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumLifetimeInMinutes", value);
    }
    /**
     * Sets the minimumLifetimeInMinutes property value. Minimum lifetime in minutes for any Temporary Access Pass created in the tenant. Value can be between 10 and 43200 minutes (equivalent to 30 days).
     * @param value Value to set for the minimumLifetimeInMinutes property.
     */
    public void setMinimumLifetimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumLifetimeInMinutes", value);
    }
}
