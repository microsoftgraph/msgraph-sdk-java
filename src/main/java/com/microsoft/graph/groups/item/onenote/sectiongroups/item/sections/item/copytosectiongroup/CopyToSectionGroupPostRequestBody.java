package com.microsoft.graph.groups.item.onenote.sectiongroups.item.sections.item.copytosectiongroup;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the copyToSectionGroup method. */
public class CopyToSectionGroupPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The groupId property */
    private String _groupId;
    /** The id property */
    private String _id;
    /** The renameAs property */
    private String _renameAs;
    /** The siteCollectionId property */
    private String _siteCollectionId;
    /** The siteId property */
    private String _siteId;
    /**
     * Instantiates a new copyToSectionGroupPostRequestBody and sets the default values.
     * @return a void
     */
    public CopyToSectionGroupPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a copyToSectionGroupPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CopyToSectionGroupPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopyToSectionGroupPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CopyToSectionGroupPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("groupId", (n) -> { currentObject.setGroupId(n.getStringValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("renameAs", (n) -> { currentObject.setRenameAs(n.getStringValue()); });
            this.put("siteCollectionId", (n) -> { currentObject.setSiteCollectionId(n.getStringValue()); });
            this.put("siteId", (n) -> { currentObject.setSiteId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the groupId property value. The groupId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupId() {
        return this._groupId;
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the renameAs property value. The renameAs property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRenameAs() {
        return this._renameAs;
    }
    /**
     * Gets the siteCollectionId property value. The siteCollectionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSiteCollectionId() {
        return this._siteCollectionId;
    }
    /**
     * Gets the siteId property value. The siteId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSiteId() {
        return this._siteId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("renameAs", this.getRenameAs());
        writer.writeStringValue("siteCollectionId", this.getSiteCollectionId());
        writer.writeStringValue("siteId", this.getSiteId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the groupId property value. The groupId property
     * @param value Value to set for the groupId property.
     * @return a void
     */
    public void setGroupId(@javax.annotation.Nullable final String value) {
        this._groupId = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the renameAs property value. The renameAs property
     * @param value Value to set for the renameAs property.
     * @return a void
     */
    public void setRenameAs(@javax.annotation.Nullable final String value) {
        this._renameAs = value;
    }
    /**
     * Sets the siteCollectionId property value. The siteCollectionId property
     * @param value Value to set for the siteCollectionId property.
     * @return a void
     */
    public void setSiteCollectionId(@javax.annotation.Nullable final String value) {
        this._siteCollectionId = value;
    }
    /**
     * Sets the siteId property value. The siteId property
     * @param value Value to set for the siteId property.
     * @return a void
     */
    public void setSiteId(@javax.annotation.Nullable final String value) {
        this._siteId = value;
    }
}
