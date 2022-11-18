package com.microsoft.graph.models;

import com.microsoft.graph.models.DocumentSetVersion;
import com.microsoft.graph.models.DriveItemVersion;
import com.microsoft.graph.models.ListItemVersion;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class BaseItemVersion extends Entity implements Parsable {
    /** Identity of the user which last modified the version. Read-only. */
    private IdentitySet _lastModifiedBy;
    /** Date and time the version was last modified. Read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Indicates the publication status of this particular version. Read-only. */
    private PublicationFacet _publication;
    /**
     * Instantiates a new baseItemVersion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BaseItemVersion() {
        super();
        this.setOdataType("#microsoft.graph.baseItemVersion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a baseItemVersion
     */
    @javax.annotation.Nonnull
    public static BaseItemVersion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.documentSetVersion": return new DocumentSetVersion();
                case "#microsoft.graph.driveItemVersion": return new DriveItemVersion();
                case "#microsoft.graph.listItemVersion": return new ListItemVersion();
            }
        }
        return new BaseItemVersion();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BaseItemVersion currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("publication", (n) -> { currentObject.setPublication(n.getObjectValue(PublicationFacet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user which last modified the version. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time the version was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the publication property value. Indicates the publication status of this particular version. Read-only.
     * @return a publicationFacet
     */
    @javax.annotation.Nullable
    public PublicationFacet getPublication() {
        return this._publication;
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
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("publication", this.getPublication());
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user which last modified the version. Read-only.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time the version was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the publication property value. Indicates the publication status of this particular version. Read-only.
     * @param value Value to set for the publication property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublication(@javax.annotation.Nullable final PublicationFacet value) {
        this._publication = value;
    }
}
