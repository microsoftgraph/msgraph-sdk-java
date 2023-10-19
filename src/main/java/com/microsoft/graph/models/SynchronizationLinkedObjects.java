package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
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
     * Instantiates a new SynchronizationLinkedObjects and sets the default values.
     */
    public SynchronizationLinkedObjects() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SynchronizationLinkedObjects
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationLinkedObjects createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationLinkedObjects();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a SynchronizationJobSubject
     */
    @jakarta.annotation.Nullable
    public SynchronizationJobSubject getManager() {
        return this.manager;
    }
    /**
     * Gets the members property value. All group members that you would like to provision.
     * @return a java.util.List<SynchronizationJobSubject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationJobSubject> getMembers() {
        return this.members;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the owners property value. The owners property
     * @return a java.util.List<SynchronizationJobSubject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationJobSubject> getOwners() {
        return this.owners;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("manager", this.getManager());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the manager property value. The manager property
     * @param value Value to set for the manager property.
     */
    public void setManager(@jakarta.annotation.Nullable final SynchronizationJobSubject value) {
        this.manager = value;
    }
    /**
     * Sets the members property value. All group members that you would like to provision.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<SynchronizationJobSubject> value) {
        this.members = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the owners property value. The owners property
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<SynchronizationJobSubject> value) {
        this.owners = value;
    }
}
