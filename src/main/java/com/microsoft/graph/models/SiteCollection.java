package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SiteCollection implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The geographic region code for where this site collection resides. Read-only.
     */
    private String dataLocationCode;
    /**
     * The hostname for the site collection. Read-only.
     */
    private String hostname;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * If present, indicates that this is a root site collection in SharePoint. Read-only.
     */
    private Root root;
    /**
     * Instantiates a new siteCollection and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SiteCollection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a siteCollection
     */
    @jakarta.annotation.Nonnull
    public static SiteCollection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteCollection();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the dataLocationCode property value. The geographic region code for where this site collection resides. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDataLocationCode() {
        return this.dataLocationCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("dataLocationCode", (n) -> { this.setDataLocationCode(n.getStringValue()); });
        deserializerMap.put("hostname", (n) -> { this.setHostname(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("root", (n) -> { this.setRoot(n.getObjectValue(Root::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hostname property value. The hostname for the site collection. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHostname() {
        return this.hostname;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the root property value. If present, indicates that this is a root site collection in SharePoint. Read-only.
     * @return a root
     */
    @jakarta.annotation.Nullable
    public Root getRoot() {
        return this.root;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dataLocationCode", this.getDataLocationCode());
        writer.writeStringValue("hostname", this.getHostname());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("root", this.getRoot());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dataLocationCode property value. The geographic region code for where this site collection resides. Read-only.
     * @param value Value to set for the dataLocationCode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDataLocationCode(@jakarta.annotation.Nullable final String value) {
        this.dataLocationCode = value;
    }
    /**
     * Sets the hostname property value. The hostname for the site collection. Read-only.
     * @param value Value to set for the hostname property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHostname(@jakarta.annotation.Nullable final String value) {
        this.hostname = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the root property value. If present, indicates that this is a root site collection in SharePoint. Read-only.
     * @param value Value to set for the root property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoot(@jakarta.annotation.Nullable final Root value) {
        this.root = value;
    }
}
