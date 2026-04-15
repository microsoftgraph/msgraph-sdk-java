package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProfileSource extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ProfileSource} and sets the default values.
     */
    public ProfileSource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProfileSource}
     */
    @jakarta.annotation.Nonnull
    public static ProfileSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProfileSource();
    }
    /**
     * Gets the displayName property value. Name of the profile source intended to inform users about the profile source name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        deserializerMap.put("localizations", (n) -> { this.setLocalizations(n.getCollectionOfObjectValues(ProfileSourceLocalization::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kind property value. Type of the profile source.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKind() {
        return this.backingStore.get("kind");
    }
    /**
     * Gets the localizations property value. Alternative localized labels specified by an administrator.
     * @return a {@link java.util.List<ProfileSourceLocalization>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProfileSourceLocalization> getLocalizations() {
        return this.backingStore.get("localizations");
    }
    /**
     * Gets the sourceId property value. Profile source identifier used as an alternate key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.backingStore.get("sourceId");
    }
    /**
     * Gets the webUrl property value. Web URL of the profile source that directs users to the page view of the profile data.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("kind", this.getKind());
        writer.writeCollectionOfObjectValues("localizations", this.getLocalizations());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the displayName property value. Name of the profile source intended to inform users about the profile source name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the kind property value. Type of the profile source.
     * @param value Value to set for the kind property.
     */
    public void setKind(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kind", value);
    }
    /**
     * Sets the localizations property value. Alternative localized labels specified by an administrator.
     * @param value Value to set for the localizations property.
     */
    public void setLocalizations(@jakarta.annotation.Nullable final java.util.List<ProfileSourceLocalization> value) {
        this.backingStore.set("localizations", value);
    }
    /**
     * Sets the sourceId property value. Profile source identifier used as an alternate key.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceId", value);
    }
    /**
     * Sets the webUrl property value. Web URL of the profile source that directs users to the page view of the profile data.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
