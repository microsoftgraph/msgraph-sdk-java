package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemReference implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Unique identifier of the drive instance that contains the item. Read-only. */
    private String _driveId;
    /** Identifies the type of drive. See [drive][] resource for values. */
    private String _driveType;
    /** Unique identifier of the item in the drive. Read-only. */
    private String _id;
    /** The name of the item being referenced. Read-only. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** Path that can be used to navigate to the item. Read-only. */
    private String _path;
    /** A unique identifier for a shared resource that can be accessed via the [Shares][] API. */
    private String _shareId;
    /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
    private SharepointIds _sharepointIds;
    /** For OneDrive for Business and SharePoint, this property represents the ID of the site that contains the parent document library of the driveItem resource. The value is the same as the id property of that [site][] resource. It is an opaque string that consists of three identifiers of the site. For OneDrive, this property is not populated. */
    private String _siteId;
    /**
     * Instantiates a new itemReference and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ItemReference() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.itemReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemReference
     */
    @javax.annotation.Nonnull
    public static ItemReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemReference();
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
     * Gets the driveId property value. Unique identifier of the drive instance that contains the item. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDriveId() {
        return this._driveId;
    }
    /**
     * Gets the driveType property value. Identifies the type of drive. See [drive][] resource for values.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDriveType() {
        return this._driveType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ItemReference currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(9) {{
            this.put("driveId", (n) -> { currentObject.setDriveId(n.getStringValue()); });
            this.put("driveType", (n) -> { currentObject.setDriveType(n.getStringValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("path", (n) -> { currentObject.setPath(n.getStringValue()); });
            this.put("shareId", (n) -> { currentObject.setShareId(n.getStringValue()); });
            this.put("sharepointIds", (n) -> { currentObject.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
            this.put("siteId", (n) -> { currentObject.setSiteId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. Unique identifier of the item in the drive. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the name property value. The name of the item being referenced. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the path property value. Path that can be used to navigate to the item. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPath() {
        return this._path;
    }
    /**
     * Gets the shareId property value. A unique identifier for a shared resource that can be accessed via the [Shares][] API.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShareId() {
        return this._shareId;
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a sharepointIds
     */
    @javax.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this._sharepointIds;
    }
    /**
     * Gets the siteId property value. For OneDrive for Business and SharePoint, this property represents the ID of the site that contains the parent document library of the driveItem resource. The value is the same as the id property of that [site][] resource. It is an opaque string that consists of three identifiers of the site. For OneDrive, this property is not populated.
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("driveId", this.getDriveId());
        writer.writeStringValue("driveType", this.getDriveType());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("path", this.getPath());
        writer.writeStringValue("shareId", this.getShareId());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeStringValue("siteId", this.getSiteId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the driveId property value. Unique identifier of the drive instance that contains the item. Read-only.
     * @param value Value to set for the driveId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriveId(@javax.annotation.Nullable final String value) {
        this._driveId = value;
    }
    /**
     * Sets the driveType property value. Identifies the type of drive. See [drive][] resource for values.
     * @param value Value to set for the driveType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriveType(@javax.annotation.Nullable final String value) {
        this._driveType = value;
    }
    /**
     * Sets the id property value. Unique identifier of the item in the drive. Read-only.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the name property value. The name of the item being referenced. Read-only.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the path property value. Path that can be used to navigate to the item. Read-only.
     * @param value Value to set for the path property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPath(@javax.annotation.Nullable final String value) {
        this._path = value;
    }
    /**
     * Sets the shareId property value. A unique identifier for a shared resource that can be accessed via the [Shares][] API.
     * @param value Value to set for the shareId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShareId(@javax.annotation.Nullable final String value) {
        this._shareId = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this._sharepointIds = value;
    }
    /**
     * Sets the siteId property value. For OneDrive for Business and SharePoint, this property represents the ID of the site that contains the parent document library of the driveItem resource. The value is the same as the id property of that [site][] resource. It is an opaque string that consists of three identifiers of the site. For OneDrive, this property is not populated.
     * @param value Value to set for the siteId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteId(@javax.annotation.Nullable final String value) {
        this._siteId = value;
    }
}
