package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryReviewTag extends Tag implements Parsable {
    /** Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.  This value controls whether the UX presents the tags as checkboxes or a radio button group. */
    private ChildSelectability _childSelectability;
    /** Returns the tags that are a child of a tag. */
    private java.util.List<EdiscoveryReviewTag> _childTags;
    /** Returns the parent tag of the specified tag. */
    private EdiscoveryReviewTag _parent;
    /**
     * Instantiates a new EdiscoveryReviewTag and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static EdiscoveryReviewTag createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryReviewTag();
    }
    /**
     * Gets the childSelectability property value. Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.  This value controls whether the UX presents the tags as checkboxes or a radio button group.
     * @return a childSelectability
     */
    @javax.annotation.Nullable
    public ChildSelectability getChildSelectability() {
        return this._childSelectability;
    }
    /**
     * Gets the childTags property value. Returns the tags that are a child of a tag.
     * @return a ediscoveryReviewTag
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getChildTags() {
        return this._childTags;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdiscoveryReviewTag currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("childSelectability", (n) -> { currentObject.setChildSelectability(n.getEnumValue(ChildSelectability.class)); });
            this.put("childTags", (n) -> { currentObject.setChildTags(n.getCollectionOfObjectValues(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
            this.put("parent", (n) -> { currentObject.setParent(n.getObjectValue(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the parent property value. Returns the parent tag of the specified tag.
     * @return a ediscoveryReviewTag
     */
    @javax.annotation.Nullable
    public EdiscoveryReviewTag getParent() {
        return this._parent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("childSelectability", this.getChildSelectability());
        writer.writeCollectionOfObjectValues("childTags", this.getChildTags());
        writer.writeObjectValue("parent", this.getParent());
    }
    /**
     * Sets the childSelectability property value. Indicates whether a single or multiple child tags can be associated with a document. Possible values are: One, Many.  This value controls whether the UX presents the tags as checkboxes or a radio button group.
     * @param value Value to set for the childSelectability property.
     * @return a void
     */
    public void setChildSelectability(@javax.annotation.Nullable final ChildSelectability value) {
        this._childSelectability = value;
    }
    /**
     * Sets the childTags property value. Returns the tags that are a child of a tag.
     * @param value Value to set for the childTags property.
     * @return a void
     */
    public void setChildTags(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this._childTags = value;
    }
    /**
     * Sets the parent property value. Returns the parent tag of the specified tag.
     * @param value Value to set for the parent property.
     * @return a void
     */
    public void setParent(@javax.annotation.Nullable final EdiscoveryReviewTag value) {
        this._parent = value;
    }
}
