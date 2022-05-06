package microsoft.graph.models.termstore;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class Group extends Entity implements Parsable {
    /** Date and time of the group creation. Read-only.  */
    private OffsetDateTime _createdDateTime;
    /** Description that gives details on the term usage.  */
    private String _description;
    /** Name of the group.  */
    private String _displayName;
    /** ID of the parent site of this group.  */
    private String _parentSiteId;
    /** Returns the type of the group. Possible values are global, system, and siteCollection.  */
    private TermGroupScope _scope;
    /** All sets under the group in a term [store].  */
    private java.util.List<Set> _sets;
    /**
     * Instantiates a new group and sets the default values.
     * @return a void
     */
    public Group() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a group
     */
    @javax.annotation.Nonnull
    public static Group createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Group();
    }
    /**
     * Gets the createdDateTime property value. Date and time of the group creation. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description that gives details on the term usage.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Name of the group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Group currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("parentSiteId", (n) -> { currentObject.setParentSiteId(n.getStringValue()); });
            this.put("scope", (n) -> { currentObject.setScope(n.getEnumValue(TermGroupScope.class)); });
            this.put("sets", (n) -> { currentObject.setSets(n.getCollectionOfObjectValues(Set::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the parentSiteId property value. ID of the parent site of this group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentSiteId() {
        return this._parentSiteId;
    }
    /**
     * Gets the scope property value. Returns the type of the group. Possible values are global, system, and siteCollection.
     * @return a termGroupScope
     */
    @javax.annotation.Nullable
    public TermGroupScope getScope() {
        return this._scope;
    }
    /**
     * Gets the sets property value. All sets under the group in a term [store].
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("parentSiteId", this.getParentSiteId());
        writer.writeEnumValue("scope", this.getScope());
        writer.writeCollectionOfObjectValues("sets", this.getSets());
    }
    /**
     * Sets the createdDateTime property value. Date and time of the group creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description that gives details on the term usage.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Name of the group.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the parentSiteId property value. ID of the parent site of this group.
     * @param value Value to set for the parentSiteId property.
     * @return a void
     */
    public void setParentSiteId(@javax.annotation.Nullable final String value) {
        this._parentSiteId = value;
    }
    /**
     * Sets the scope property value. Returns the type of the group. Possible values are global, system, and siteCollection.
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final TermGroupScope value) {
        this._scope = value;
    }
    /**
     * Sets the sets property value. All sets under the group in a term [store].
     * @param value Value to set for the sets property.
     * @return a void
     */
    public void setSets(@javax.annotation.Nullable final java.util.List<Set> value) {
        this._sets = value;
    }
}
