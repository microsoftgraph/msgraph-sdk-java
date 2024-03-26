package com.microsoft.graph.models;

import com.microsoft.graph.models.search.Acronym;
import com.microsoft.graph.models.search.Bookmark;
import com.microsoft.graph.models.search.Qna;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchEntity extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SearchEntity} and sets the default values.
     */
    public SearchEntity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SearchEntity}
     */
    @jakarta.annotation.Nonnull
    public static SearchEntity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchEntity();
    }
    /**
     * Gets the acronyms property value. Administrative answer in Microsoft Search results to define common acronyms in an organization.
     * @return a {@link java.util.List<Acronym>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Acronym> getAcronyms() {
        return this.backingStore.get("acronyms");
    }
    /**
     * Gets the bookmarks property value. Administrative answer in Microsoft Search results for common search queries in an organization.
     * @return a {@link java.util.List<Bookmark>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Bookmark> getBookmarks() {
        return this.backingStore.get("bookmarks");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acronyms", (n) -> { this.setAcronyms(n.getCollectionOfObjectValues(Acronym::createFromDiscriminatorValue)); });
        deserializerMap.put("bookmarks", (n) -> { this.setBookmarks(n.getCollectionOfObjectValues(Bookmark::createFromDiscriminatorValue)); });
        deserializerMap.put("qnas", (n) -> { this.setQnas(n.getCollectionOfObjectValues(Qna::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the qnas property value. Administrative answer in Microsoft Search results that provide answers for specific search keywords in an organization.
     * @return a {@link java.util.List<Qna>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Qna> getQnas() {
        return this.backingStore.get("qnas");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acronyms", this.getAcronyms());
        writer.writeCollectionOfObjectValues("bookmarks", this.getBookmarks());
        writer.writeCollectionOfObjectValues("qnas", this.getQnas());
    }
    /**
     * Sets the acronyms property value. Administrative answer in Microsoft Search results to define common acronyms in an organization.
     * @param value Value to set for the acronyms property.
     */
    public void setAcronyms(@jakarta.annotation.Nullable final java.util.List<Acronym> value) {
        this.backingStore.set("acronyms", value);
    }
    /**
     * Sets the bookmarks property value. Administrative answer in Microsoft Search results for common search queries in an organization.
     * @param value Value to set for the bookmarks property.
     */
    public void setBookmarks(@jakarta.annotation.Nullable final java.util.List<Bookmark> value) {
        this.backingStore.set("bookmarks", value);
    }
    /**
     * Sets the qnas property value. Administrative answer in Microsoft Search results that provide answers for specific search keywords in an organization.
     * @param value Value to set for the qnas property.
     */
    public void setQnas(@jakarta.annotation.Nullable final java.util.List<Qna> value) {
        this.backingStore.set("qnas", value);
    }
}
