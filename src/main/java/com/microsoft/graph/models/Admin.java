package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Admin implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A container for Microsoft Edge resources. Read-only.
     */
    private Edge edge;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * A container for service communications resources. Read-only.
     */
    private ServiceAnnouncement serviceAnnouncement;
    /**
     * The sharepoint property
     */
    private Sharepoint sharepoint;
    /**
     * Instantiates a new admin and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Admin() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a admin
     */
    @javax.annotation.Nonnull
    public static Admin createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Admin();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the edge property value. A container for Microsoft Edge resources. Read-only.
     * @return a edge
     */
    @javax.annotation.Nullable
    public Edge getEdge() {
        return this.edge;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("edge", (n) -> { this.setEdge(n.getObjectValue(Edge::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("serviceAnnouncement", (n) -> { this.setServiceAnnouncement(n.getObjectValue(ServiceAnnouncement::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepoint", (n) -> { this.setSharepoint(n.getObjectValue(Sharepoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @return a serviceAnnouncement
     */
    @javax.annotation.Nullable
    public ServiceAnnouncement getServiceAnnouncement() {
        return this.serviceAnnouncement;
    }
    /**
     * Gets the sharepoint property value. The sharepoint property
     * @return a sharepoint
     */
    @javax.annotation.Nullable
    public Sharepoint getSharepoint() {
        return this.sharepoint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("edge", this.getEdge());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("serviceAnnouncement", this.getServiceAnnouncement());
        writer.writeObjectValue("sharepoint", this.getSharepoint());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the edge property value. A container for Microsoft Edge resources. Read-only.
     * @param value Value to set for the edge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdge(@javax.annotation.Nullable final Edge value) {
        this.edge = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @param value Value to set for the serviceAnnouncement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceAnnouncement(@javax.annotation.Nullable final ServiceAnnouncement value) {
        this.serviceAnnouncement = value;
    }
    /**
     * Sets the sharepoint property value. The sharepoint property
     * @param value Value to set for the sharepoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepoint(@javax.annotation.Nullable final Sharepoint value) {
        this.sharepoint = value;
    }
}
