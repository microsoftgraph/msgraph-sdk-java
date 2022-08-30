package com.microsoft.graph.models.termstore;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Store extends Entity implements Parsable {
    /** Default language of the term store. */
    private String _defaultLanguageTag;
    /** Collection of all groups available in the term store. */
    private java.util.List<Group> _groups;
    /** List of languages for the term store. */
    private java.util.List<String> _languageTags;
    /** Collection of all sets available in the term store. */
    private java.util.List<Set> _sets;
    /**
     * Instantiates a new store and sets the default values.
     * @return a void
     */
    public Store() {
        super();
        this.setOdataType("#microsoft.graph.termStore.store");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a store
     */
    @javax.annotation.Nonnull
    public static Store createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Store();
    }
    /**
     * Gets the defaultLanguageTag property value. Default language of the term store.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultLanguageTag() {
        return this._defaultLanguageTag;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Store currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("defaultLanguageTag", (n) -> { currentObject.setDefaultLanguageTag(n.getStringValue()); });
            this.put("groups", (n) -> { currentObject.setGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
            this.put("languageTags", (n) -> { currentObject.setLanguageTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("sets", (n) -> { currentObject.setSets(n.getCollectionOfObjectValues(Set::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groups property value. Collection of all groups available in the term store.
     * @return a group
     */
    @javax.annotation.Nullable
    public java.util.List<Group> getGroups() {
        return this._groups;
    }
    /**
     * Gets the languageTags property value. List of languages for the term store.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLanguageTags() {
        return this._languageTags;
    }
    /**
     * Gets the sets property value. Collection of all sets available in the term store.
     * @return a set
     */
    @javax.annotation.Nullable
    public java.util.List<Set> getSets() {
        return this._sets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setDefaultLanguageTag(@javax.annotation.Nullable final String value) {
        this._defaultLanguageTag = value;
    }
    /**
     * Sets the groups property value. Collection of all groups available in the term store.
     * @param value Value to set for the groups property.
     * @return a void
     */
    public void setGroups(@javax.annotation.Nullable final java.util.List<Group> value) {
        this._groups = value;
    }
    /**
     * Sets the languageTags property value. List of languages for the term store.
     * @param value Value to set for the languageTags property.
     * @return a void
     */
    public void setLanguageTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._languageTags = value;
    }
    /**
     * Sets the sets property value. Collection of all sets available in the term store.
     * @param value Value to set for the sets property.
     * @return a void
     */
    public void setSets(@javax.annotation.Nullable final java.util.List<Set> value) {
        this._sets = value;
    }
}
