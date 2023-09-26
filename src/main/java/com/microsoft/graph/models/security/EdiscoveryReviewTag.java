package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryReviewTag extends Tag implements Parsable {
    /**
     * Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.  This value controls whether the UX presents the tags as checkboxes or a radio button group.
     */
    private ChildSelectability childSelectability;
    /**
     * Returns the tags that are a child of a tag.
     */
    private java.util.List<EdiscoveryReviewTag> childTags;
    /**
     * Returns the parent tag of the specified tag.
     */
    private EdiscoveryReviewTag parent;
    /**
     * Instantiates a new EdiscoveryReviewTag and sets the default values.
     */
    public EdiscoveryReviewTag() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoveryReviewTag");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryReviewTag
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryReviewTag createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryReviewTag();
    }
    /**
     * Gets the childSelectability property value. Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.  This value controls whether the UX presents the tags as checkboxes or a radio button group.
     * @return a ChildSelectability
     */
    @jakarta.annotation.Nullable
    public ChildSelectability getChildSelectability() {
        return this.childSelectability;
    }
    /**
     * Gets the childTags property value. Returns the tags that are a child of a tag.
     * @return a java.util.List<EdiscoveryReviewTag>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getChildTags() {
        return this.childTags;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("childSelectability", (n) -> { this.setChildSelectability(n.getEnumValue(ChildSelectability.class)); });
        deserializerMap.put("childTags", (n) -> { this.setChildTags(n.getCollectionOfObjectValues(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
        deserializerMap.put("parent", (n) -> { this.setParent(n.getObjectValue(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the parent property value. Returns the parent tag of the specified tag.
     * @return a EdiscoveryReviewTag
     */
    @jakarta.annotation.Nullable
    public EdiscoveryReviewTag getParent() {
        return this.parent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("childSelectability", this.getChildSelectability());
        writer.writeCollectionOfObjectValues("childTags", this.getChildTags());
        writer.writeObjectValue("parent", this.getParent());
    }
    /**
     * Sets the childSelectability property value. Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.  This value controls whether the UX presents the tags as checkboxes or a radio button group.
     * @param value Value to set for the childSelectability property.
     */
    public void setChildSelectability(@jakarta.annotation.Nullable final ChildSelectability value) {
        this.childSelectability = value;
    }
    /**
     * Sets the childTags property value. Returns the tags that are a child of a tag.
     * @param value Value to set for the childTags property.
     */
    public void setChildTags(@jakarta.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this.childTags = value;
    }
    /**
     * Sets the parent property value. Returns the parent tag of the specified tag.
     * @param value Value to set for the parent property.
     */
    public void setParent(@jakarta.annotation.Nullable final EdiscoveryReviewTag value) {
        this.parent = value;
    }
}
