package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BaseEndUserNotification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The default language for the end user notification.
     */
    private String defaultLanguage;
    /**
     * The endUserNotification property
     */
    private EndUserNotification endUserNotification;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new BaseEndUserNotification and sets the default values.
     */
    public BaseEndUserNotification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BaseEndUserNotification
     */
    @jakarta.annotation.Nonnull
    public static BaseEndUserNotification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.positiveReinforcementNotification": return new PositiveReinforcementNotification();
                case "#microsoft.graph.simulationNotification": return new SimulationNotification();
                case "#microsoft.graph.trainingReminderNotification": return new TrainingReminderNotification();
            }
        }
        return new BaseEndUserNotification();
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
     * Gets the defaultLanguage property value. The default language for the end user notification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }
    /**
     * Gets the endUserNotification property value. The endUserNotification property
     * @return a EndUserNotification
     */
    @jakarta.annotation.Nullable
    public EndUserNotification getEndUserNotification() {
        return this.endUserNotification;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("defaultLanguage", (n) -> { this.setDefaultLanguage(n.getStringValue()); });
        deserializerMap.put("endUserNotification", (n) -> { this.setEndUserNotification(n.getObjectValue(EndUserNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultLanguage", this.getDefaultLanguage());
        writer.writeObjectValue("endUserNotification", this.getEndUserNotification());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the defaultLanguage property value. The default language for the end user notification.
     * @param value Value to set for the defaultLanguage property.
     */
    public void setDefaultLanguage(@jakarta.annotation.Nullable final String value) {
        this.defaultLanguage = value;
    }
    /**
     * Sets the endUserNotification property value. The endUserNotification property
     * @param value Value to set for the endUserNotification property.
     */
    public void setEndUserNotification(@jakarta.annotation.Nullable final EndUserNotification value) {
        this.endUserNotification = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
