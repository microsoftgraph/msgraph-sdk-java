package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserFlowLanguageConfiguration extends Entity implements Parsable {
    /** Collection of pages with the default content to display in a user flow for a specified language. This collection does not allow any kind of modification. */
    private java.util.List<UserFlowLanguagePage> defaultPages;
    /** The language name to display. This property is read-only. */
    private String displayName;
    /** Indicates whether the language is enabled within the user flow. */
    private Boolean isEnabled;
    /** Collection of pages with the overrides messages to display in a user flow for a specified language. This collection only allows to modify the content of the page, any other modification is not allowed (creation or deletion of pages). */
    private java.util.List<UserFlowLanguagePage> overridesPages;
    /**
     * Instantiates a new userFlowLanguageConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserFlowLanguageConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userFlowLanguageConfiguration
     */
    @javax.annotation.Nonnull
    public static UserFlowLanguageConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserFlowLanguageConfiguration();
    }
    /**
     * Gets the defaultPages property value. Collection of pages with the default content to display in a user flow for a specified language. This collection does not allow any kind of modification.
     * @return a userFlowLanguagePage
     */
    @javax.annotation.Nullable
    public java.util.List<UserFlowLanguagePage> getDefaultPages() {
        return this.defaultPages;
    }
    /**
     * Gets the displayName property value. The language name to display. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the overridesPages property value. Collection of pages with the overrides messages to display in a user flow for a specified language. This collection only allows to modify the content of the page, any other modification is not allowed (creation or deletion of pages).
     * @return a userFlowLanguagePage
     */
    @javax.annotation.Nullable
    public java.util.List<UserFlowLanguagePage> getOverridesPages() {
        return this.overridesPages;
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
        writer.writeCollectionOfObjectValues("defaultPages", this.getDefaultPages());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeCollectionOfObjectValues("overridesPages", this.getOverridesPages());
    }
    /**
     * Sets the defaultPages property value. Collection of pages with the default content to display in a user flow for a specified language. This collection does not allow any kind of modification.
     * @param value Value to set for the defaultPages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultPages(@javax.annotation.Nullable final java.util.List<UserFlowLanguagePage> value) {
        this.defaultPages = value;
    }
    /**
     * Sets the displayName property value. The language name to display. This property is read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether the language is enabled within the user flow.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the overridesPages property value. Collection of pages with the overrides messages to display in a user flow for a specified language. This collection only allows to modify the content of the page, any other modification is not allowed (creation or deletion of pages).
     * @param value Value to set for the overridesPages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOverridesPages(@javax.annotation.Nullable final java.util.List<UserFlowLanguagePage> value) {
        this.overridesPages = value;
    }
}
