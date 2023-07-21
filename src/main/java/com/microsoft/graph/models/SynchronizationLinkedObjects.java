package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationLinkedObjects implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The manager property
     */
    private SynchronizationJobSubject manager;
    /**
     * All group members that you would like to provision.
     */
    private java.util.List<SynchronizationJobSubject> members;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The owners property
     */
    private java.util.List<SynchronizationJobSubject> owners;
    /**
     * Instantiates a new synchronizationLinkedObjects and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationLinkedObjects() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationLinkedObjects
     */
    @javax.annotation.Nonnull
    public static SynchronizationLinkedObjects createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationLinkedObjects();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("manager", (n) -> { this.setManager(n.getObjectValue(SynchronizationJobSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(SynchronizationJobSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("owners", (n) -> { this.setOwners(n.getCollectionOfObjectValues(SynchronizationJobSubject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the manager property value. The manager property
     * @return a synchronizationJobSubject
     */
    @javax.annotation.Nullable
    public SynchronizationJobSubject getManager() {
        return this.manager;
    }
    /**
     * Gets the members property value. All group members that you would like to provision.
     * @return a synchronizationJobSubject
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationJobSubject> getMembers() {
        return this.members;
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
     * Gets the owners property value. The owners property
     * @return a synchronizationJobSubject
     */
    @javax.annotation.Nullable
    public java.util.List<SynchronizationJobSubject> getOwners() {
        return this.owners;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("manager", this.getManager());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
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
     * Sets the manager property value. The manager property
     * @param value Value to set for the manager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManager(@javax.annotation.Nullable final SynchronizationJobSubject value) {
        this.manager = value;
    }
    /**
     * Sets the members property value. All group members that you would like to provision.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<SynchronizationJobSubject> value) {
        this.members = value;
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
     * Sets the owners property value. The owners property
     * @param value Value to set for the owners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwners(@javax.annotation.Nullable final java.util.List<SynchronizationJobSubject> value) {
        this.owners = value;
    }
}
