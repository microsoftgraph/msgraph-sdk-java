package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SiteCollection implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The geographic region code for where this site collection resides. Read-only. */
    private String _dataLocationCode;
    /** The hostname for the site collection. Read-only. */
    private String _hostname;
    /** The OdataType property */
    private String _odataType;
    /** If present, indicates that this is a root site collection in SharePoint. Read-only. */
    private Root _root;
    /**
     * Instantiates a new siteCollection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SiteCollection() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.siteCollection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a siteCollection
     */
    @javax.annotation.Nonnull
    public static SiteCollection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteCollection();
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
     * Gets the dataLocationCode property value. The geographic region code for where this site collection resides. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDataLocationCode() {
        return this._dataLocationCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SiteCollection currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("dataLocationCode", (n) -> { currentObject.setDataLocationCode(n.getStringValue()); });
        deserializerMap.put("hostname", (n) -> { currentObject.setHostname(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("root", (n) -> { currentObject.setRoot(n.getObjectValue(Root::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the hostname property value. The hostname for the site collection. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHostname() {
        return this._hostname;
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
     * Gets the root property value. If present, indicates that this is a root site collection in SharePoint. Read-only.
     * @return a root
     */
    @javax.annotation.Nullable
    public Root getRoot() {
        return this._root;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dataLocationCode", this.getDataLocationCode());
        writer.writeStringValue("hostname", this.getHostname());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("root", this.getRoot());
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
     * Sets the dataLocationCode property value. The geographic region code for where this site collection resides. Read-only.
     * @param value Value to set for the dataLocationCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataLocationCode(@javax.annotation.Nullable final String value) {
        this._dataLocationCode = value;
    }
    /**
     * Sets the hostname property value. The hostname for the site collection. Read-only.
     * @param value Value to set for the hostname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostname(@javax.annotation.Nullable final String value) {
        this._hostname = value;
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
     * Sets the root property value. If present, indicates that this is a root site collection in SharePoint. Read-only.
     * @param value Value to set for the root property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoot(@javax.annotation.Nullable final Root value) {
        this._root = value;
    }
}
