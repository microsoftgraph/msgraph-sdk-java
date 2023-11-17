package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserFlowLanguageConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new UserFlowLanguageConfiguration and sets the default values.
     */
    public UserFlowLanguageConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserFlowLanguageConfiguration
     */
    @jakarta.annotation.Nonnull
    public static UserFlowLanguageConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserFlowLanguageConfiguration();
    }
    /**
     * Gets the defaultPages property value. Collection of pages with the default content to display in a user flow for a specified language. This collection doesn't allow any kind of modification.
     * @return a java.util.List<UserFlowLanguagePage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserFlowLanguagePage> getDefaultPages() {
        return this.backingStore.get("defaultPages");
    }
    /**
     * Gets the displayName property value. The language name to display. This property is read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultPages", (n) -> { this.setDefaultPages(n.getCollectionOfObjectValues(UserFlowLanguagePage::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("overridesPages", (n) -> { this.setOverridesPages(n.getCollectionOfObjectValues(UserFlowLanguagePage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the language is enabled within the user flow.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the overridesPages property value. Collection of pages with the overrides messages to display in a user flow for a specified language. This collection only allows you to modify the content of the page, any other modification isn't allowed (creation or deletion of pages).
     * @return a java.util.List<UserFlowLanguagePage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserFlowLanguagePage> getOverridesPages() {
        return this.backingStore.get("overridesPages");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("defaultPages", this.getDefaultPages());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeCollectionOfObjectValues("overridesPages", this.getOverridesPages());
    }
    /**
     * Sets the defaultPages property value. Collection of pages with the default content to display in a user flow for a specified language. This collection doesn't allow any kind of modification.
     * @param value Value to set for the defaultPages property.
     */
    public void setDefaultPages(@jakarta.annotation.Nullable final java.util.List<UserFlowLanguagePage> value) {
        this.backingStore.set("defaultPages", value);
    }
    /**
     * Sets the displayName property value. The language name to display. This property is read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isEnabled property value. Indicates whether the language is enabled within the user flow.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the overridesPages property value. Collection of pages with the overrides messages to display in a user flow for a specified language. This collection only allows you to modify the content of the page, any other modification isn't allowed (creation or deletion of pages).
     * @param value Value to set for the overridesPages property.
     */
    public void setOverridesPages(@jakarta.annotation.Nullable final java.util.List<UserFlowLanguagePage> value) {
        this.backingStore.set("overridesPages", value);
    }
}
