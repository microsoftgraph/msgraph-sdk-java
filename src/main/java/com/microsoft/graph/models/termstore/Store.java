package com.microsoft.graph.models.termstore;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Store extends Entity implements Parsable {
    /**
     * Default language of the term store.
     */
    private String defaultLanguageTag;
    /**
     * Collection of all groups available in the term store.
     */
    private java.util.List<Group> groups;
    /**
     * List of languages for the term store.
     */
    private java.util.List<String> languageTags;
    /**
     * Collection of all sets available in the term store. This relationship can only be used to load a specific term set.
     */
    private java.util.List<Set> sets;
    /**
     * Instantiates a new store and sets the default values.
     */
    public Store() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a store
     */
    @jakarta.annotation.Nonnull
    public static Store createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Store();
    }
    /**
     * Gets the defaultLanguageTag property value. Default language of the term store.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDefaultLanguageTag() {
        return this.defaultLanguageTag;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultLanguageTag", (n) -> { this.setDefaultLanguageTag(n.getStringValue()); });
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("languageTags", (n) -> { this.setLanguageTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sets", (n) -> { this.setSets(n.getCollectionOfObjectValues(Set::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. Collection of all groups available in the term store.
     * @return a group
     */
    @jakarta.annotation.Nullable
    public java.util.List<Group> getGroups() {
        return this.groups;
    }
    /**
     * Gets the languageTags property value. List of languages for the term store.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLanguageTags() {
        return this.languageTags;
    }
    /**
     * Gets the sets property value. Collection of all sets available in the term store. This relationship can only be used to load a specific term set.
     * @return a set
     */
    @jakarta.annotation.Nullable
    public java.util.List<Set> getSets() {
        return this.sets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("defaultLanguageTag", this.getDefaultLanguageTag());
        writer.writeCollectionOfObjectValues("groups", this.getGroups());
        writer.writeCollectionOfPrimitiveValues("languageTags", this.getLanguageTags());
        writer.writeCollectionOfObjectValues("sets", this.getSets());
    }
    /**
     * Sets the defaultLanguageTag property value. Default language of the term store.
     * @param value Value to set for the defaultLanguageTag property.
     */
    public void setDefaultLanguageTag(@jakarta.annotation.Nullable final String value) {
        this.defaultLanguageTag = value;
    }
    /**
     * Sets the groups property value. Collection of all groups available in the term store.
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final java.util.List<Group> value) {
        this.groups = value;
    }
    /**
     * Sets the languageTags property value. List of languages for the term store.
     * @param value Value to set for the languageTags property.
     */
    public void setLanguageTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.languageTags = value;
    }
    /**
     * Sets the sets property value. Collection of all sets available in the term store. This relationship can only be used to load a specific term set.
     * @param value Value to set for the sets property.
     */
    public void setSets(@jakarta.annotation.Nullable final java.util.List<Set> value) {
        this.sets = value;
    }
}
