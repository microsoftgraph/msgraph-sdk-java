package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationJobApplicationParameters implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The identifier of the synchronizationRule to be applied. This rule ID is defined in the schema for a given synchronization job or template.
     */
    private String ruleId;
    /**
     * The identifiers of one or more objects to which a synchronizationJob is to be applied.
     */
    private java.util.List<SynchronizationJobSubject> subjects;
    /**
     * Instantiates a new synchronizationJobApplicationParameters and sets the default values.
     */
    public SynchronizationJobApplicationParameters() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationJobApplicationParameters
     */
    @jakarta.annotation.Nonnull
    public static SynchronizationJobApplicationParameters createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationJobApplicationParameters();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("ruleId", (n) -> { this.setRuleId(n.getStringValue()); });
        deserializerMap.put("subjects", (n) -> { this.setSubjects(n.getCollectionOfObjectValues(SynchronizationJobSubject::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the ruleId property value. The identifier of the synchronizationRule to be applied. This rule ID is defined in the schema for a given synchronization job or template.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRuleId() {
        return this.ruleId;
    }
    /**
     * Gets the subjects property value. The identifiers of one or more objects to which a synchronizationJob is to be applied.
     * @return a synchronizationJobSubject
     */
    @jakarta.annotation.Nullable
    public java.util.List<SynchronizationJobSubject> getSubjects() {
        return this.subjects;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("ruleId", this.getRuleId());
        writer.writeCollectionOfObjectValues("subjects", this.getSubjects());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the ruleId property value. The identifier of the synchronizationRule to be applied. This rule ID is defined in the schema for a given synchronization job or template.
     * @param value Value to set for the ruleId property.
     */
    public void setRuleId(@jakarta.annotation.Nullable final String value) {
        this.ruleId = value;
    }
    /**
     * Sets the subjects property value. The identifiers of one or more objects to which a synchronizationJob is to be applied.
     * @param value Value to set for the subjects property.
     */
    public void setSubjects(@jakarta.annotation.Nullable final java.util.List<SynchronizationJobSubject> value) {
        this.subjects = value;
    }
}
